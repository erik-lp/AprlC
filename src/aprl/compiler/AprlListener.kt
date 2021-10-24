package aprl.compiler

import aprl.AprlParser
import aprl.AprlParserBaseListener
import aprl.compiler.jvm.*
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl
import java.io.File
import java.lang.reflect.Modifier as JModifier
import java.lang.reflect.Parameter
import java.lang.reflect.ParameterizedType
import java.lang.reflect.WildcardType
import java.util.*
import javax.swing.plaf.nimbus.State
import java.lang.reflect.Constructor as JConstructor
import java.lang.reflect.Type as JType

class AprlListener(private val fileName: String, targetDir: File?) : AprlParserBaseListener() {
    
    companion object {
        private const val SUFFIX = "java"
    }
    
    private val simpleName = fileName.substringAfterLast(File.separator)
    
    // if there are standalone function(s)/property(ies)/extension(s), an enclosing class is needed
    private var enclosingClassRequired = false
        private set(new) {
            field = new
            enclosingClass = if (new) Clazz(fileName) else null
        }
    
    // fileName if an enclosing class is required (see enclosingClassRequired), null otherwise
    private var enclosingClass: Clazz? = null
    
    // if there is a targetDir, use it; source folder otherwise
    private val outputFileName = targetDir?.let { it.path + File.separator + fileName.substringAfterLast(File.separator) }
        ?: fileName.replaceAfterLast(".", SUFFIX)
    
    private val namespace = Namespace()
    private val imports = mutableListOf<Import>()
    
    private val topLevelObjects = mutableListOf<TopLevelObject>()
    
    fun compile() {}
    
    override fun enterNamespaceHeader(ctx: AprlParser.NamespaceHeaderContext) {
        val pos = ctx.identifier().position
        val namespaceMatchesLocation = namespaceMatchesLocation(ctx)
        if (!namespaceMatchesLocation) {
            WARN(simpleName, pos, "Namespace does not match file location")
        }
        namespace.addAll(ctx.identifier().simpleIdentifier().map { it.text })
        namespace.freeze()
    }
    
    /**
     * Checks if the given namespace matches the file location of the current file.
     *
     * For example:
     *
     * - namespace *example*, file *.../example/Example.aprl* → `true`
     * - namespace *other*, file *.../example/Example.arl* → `false`
     * - namespace *test.example*, file *.../test/example/Example.aprl* → `true`
     */
    private fun namespaceMatchesLocation(ctx: AprlParser.NamespaceHeaderContext): Boolean {
        val identifier = ctx.identifier()
        val simpleIdentifiers = identifier.simpleIdentifier().reversedMutable()
        val subFolders = LinkedList(fileName.split(File.separator).reversed()).also { it.pop() }
        for (id in simpleIdentifiers) {
            if (id.Identifier().symbol.text != subFolders.pop()) {
                return false
            }
        }
        return true
    }
    
    override fun enterImportHeader(ctx: AprlParser.ImportHeaderContext) {
        for (importIdentifier in ctx.importIdentifier()) {
            parseImportIdentifier(importIdentifier)
        }
        val loadThis = aprl.lang.Function0 { 6 }
        imports.add(Import().also { it.pkg = loadPackage("java.lang") ?: throw InternalError("Package java.lang not found in classpath") })
        imports.add(Import().also { it.pkg = loadPackage("aprl.lang") ?: throw InternalError("Package aprl.lang not found in classpath") })
    }
    
    /**
     * Parses and the given import identifier, adding all the resulting imports to the [imports list][imports].
     *
     * @param[ctx] The import identifier to be parsed
     *
     * @throws Error If a reference can't be resolved
     */
    private fun parseImportIdentifier(ctx: AprlParser.ImportIdentifierContext) {
        if (ctx.singleImport() != null) { // alias import (import foo.b as a)
            val singleImport = ctx.singleImport()
            parseSingleImport(singleImport.identifier(), singleImport.importAlias())
        } else {
            if (ctx.PERIOD() == null) { // plain import (import foo.a)
                parseSingleImport(ctx.identifier(), null)
            } else {
                if (ctx.MUL() != null) { // all-import (using foo.*)
                    parseAllImport(ctx.identifier())
                } else {
                    if (ctx.subImportIdentifier().size > 1) { // multiple import (using foo.[a, b])
                        val elementsInBrackets = mutableListOf<Pair<AprlParser.SimpleIdentifierContext, AprlParser.ImportAliasContext?>>()
                        for (subImportIdentifier in ctx.subImportIdentifier()) {
                            elementsInBrackets.add(Pair(subImportIdentifier.simpleIdentifier(), subImportIdentifier.importAlias()))
                        }
                        parseMultiImport(ctx.identifier(), elementsInBrackets)
                    } else { // redundant brackets (using foo.[a])
                        val identifierPosition = ctx.subImportIdentifier(0).position
                        val bracketPosition = Pair(identifierPosition.first, identifierPosition.second - 1)
                        WARN(simpleName, bracketPosition, "Redundant brackets")
                        val allIdentifiers = ctx.identifier().simpleIdentifier() + ctx.subImportIdentifier(0).simpleIdentifier()
                        parseSingleImport(allIdentifiers, ctx.subImportIdentifier(0).importAlias())
                    }
                }
            }
        }
    }
    
    /**
     * Parses an "all-import" (e.g. using *aprl.`*`*; using *aprl.annotation.AnnotationTarget.`*`*), adding all the resulting imports to the [imports list][imports].
     *
     * @param[identifier] The identifier on the left-hand side of the all-import
     *
     * @throws Error If a reference can't be resolved
     */
    private fun parseAllImport(identifier: AprlParser.IdentifierContext) {
        val importIdentifier = identifier.simpleIdentifier().joinToString(".") { it.text }
        val pkg = loadPackage(importIdentifier)
        val clazz = loadCompleteClass(importIdentifier)
        if (pkg != null) {
            if (imports.any { it.pkg == pkg }) {
                WARN(simpleName, identifier.position, "Redundant import")
            }
            imports.add(Import().also { it.pkg = pkg })
        } else if (clazz != null) {
            importEverything(clazz)
        } else {
            UNRESOLVED_REFERENCE(identifier.simpleIdentifier())
        }
    }
    
    /**
     * When known that an error is caused by an unresolved reference, [this function][UNRESOLVED_REFERENCE]
     * can be used to throw an [Error] at the actual reference that cannot be resolved.
     *
     * @param[identifiers] The identifiers, at least one of which cannot be resolved
     *
     * @throws Error Always throws an [Error]
     */
    @Throws(Error::class)
    @Suppress("FunctionName")
    private fun UNRESOLVED_REFERENCE(identifiers: List<AprlParser.SimpleIdentifierContext>): Nothing {
        val error = faultyIdentifier(identifiers)
        throw Error(simpleName, error.position, "Unresolved reference: '${error.text}'")
    }
    
    /**
     * Imports all members (classes, methods, fields) of a class into the [imports list][imports].
     *
     * @param[from] The class to be imported from
     */
    private fun importEverything(from: Class<*>) {
        from.classes.forEach { clazz -> imports.add(Import().also { it.clazz = clazz }) }
        from.methods.forEach { method -> imports.add(Import().also { it.method = method }) }
        from.fields.forEach { field -> imports.add(Import().also { it.field = field }) }
    }
    
    /**
     * Parses a "multi-import" (e.g. using java.util.`[`List, Map`]`), adding the resulting imports to the [imports list][imports].
     *
     * @param[identifier] The identifier on the left-hand side of the multi-import
     * @param[elements] The identifiers and corresponding aliases on the right-hand side of the multi-import
     *
     * @throws Error If a reference can't be resolved
     */
    private fun parseMultiImport(identifier: AprlParser.IdentifierContext, elements: List<Pair<AprlParser.SimpleIdentifierContext, AprlParser.ImportAliasContext?>>) {
        val importIdentifier = identifier.simpleIdentifier().joinToString(".") { it.text }
        val pkg = loadPackage(importIdentifier)
        val clazz = loadCompleteClass(importIdentifier)
        if (pkg != null) {
            importMultipleFromPackage(pkg, elements)
        } else if (clazz != null) {
            importMultipleFromClass(clazz, elements)
        } else {
            UNRESOLVED_REFERENCE(identifier.simpleIdentifier())
        }
    }
    
    /**
     * Imports multiple elements (from a [multi-import][parseMultiImport]) from a package.
     *
     * @param[from] The package to be imported from
     * @param[elements] The identifiers and corresponding aliases on the right-hand side of the multi-import
     *
     * @throws Error If a reference can't be resolved
     */
    private fun importMultipleFromPackage(from: Package, elements: List<Pair<AprlParser.SimpleIdentifierContext, AprlParser.ImportAliasContext?>>) {
        val pkg = from.name
        for ((subIdentifier, alias) in elements) {
            val aliasString = alias?.simpleIdentifier()?.text
            val clazz = loadCompleteClass("$pkg.${subIdentifier.text}") ?: throw Error(simpleName, subIdentifier.position, "Unresolved reference: '${subIdentifier.text}'")
            if (imports.any { it.clazz == clazz && it.alias == aliasString }) {
                WARN(simpleName, subIdentifier.position, "Redundant import")
            }
            if (clazz.simpleName == aliasString) {
                WARN(simpleName, alias!!.position, "Redundant import alias")
            }
            imports.add(Import().also { it.clazz = clazz; it.alias = aliasString })
        }
    }
    
    /**
     * Imports multiple elements (from a [multi-import][parseMultiImport]) from a class.
     *
     * @param[from] The class to be imported from
     * @param[elements] The identifiers and corresponding aliases on the right-hand side of the multi-import
     *
     * @throws Error If a reference can't be resolved
     */
    private fun importMultipleFromClass(from: Class<*>, elements: List<Pair<AprlParser.SimpleIdentifierContext, AprlParser.ImportAliasContext?>>) {
        for ((subIdentifier, alias) in elements) {
            addValidImports(from, subIdentifier, alias)
        }
    }
    
    /**
     * Imports methods and/or fields in the given class by the given name with the given alias
     *
     * @param[clazz] The class to be imported from
     * @param[identifier] The name of the method and/or field to be imported
     * @param[alias] The alias to be given to the import
     *
     * @throws Error If the reference can't be resolved
     * @throws Error If a distinct field by the same name is already imported
     */
    private fun addValidImports(clazz: Class<*>, identifier: AprlParser.SimpleIdentifierContext, alias: AprlParser.ImportAliasContext?) {
        val method = loadMethod(clazz, identifier.text)
        val field = loadField(clazz, identifier.text)
        if (method != null) {
            if (imports.any { it.method == method }) {
                WARN(simpleName, identifier.position, "Redundant import")
            }
            imports.add(Import().also { it.method = method; it.alias = alias?.simpleIdentifier()?.text })
        }
        if (field != null) {
            if (imports.any { it.field?.name == field.name && it.field != field }) {
                throw Error(simpleName, identifier.position, "Field by name '${field.name}' is already defined in an import")
            }
            if (imports.any { it.field == field }) {
                WARN(simpleName, identifier.position, "Redundant import")
            }
            imports.add(Import().also { it.field = field; it.alias = alias?.simpleIdentifier()?.text })
        }
        if (method == null && field == null) {
            throw Error(simpleName, identifier.position, "Unresolved reference: '${identifier.text}'")
        }
        if (identifier.text == alias?.simpleIdentifier()?.text) {
            WARN(simpleName, alias!!.position, "Redundant import alias")
        }
    }
    
    /**
     * Parses a regular single-import with the given identifier, and assigns it the given alias
     *
     * @param[identifier] The identifier to be imported
     * @param[importAlias] The alias to be given to the import
     *
     * @throws Error If the reference can't be resolved
     */
    private fun parseSingleImport(identifier: AprlParser.IdentifierContext, importAlias: AprlParser.ImportAliasContext?) {
        parseSingleImport(identifier.simpleIdentifier(), importAlias)
    }
    
    /**
     * Parses a regular single-import with the given identifiers, and assigns it the given alias
     *
     * @param[identifiers] The identifier list to be imported
     * @param[importAlias] The alias to be given to the import
     *
     * @throws Error If the reference can't be resolved
     */
    private fun parseSingleImport(identifiers: List<AprlParser.SimpleIdentifierContext>, importAlias: AprlParser.ImportAliasContext?) {
        val importIdentifier = identifiers.joinToString(".") { it.text }
        val alias = importAlias?.simpleIdentifier()?.text
        val pkg = loadPackage(importIdentifier)
        val clazz = loadCompleteClass(importIdentifier)
        if (pkg != null) {
            throw Error(simpleName, identifiers[0].position, "Namespaces cannot be imported")
        } else if (clazz != null) {
            if (imports.any { it.clazz == clazz && it.alias == alias }) {
                WARN(simpleName, identifiers[0].position, "Redundant import")
            }
            if (clazz.simpleName == alias) {
                WARN(simpleName, importAlias!!.position, "Redundant import alias")
            }
            imports.add(Import().also { it.clazz = clazz; it.alias = alias })
        } else {
            val last = identifiers.last()
            val possibleClass = loadCompleteClass(identifiers.dropLast(1).joinToString(".") { it.text })
                ?: throw Error(simpleName, last.position, "Unresolved reference: '${last.text}'")
            addValidImports(possibleClass, last, importAlias)
        }
    }
    
    override fun enterTopLevelObject(ctx: AprlParser.TopLevelObjectContext) {
        val clazz = ctx.classDeclaration()
        val inter = ctx.interfaceDeclaration()
        val annotation = ctx.annotationDeclaration()
        val document = ctx.documentDeclaration()
        val struct = ctx.structDeclaration()
        val enum = ctx.enumDeclaration()
        val extension = ctx.extensionDeclaration()
        val function = ctx.functionDeclaration()
        val property = ctx.propertyDeclaration()
        if (clazz != null) {
            parseTopLevelClass(clazz)
        } else if (inter != null) {
            parseTopLevelInterface(inter)
        } else if (annotation != null) {
            parseTopLevelAnnotation(annotation)
        } else if (document != null) {
            parseTopLevelDocument(document)
        } else if (struct != null) {
            parseTopLevelStruct(struct)
        } else if (enum != null) {
            parseTopLevelEnum(enum)
        } else if (extension != null) {
            parseTopLevelExtension(extension)
        } else if (function != null) {
            parseTopLevelFunction(function)
        } else if (property != null) {
            parseTopLevelProperty(property)
        } else {
            throw InternalError("Expected TopLevelObjectContext ($ctx) to be class-, interface-, annotation-, document-, struct-, extension-, function- or propertyDeclaration")
        }
    }
    
    private fun parseTopLevelClass(ctx: AprlParser.ClassDeclarationContext) {
        val clazz = Clazz(ctx.simpleIdentifier().text)
        clazz.modifiers.addAll(ctx.modifierList()?.let { modifiersFromModifierList(it) } ?: mutableListOf())
        clazz.annotations.addAll(ctx.modifierList()?.let { annotationsFromModifierList(it) } ?: mutableListOf())
        clazz.typeParameters.addAll(ctx.typeParameters()?.let { parseTypeParameters(it) } ?: mutableListOf())
        val delegations = ctx.delegationSpecifiers()
        var superConstructorCall: ValueArguments? = null
        if (delegations != null) {
            val superClasses = mutableListOf<Triple<Annotations, Class<*>, ValueArguments>>()
            for (delegation in delegations.annotatedDelegationSpecifier()) {
                val delegationSpecifier = delegation.delegationSpecifier()
                val identifier = delegationSpecifier.identifier()
                val superClass = loadImportedClass(identifier)
                val valueArguments = delegationSpecifier.valueArguments()?.let { parseValueArguments(it) }
                if (superClasses.any { it.second == superClass }) {
                    throw Error(simpleName, identifier.position, "Supertype '${superClass.simpleName}' appears twice")
                }
                checkClassExtendability(superClass, identifier.position)
                if (!superClass.isInterface) {
                    if (superClasses.any { !it.second.isInterface }) {
                        throw Error(simpleName, identifier.position, "Multiple inheritance is not allowed")
                    }
                    if (valueArguments == null) {
                        throw Error(simpleName,
                            with(identifier.simpleIdentifier().last()) { position + text.length },
                            "This type has a constructor and thus must be initialized here")
                    }
                    if (getValidConstructor(superClass.constructors, valueArguments) == null) {
                        throw Error(simpleName, delegationSpecifier.valueArguments().position, "No constructor can be called with the arguments supplied")
                    }
                    superConstructorCall = valueArguments
                }
                checkTypeArguments(superClass, delegationSpecifier.typeArguments(), false, identifier.simpleIdentifier().last())
                superClasses.add(Triple(delegation.annotations()?.let { parseAnnotations(it) } ?: mutableListOf(), superClass, valueArguments ?: mutableListOf()))
            }
        }
        // TODO: add superConstructorCall to existing constructor(s), or generate a simple constructor
        // TODO: class members
        val classMembers = mutableListOf<Any>()
        if (ctx.primaryConstructor() != null) {
            if (superConstructorCall != null) {
                classMembers.add(superCallConstructor(parseConstructor(ctx.primaryConstructor()), superConstructorCall))
            } else {
                classMembers.add(parseConstructor(ctx.primaryConstructor()))
            }
        } else {
            if (superConstructorCall != null) {
                classMembers.add(superCallConstructor(clazz, superConstructorCall))
            } else {
                classMembers.add(Constructor(clazz, mutableListOf(), mutableListOf(Modifier.PUBLIC), mutableListOf(), mutableListOf()))
            }
        }
        if (ctx.classBody()?.classMember()?.isNotEmpty() == true) { // not empty
            for (classMember in ctx.classBody().classMember()) {
                with(classMember) {
                    if (topLevelObject() != null) {
                        classMembers.add(parseInnerTopLevelObject(topLevelObject()))
                    } else if (secondaryConstructor() != null) {
                        classMembers.add(parseSecondaryConstructor(secondaryConstructor()))
                    } else if (loadScript() != null) {
                        classMembers.add(parseLoadScript(loadScript()))
                    } else if (initializerBody() != null) {
                        (classMembers[0] as Constructor).statements.addAll(parseInitializerBody(initializerBody()))
                    } else if (partnerDeclaration() != null) {
                        classMembers.addAll(parsePartnerDeclaration(partnerDeclaration()))
                    } else {
                        throw InternalError("Expected ClassMemberContext ($classMember) to have topLevelObject, secondaryConstructor, loadScript, initializerBody or partnerDeclaration")
                    }
                }
            }
        }
        topLevelObjects.add(clazz)
    }
    
    private fun parseInnerTopLevelObject(ctx: AprlParser.TopLevelObjectContext): NestedTopLevelObject {
        TODO()
    }
    
    private fun parseSecondaryConstructor(ctx: AprlParser.SecondaryConstructorContext): Constructor {
        TODO()
    }
    
    private fun parseLoadScript(ctx: AprlParser.LoadScriptContext): LoadScript {
        val statements = parseBlock(ctx.block())
        return LoadScript(statements)
    }
    
    private fun parseStatement(ctx: AprlParser.StatementContext) : MutableList<out Statement> {
        return with(ctx) {
            if (localVariableDeclaration() != null) {
                parseLocalVariableDeclaration(localVariableDeclaration())
            } else if (assignment() != null) {
                mutableListOf(parseAssignment(assignment()))
            } else if (loopStatement() != null) {
                mutableListOf(parseLoopStatement(loopStatement()))
            } else if (expression() != null) {
                mutableListOf(parseExpression(expression()))
            } else {
                throw InternalError("Expected StatementContext ($ctx) to have localVariableDeclaration, assignment, loopStatement or expression")
            }
        }
    }
    
    private fun parseAssignment(ctx: AprlParser.AssignmentContext): Assignment {
        val assignableExpression = parseAssignableExpression(ctx.assignableExpression())
        val operator = parseAssignmentOperator(ctx.assignmentOperator())
        val expression = parseExpression(ctx.expression())
        val to = evaluateAssignableExpression(assignableExpression)
        val from = evaluateExpression(expression)
        if (!isInBound(from.first, from.second, to.first, to.second)) {
            throw Error(simpleName, ctx.expression().position, "Type mismatch: Inferred type is ${from.toJava()} but ${to.toJava()} was expected")
        }
        return Assignment(assignableExpression, operator, expression)
    }
    
    private fun parseAssignableExpression(ctx: AprlParser.AssignableExpressionContext): AssignableExpression {
        if (ctx.parenthesizedAssignableExpression() != null) {
            return parseAssignableExpression(ctx.parenthesizedAssignableExpression().assignableExpression())
        }
        val expression = parseExpression(ctx.expression())
        val assignableSuffixes = ctx.assignableSuffix().mapMutable { parseAssignableSuffix(it) }
        return AssignableExpression(expression, assignableSuffixes)
    }
    
    private fun parseAssignableSuffix(ctx: AprlParser.AssignableSuffixContext): AssignableSuffix {
        return with(ctx) {
            if (indexingSuffix() != null) {
                parseIndexingSuffix(ctx.indexingSuffix())
            } else if (navigationSuffix() != null) {
                parseNavigationSuffix(navigationSuffix())
            } else {
                throw InternalError("Expected AssignableSuffixContext ($ctx) to be indexingSuffix or navigationSuffix")
            }
        }
    }
    
    private fun parseIndexingSuffix(ctx: AprlParser.IndexingSuffixContext): IndexingSuffix {
        val expressions = ctx.expression().mapMutable { parseExpression(it) }
        return IndexingSuffix(expressions)
    }
    
    private fun parseNavigationSuffix(ctx: AprlParser.NavigationSuffixContext): NavigationSuffix {
        val operator = parseMemberAccessOperator(ctx.memberAccessOperator())
        val identifier = ctx.simpleIdentifier().text
        return NavigationSuffix(operator, identifier)
    }
    
    private fun parseMemberAccessOperator(ctx: AprlParser.MemberAccessOperatorContext): NavigationSuffix.Operator {
        return with(ctx) {
            if (PERIOD() != null) {
                NavigationSuffix.Operator.PERIOD
            } else if (QUEST_PERIOD() != null) {
                NavigationSuffix.Operator.QUEST_PERIOD
            } else if (DOUBLE_COLON() != null) {
                NavigationSuffix.Operator.DOUBLE_COLON
            } else {
                throw InternalError("Expected MemberAccessOperatorContext ($ctx) to be PERIOD, QUEST_PERIOD or DOUBLE_COLON")
            }
        }
    }
    
    private fun parseLoopStatement(ctx: AprlParser.LoopStatementContext): LoopStatement {
        return with(ctx) {
            if (forStatement() != null) {
                parseForStatement(forStatement())
            } else if (whileStatement() != null) {
                parseWhileStatement(whileStatement())
            } else if (doWhileStatement() != null) {
                parseDoWhileStatement(doWhileStatement())
            } else {
                throw InternalError("Expected LoopStatementContext to be for-, while- or doWhileStatement")
            }
        }
    }
    
    private fun parseForStatement(ctx: AprlParser.ForStatementContext): ForStatement {
        val annotations = ctx.annotations()?.let { parseAnnotations(it) } ?: mutableListOf()
        val variableDeclaration = ctx.variableDeclaration()?.let { parseVariableDeclaration(it) }
        val multiVariableDeclaration = ctx.multiVariableDeclaration()?.let { parseMultiVariableDeclaration(it) }
        val expression = parseExpression(ctx.expression())
        val statements = parseBlock(ctx.block())
        return ForStatement(annotations, variableDeclaration, multiVariableDeclaration, expression, statements)
    }
    
    private fun parseWhileStatement(ctx: AprlParser.WhileStatementContext): WhileStatement {
        val expression = parseExpression(ctx.expression())
        val statements = parseBlock(ctx.block())
        return WhileStatement(expression, statements)
    }
    
    private fun parseDoWhileStatement(ctx: AprlParser.DoWhileStatementContext): DoWhileStatement {
        val statements = parseBlock(ctx.block())
        val expression = parseExpression(ctx.expression())
        return DoWhileStatement(statements, expression)
    }
    
    private fun parseAssignmentOperator(ctx: AprlParser.AssignmentOperatorContext): Assignment.Operator {
        return with(ctx) {
            if (ASSIGN() != null) {
                Assignment.Operator.ASSIGN
            } else if (DEFINE() != null) {
                Assignment.Operator.DEFINE
            } else if (ADD_ASSIGN() != null) {
                Assignment.Operator.ADD_ASSIGN
            } else if (SUB_ASSIGN() != null) {
                Assignment.Operator.SUB_ASSIGN
            } else if (MUL_ASSIGN() != null) {
                Assignment.Operator.MUL_ASSIGN
            } else if (DIV_ASSIGN() != null) {
                Assignment.Operator.DIV_ASSIGN
            } else if (MOD_ASSIGN() != null) {
                Assignment.Operator.MOD_ASSIGN
            } else if (EXP_ASSIGN() != null) {
                Assignment.Operator.EXP_ASSIGN
            } else if (CONJ_ASSIGN() != null) {
                Assignment.Operator.CONJ_ASSIGN
            } else if (DISJ_ASSIGN() != null) {
                Assignment.Operator.DISJ_ASSIGN
            } else if (XOR_ASSIGN() != null) {
                Assignment.Operator.XOR_ASSIGN
            } else if (ELVIS_ASSIGN() != null) {
                Assignment.Operator.ELVIS_ASSIGN
            } else {
                throw InternalError("Expected AssignmentOperatorContext ($ctx) to be ASSIGN, DEFINE, ADD_ASSIGN, SUB_ASSIGN, MUL_ASSIGN, DIV_ASSIGN, MOD_ASSIGN, EXP_ASSIGN, CONJ_ASSIGN, DISJ_ASSIGN, XOR_ASSIGN or ELVIS_ASSIGN")
            }
        }
    }
    
    private fun parseExpression(ctx: AprlParser.ExpressionContext): Expression {
        val disjunction = parseDisjunction(ctx.disjunction())
        return Expression(disjunction)
    }
    
    private fun parseDisjunction(ctx: AprlParser.DisjunctionContext): Disjunction {
        val conjunction = parseConjunction(ctx.conjunction(0))
        val additionalConjunctions = ctx.conjunction().drop(1).mapMutable { parseConjunction(it) }
        return Disjunction(conjunction, additionalConjunctions)
    }
    
    private fun parseConjunction(ctx: AprlParser.ConjunctionContext): Conjunction {
        val equalityComparison = parseEqualityComparison(ctx.equalityComparison(0))
        val additionalEqualityComparisons = ctx.equalityComparison().drop(1).mapMutable { parseEqualityComparison(it) }
        return Conjunction(equalityComparison, additionalEqualityComparisons)
    }
    
    private fun parseEqualityComparison(ctx: AprlParser.EqualityComparisonContext): EqualityComparison {
        val identityComparison = parseIdentityComparison(ctx.identityComparison(0))
        val additionalIdentityComparisons = ctx.identityComparison().drop(1).mapMutable { parseIdentityComparison(it) }
        return EqualityComparison(identityComparison, additionalIdentityComparisons)
    }
    
    private fun parseIdentityComparison(ctx: AprlParser.IdentityComparisonContext): IdentityComparison {
        val comparison = parseComparison(ctx.comparison(0))
        val additionalComparisons = ctx.comparison().drop(1).mapMutable { parseComparison(it) }
        return IdentityComparison(comparison, additionalComparisons)
    }
    
    private fun parseComparison(ctx: AprlParser.ComparisonContext): Comparison {
        val callExpression = parseCallExpression(ctx.callExpression(0))
        val additionalCallExpressions = ctx.callExpression().drop(1).mapIndexedMutable { i, it -> parseComparisonOperator(ctx.comparisonOperator(i)) to parseCallExpression(it) }
        return Comparison(callExpression, additionalCallExpressions)
    }
    
    private fun parseComparisonOperator(ctx: AprlParser.ComparisonOperatorContext): Comparison.Operator {
        return with(ctx) {
            if (LANGLE() != null || NRANGLE() != null) {
                Comparison.Operator.LT
            } else if (RANGLE() != null || NLANGLE() != null) {
                Comparison.Operator.GT
            } else if (LEQ() != null || NGEQ() != null) {
                Comparison.Operator.LEQ
            } else if (GEQ() != null || NLEQ() != null) {
                Comparison.Operator.GEQ
            } else if (SPACESHIP() != null) {
                Comparison.Operator.SPACESHIP
            } else {
                throw InternalError("Expected ComparisonOperatorContext ($ctx) to be LANGLE, NLANGLE, RANGLE, NRANGLE, LEQ, NLEQ, GEQ, NGEQ or SPACESHIP")
            }
        }
    }
    
    private fun parseCallExpression(ctx: AprlParser.CallExpressionContext): CallExpression {
        val namedInfix = parseNamedInfix(ctx.namedInfixExpression())
        val callSuffixes = ctx.callSuffix()?.mapMutable { parseCallSuffix(it) } ?: mutableListOf()
        return CallExpression(namedInfix, callSuffixes)
    }
    
    private fun parseCallSuffix(ctx: AprlParser.CallSuffixContext): CallSuffix {
        val typeArguments = ctx.typeArguments()?.let { parseTypeArguments(it) }
        val lambdaCallSuffix = ctx.lambdaCallSuffix()?.let { parseLambdaCallSuffix(it) }
        val valueArguments = ctx.valueArguments()?.let { parseValueArguments(it) }
        return CallSuffix(typeArguments, lambdaCallSuffix, valueArguments)
    }
    
    private fun parseLambdaCallSuffix(ctx: AprlParser.LambdaCallSuffixContext): LambdaCallSuffix {
        val valueArguments = ctx.valueArguments()?.let { parseValueArguments(it) }
        val annotatedLambda = parseAnnotatedLambda(ctx.annotatedLambda())
        return LambdaCallSuffix(valueArguments, annotatedLambda)
    }
    
    private fun parseAnnotatedLambda(ctx: AprlParser.AnnotatedLambdaContext): AnnotatedLambda {
        val annotations = ctx.annotations()?.let { parseAnnotations(it) } ?: mutableListOf()
        val label = ctx.labelDefinition()?.simpleIdentifier()?.text
        val lambdaLiteral = parseLambdaLiteral(ctx.lambdaLiteral())
        return AnnotatedLambda(annotations, label, lambdaLiteral)
    }
    
    private fun parseLambdaLiteral(ctx: AprlParser.LambdaLiteralContext) : LambdaLiteral {
        val parameters = ctx.lambdaParameters()?.lambdaParameter()?.mapMutable { parseLambdaParameter(it) } ?: mutableListOf()
        val statements = ctx.statements().statement().flatMapMutable { parseStatement(it) }
        return LambdaLiteral(parameters, statements)
    }
    
    private fun parseLambdaParameter(ctx: AprlParser.LambdaParameterContext): LambdaParameter {
        val variableDeclaration = ctx.variableDeclaration()?.let { parseVariableDeclaration(it) }
        val multiVariableDeclaration = ctx.multiVariableDeclaration()?.let { parseMultiVariableDeclaration(it) }
        val type = ctx.type()?.let { parseType(it) }
        return LambdaParameter(variableDeclaration, multiVariableDeclaration, type)
    }
    
    private fun parseVariableDeclaration(ctx: AprlParser.VariableDeclarationContext): VariableDeclaration {
        val annotations = ctx.annotations()?.let { parseAnnotations(it) } ?: mutableListOf()
        val name = ctx.simpleIdentifier().text
        val type = parseType(ctx.type())
        return VariableDeclaration(annotations, name, type)
    }
    
    private fun parseMultiVariableDeclaration(ctx: AprlParser.MultiVariableDeclarationContext): MultiVariableDeclaration {
        val variableDeclaration = parseVariableDeclaration(ctx.variableDeclaration(0))
        val additionalVariableDeclarations = ctx.variableDeclaration().drop(1).mapMutable { parseVariableDeclaration(it) }
        return MultiVariableDeclaration(variableDeclaration, additionalVariableDeclarations)
    }
    
    private fun parseNamedInfix(ctx: AprlParser.NamedInfixExpressionContext): NamedInfixExpression {
        TODO("Work out NamedInfixExpression first")
    }
    
    private fun parseLocalVariableDeclaration(ctx: AprlParser.LocalVariableDeclarationContext): MutableList<LocalVariable> {
        return with(ctx) {
            val annotations = annotations()?.let { parseAnnotations(it) } ?: mutableListOf()
            val final = CONST() != null || VAL() != null
            if (variableDeclaration() != null) {
                mutableListOf(parseLocalVariable(annotations, final, variableDeclaration(), expression()))
            } else {
                parseMultiLocalVariable(annotations, final, multiVariableDeclaration(), expression())
            }
        }
    }
    
    private fun parseLocalVariable(annotations: Annotations, final: Boolean, variableDeclaration: AprlParser.VariableDeclarationContext, expression: AprlParser.ExpressionContext?): LocalVariable {
        return parseLocalVariable(annotations, final, variableDeclaration, expression?.let { parseExpression(it) }, expression?.position)
    }
    
    private fun parseLocalVariable(annotations: Annotations, final: Boolean, variableDeclaration: AprlParser.VariableDeclarationContext, expression: Expression?, expressionPosition: Pair<Int, Int>?): LocalVariable {
        annotations.addAll(variableDeclaration.annotations()?.let { parseAnnotations(it) } ?: mutableListOf())
        val type: Pair<Class<*>, TypeArgument?>
        if (variableDeclaration.type() != null) {
            type = parseType(variableDeclaration.type()).let { Pair(it.toJavaType(), it.typeArguments) }
            if (expression != null) {
                checkType(expression, expressionPosition!!, type)
            }
        } else {
            if (expression != null) {
                type = evaluateExpression(expression)
            } else {
                throw Error(simpleName, variableDeclaration.simpleIdentifier().position, "Variable must either have a type annotation or be initialized")
            }
        }
        return LocalVariable(variableDeclaration.simpleIdentifier().text, type, final, expression)
    }
    
    private fun parseMultiLocalVariable(annotations: Annotations, final: Boolean, multiVariableDeclaration: AprlParser.MultiVariableDeclarationContext, expression: AprlParser.ExpressionContext?): MutableList<LocalVariable> {
        return multiVariableDeclaration.variableDeclaration().mapMutable { parseLocalVariable(annotations, final, it, expression) }
    }
    
    private fun checkType(expression: AprlParser.ExpressionContext, type: Pair<Class<*>, TypeArgument?>) {
        checkType(parseExpression(expression), expression.position, type)
    }
    
    private fun checkType(expression: Expression, expressionPosition: Pair<Int, Int>, type: Pair<Class<*>, TypeArgument?>) {
        with(evaluateExpression(expression)) {
            if (!isInBound(first, second, type.first, type.second)) {
                throw Error(simpleName, expressionPosition, "Type mismatch: inferred type is ${this.toJava()} but ${type.toJava()} was expected")
            }
        }
    }
    
    private fun parseInitializerBody(ctx: AprlParser.InitializerBodyContext): Statements {
        return parseBlock(ctx.block())
    }
    
    private fun parseBlock(ctx: AprlParser.BlockContext): Statements {
        return ctx.statements().statement()?.flatMapMutable { parseStatement(it) } ?: mutableListOf()
    }
    
    private fun parsePartnerDeclaration(ctx: AprlParser.PartnerDeclarationContext): MutableList<ClassMember> {
        TODO()
    }
    
    private fun superCallConstructor(baseConstructor: Constructor, superArguments: ValueArguments): Constructor {
        baseConstructor.modifiers.add(Modifier.PUBLIC)
        baseConstructor.statements.add(0, SuperCall(superArguments))
        return baseConstructor
    }
    
    private fun superCallConstructor(clazz: Clazz, superArguments: ValueArguments): Constructor {
        return Constructor(clazz, mutableListOf(), mutableListOf(Modifier.PUBLIC), mutableListOf(), mutableListOf(SuperCall(superArguments)))
    }
    
    private fun parseConstructor(ctx: AprlParser.PrimaryConstructorContext): Constructor {
        TODO("AprlListener.parseConstructor()")
    }
    
    private fun getValidConstructor(constructors: Array<JConstructor<*>>, valueArguments: ValueArguments): JConstructor<*>? {
        for (constructor in constructors) {
            if (constructor.isVarArgs) {
                if (valueArguments.size >= constructor.parameters.size - 1) { // at least as many value arguments as the parameters without varargs (varargs can be no argument at all)
                    if (constructor.parameters.dropLast(1).allIndexed { i, it -> isValidValueArgument(it, valueArguments[i]) }) {
                        if (valueArguments.drop(constructor.parameters.size - 1).all {
                                with(evaluateExpression(it.expression)) {
                                    isInBound(first, second, constructor.parameters.last().type)
                                }
                            }
                        ) {
                            return constructor
                        }
                    }
                }
            } else {
                if (constructor.parameters.size == valueArguments.size) {
                    if (isValidConstructor(constructor, valueArguments)) {
                        return constructor
                    }
                }
            }
        }
        return null
    }
    
    private fun isValidConstructor(constructor: JConstructor<*>, valueArguments: ValueArguments): Boolean {
        return constructor.parameters.allIndexed { i, it -> isValidValueArgument(it, valueArguments[i]) }
    }
    
    private fun isValidValueArgument(parameter: Parameter, valueArgument: ValueArgument): Boolean {
        return if (parameter.isVarArgs) { // this function should not be called with vararg parameters
            false
        } else {
            with(evaluateExpression(valueArgument.expression)) {
                isInBound(first, second, parameter.type)
            }
        }
    }
    
    private fun evaluateExpression(expression: Expression): Pair<Class<*>, TypeArgument?> {
        TODO()
    }
    
    private fun evaluateAssignableExpression(assignableExpression: AssignableExpression): Pair<Class<*>, TypeArgument?> {
        TODO()
    }
    
    private fun checkTypeArguments(
        clazz: Class<*>,
        typeArguments: AprlParser.TypeArgumentsContext?,
        projectionsAllowed: Boolean,
        lastIdentifier: AprlParser.SimpleIdentifierContext,
    ) {
        val superTypeParameters = clazz.typeParameters
        val b = superTypeParameters.size
        val req = if (b == 1) "One type argument" else "$b type arguments"
        if (superTypeParameters.isNotEmpty()) {
            if (typeArguments?.typeProjection()?.isNotEmpty() != true) {
                throw Error(simpleName, lastIdentifier.position + lastIdentifier.text.length, "$req expected for ${clazz.name}")
            }
            if (typeArguments.typeProjection().size != b) {
                throw Error(simpleName, typeArguments.position, "$req expected for '${clazz.name}'")
            } else {
                for ((typeProjection, superTypeParameter) in typeArguments.typeProjection().pair(superTypeParameters)) {
                    val varianceModifier = typeProjection.typeProjectionModifierList()?.typeProjectionModifier()?.firstOrNull { it.varianceModifier() != null }
                    if (typeProjection.QUEST() != null) {
                        if (!projectionsAllowed) {
                            throw Error(simpleName, typeProjection.position, "Projections are not allowed here")
                        }
                    } else if (varianceModifier != null) {
                        if (!projectionsAllowed) {
                            throw Error(simpleName, varianceModifier.position, "Projections are not allowed here")
                        }
                    } else {
                        val type: Type = parseType(typeProjection.type())
                        for (bound in superTypeParameter.bounds) {
                            if (!isInBound(type.toJavaType(), type.typeArguments, bound)) {
                                throw Error(simpleName, typeProjection.position, "Type argument is not within bounds (expected ${bound.typeName})")
                            }
                        }
                    }
                }
            }
        } else {
            if (typeArguments?.typeProjection()?.isNotEmpty() == true) {
                throw Error(simpleName, typeArguments.position, "No type arguments expected for '${clazz.name}'")
            }
        }
    }
    
    private fun isInBound(clazz: Class<*>, typeArguments: TypeArgument?, bound: JType): Boolean {
        return when (bound) {
            is Class<*> -> {
                bound.isAssignableFrom(clazz)
            }
            is ParameterizedType -> {
                val condition1 = (bound.rawType as Class<*>).isAssignableFrom(clazz)
                val condition2 = with(typeArguments?.typeProjections ?: emptyList()) {
                    val sameSize = size == bound.actualTypeArguments.size
                    val matching = allIndexed { i, typeProjection ->
                        typeProjection.wildcard || isInBound(typeProjection.type!!.toJavaType(), typeProjection.type.typeArguments, bound.actualTypeArguments[i])
                    }
                    sameSize && matching
                }
                (condition1 && condition2)
            }
            is WildcardType -> {
                val belowUpper = bound.upperBounds.all { isInBound(clazz, typeArguments, it) }
                val aboveLower = bound.lowerBounds.all { clazz.isAssignableFrom(it.toPlainClass()) }
                belowUpper && aboveLower
            }
            else -> {
                throw InternalError("Didn't expect bound $bound to be ${bound.javaClass.name}")
            }
        }
    }
    
    private fun isInBound(clazz1: Class<*>, typeArguments1: TypeArgument?, clazz2: Class<*>, typeArguments2: TypeArgument?): Boolean {
        val type: JType = if (typeArguments2 != null) ParameterizedTypeImpl.make(clazz2, typeArguments2.toJava(), null) else clazz2
        return isInBound(clazz1, typeArguments1, type)
    }
    
    private fun JType.toPlainClass(): Class<*> {
        return when (this) {
            is Class<*> -> this
            is ParameterizedType -> this.rawType as Class<*>
            else -> throw InternalError("Didn't expect $this to be ${this.javaClass.name}")
        }
    }
    
    private fun checkClassExtendability(clazz: Class<*>, position: Pair<Int, Int>) {
        if (clazz.isEnum) {
            throw Error(simpleName, position, "Cannot inherit from enum '${clazz.name}'")
        } else if (clazz.isRecord) {
            throw Error(simpleName, position, "Cannot inherit from document '${clazz.name}'")
        } else if (JModifier.isFinal(clazz.modifiers)) {
            throw Error(simpleName, position, "'${clazz.name}' is final and cannot be inherited from")
        }
        // TODO: are there more class extendability restrictions?
    }
    
    private fun loadImportedClass(identifier: AprlParser.IdentifierContext): Class<*> {
        return loadImportedClass(identifier.simpleIdentifier())
    }
    
    fun loadImportedClass(identifiers: List<AprlParser.SimpleIdentifierContext>): Class<*> {
        val first = identifiers[0]
        val clazz = loadCompleteClass(identifiers.joinToString(".") { it.text })
        if (clazz != null) {
            return clazz
        }
        val baseClass = loadImportedClass(first) ?: throw Error(simpleName, first.position, "Unresolved reference: '${first.text}'")
        val suffix = if (identifiers.size == 1) "" else "." + identifiers.drop(1).joinToString(".") { it.text }
        val completeString = baseClass.name + suffix
        val completeClass = loadCompleteClass(completeString)
        if (completeClass == null) {
            var faulty: AprlParser.SimpleIdentifierContext? = null
            val total = mutableListOf<AprlParser.SimpleIdentifierContext>()
            for (some in identifiers.drop(1)) {
                total.add(some)
                val str = baseClass.name + "." + total.joinToString(".") { it.text }
                println("Checking existence of $str")
                if (loadCompleteClass(str) == null) {
                    faulty = some
                    break
                }
            }
            throw Error(simpleName, faulty!!.position, "Unresolved reference: '${faulty.text}'")
        }
        return completeClass
    }
    
    private fun loadImportedClass(identifier: AprlParser.SimpleIdentifierContext): Class<*>? {
        val name = identifier.text
        // complete identifier (e.g. java.util.List)
        var possibleClass = loadCompleteClass(name)
        if (possibleClass != null) {
            return possibleClass
        }
        // direct class import (e.g. using java.util.List; (...) List)
        possibleClass = imports.firstOrNull { it.clazz?.simpleName == name || it.alias == name }?.clazz
        if (possibleClass != null) {
            return possibleClass
        }
        // package-import (e.g. using java.util.*; (...) List)
        for (pkg in imports.mapNotNull { it.pkg }) {
            possibleClass = loadCompleteClass(pkg.name + "." + name)
            if (possibleClass != null) {
                return possibleClass
            }
        }
        return null
    }
    
    private fun parseValueArguments(ctx: AprlParser.ValueArgumentsContext): ValueArguments {
        // TODO: parseValueArguments()
        return arrayListOf()
    }
    
    private fun parseTypeParameters(ctx: AprlParser.TypeParametersContext): MutableList<TypeParameter> {
        return parseTypeParameters(ctx.typeParameter())
    }
    
    private fun parseTypeParameters(parameters: List<AprlParser.TypeParameterContext>): MutableList<TypeParameter> {
        return parameters.mapMutable { parseTypeParameter(it) }
    }
    
    private fun parseTypeParameter(parameter: AprlParser.TypeParameterContext): TypeParameter {
        val name = parameter.simpleIdentifier().text
        val constraints = parameter.type()?.let { parseTypeConstraints(it) } ?: emptyList()
        return TypeParameter(name, constraints.asArray())
    }
    
    private fun parseTypeConstraints(constraints: List<AprlParser.TypeContext>): MutableList<Type> {
        return constraints.mapMutable { parseType(it) }
    }
    
    private fun parseType(type: AprlParser.TypeContext): Type {
        val annotations = type.annotations()?.let { parseAnnotations(it) } ?: mutableListOf()
        val function = type.functionType()
        val paren = type.parenthesizedType()
        val array = type.arrayType()
        val nullable = type.nullableType()
        val identifier = type.identifier()
        val typeArguments = type.typeArguments()?.let { parseTypeArguments(it) }
        return if (function != null) {
            parseFunctionType(annotations, function)
        } else if (paren != null) {
            parseType(paren.type())
        } else if (array != null) {
            ArrayType(this, annotations, parseType(array.type()))
        } else if (nullable != null) {
            val identifier1 = nullable.identifier()
            val typeArguments1 = nullable.typeArguments()?.let { parseTypeArguments(it) }
            val paren1 = nullable.parenthesizedType()
            val array1 = nullable.arrayType()
            val baseType = if (identifier1 != null) {
                val clazz = loadImportedClass(identifier1)
                checkTypeArguments(clazz, nullable.typeArguments(), true, identifier1.simpleIdentifier().last())
                Identifier(this, annotations, identifier1.simpleIdentifier().toMutableList(), typeArguments1)
            } else if (paren1 != null) {
                parseType(paren1.type())
            } else if (array1 != null) {
                parseType(array1.type())
            } else {
                throw InternalError("Expected NullableTypeContext ($nullable) to have user-, parenthesized- or arrayType")
            }
            NullableType(this, annotations, baseType)
        } else if (identifier != null) {
            val clazz = loadImportedClass(identifier)
            checkTypeArguments(clazz, type.typeArguments(), true, identifier.simpleIdentifier().last())
            Identifier(this, annotations, identifier.simpleIdentifier().toMutableList(), typeArguments)
        } else {
            throw InternalError("Expected TypeContext ($type) to have function-, parenthesized-, array-, nullable- or userType")
        }
    }
    
    private fun parseFunctionType(annotations: Annotations, ctx: AprlParser.FunctionTypeContext): FunctionType {
        val returnType = parseType(ctx.type())
        return FunctionType(this, annotations, ctx.functionTypeParameters().type()?.mapMutable { parseType(it) } ?: mutableListOf(), returnType)
    }
    
    private fun parseTypeArguments(ctx: AprlParser.TypeArgumentsContext): TypeArgument {
        return TypeArgument(ctx.typeProjection().mapMutable { parseTypeProjection(it) })
    }
    
    private fun parseTypeProjection(ctx: AprlParser.TypeProjectionContext): TypeProjection {
        val typeProjectionModifierList = ctx.typeProjectionModifierList()
        val annotations: Annotations
        val typeProjectionModifiers: MutableList<TypeProjectionModifier>
        if (typeProjectionModifierList == null) {
            annotations = mutableListOf()
            typeProjectionModifiers = mutableListOf()
        } else {
            annotations = annotationsFromTypeProjectionModifierList(typeProjectionModifierList)
            typeProjectionModifiers =
                typeProjectionModifiersFromTypeProjectionModifierList(typeProjectionModifierList)
        }
        return TypeProjection(annotations, typeProjectionModifiers, ctx.type()?.let { parseType(it) })
    }
    
    private fun annotationsFromTypeProjectionModifierList(ctx: AprlParser.TypeProjectionModifierListContext): Annotations {
        return ctx.typeProjectionModifier().filter { it.annotation() != null }.flatMapMutable { parseAnnotation(it.annotation()) }
    }
    
    private fun typeProjectionModifiersFromTypeProjectionModifierList(ctx: AprlParser.TypeProjectionModifierListContext): MutableList<TypeProjectionModifier> {
        return ctx.typeProjectionModifier().filter { it.varianceModifier() != null }.mapMutable { parseVarianceModifier(it.varianceModifier()) }
    }
    
    private fun parseVarianceModifier(ctx: AprlParser.VarianceModifierContext): TypeProjectionModifier {
        val sub = ctx.SUB_()
        val sup = ctx.SUPER()
        return if (sub != null) {
            TypeProjectionModifier.SUB
        } else if (sup != null) {
            TypeProjectionModifier.SUPER
        } else {
            throw InternalError("Expected VarianceModifierContext ($ctx) to be SUB_ or SUPER")
        }
    }
    
    private fun parseAnnotations(ctx: AprlParser.AnnotationsContext): Annotations {
        return ctx.annotation().flatMapMutable { parseAnnotation(it) }
    }
    
    private fun parseAnnotation(ctx: AprlParser.AnnotationContext): Annotations {
        return if (ctx.LSQUARE() != null) {
            parseMultiAnnotation(ctx.unescapedAnnotation())
        } else {
            mutableListOf(parseSingleAnnotation(ctx.unescapedAnnotation(0)))
        }
    }
    
    private fun parseMultiAnnotation(annotations: List<AprlParser.UnescapedAnnotationContext>): Annotations {
        TODO()
    }
    
    private fun parseSingleAnnotation(annotation: AprlParser.UnescapedAnnotationContext): Triple<Class<*>, ValueArguments, AnnotationRetention> {
        TODO()
    }
    
    private fun parseTopLevelInterface(ctx: AprlParser.InterfaceDeclarationContext) {
        val modifiers = modifiersFromModifierList(ctx.modifierList())
        val annotations = annotationsFromModifierList(ctx.modifierList())
        val inter = Interface(ctx.simpleIdentifier().text)
        // TODO: parse interface
        topLevelObjects.add(inter)
    }
    
    private fun parseTopLevelAnnotation(ctx: AprlParser.AnnotationDeclarationContext) {
        val modifiers = modifiersFromModifierList(ctx.modifierList())
        val annotations = annotationsFromModifierList(ctx.modifierList())
        val annotation = Annotation(ctx.simpleIdentifier().text)
        // TODO: parse annotation class
        topLevelObjects.add(annotation)
    }
    
    private fun parseTopLevelDocument(ctx: AprlParser.DocumentDeclarationContext) {
        val modifiers = modifiersFromModifierList(ctx.modifierList())
        val annotations = annotationsFromModifierList(ctx.modifierList())
        val document = Document(ctx.simpleIdentifier().text)
        // TODO: parse document class
        topLevelObjects.add(document)
    }
    
    private fun parseTopLevelStruct(ctx: AprlParser.StructDeclarationContext) {
        val modifiers = modifiersFromModifierList(ctx.modifierList())
        val annotations = annotationsFromModifierList(ctx.modifierList())
        val struct = Struct(ctx.simpleIdentifier().text)
        // TODO: parse struct
        topLevelObjects.add(struct)
    }
    
    private fun parseTopLevelEnum(ctx: AprlParser.EnumDeclarationContext) {
        val modifiers = modifiersFromModifierList(ctx.modifierList())
        val annotations = annotationsFromModifierList(ctx.modifierList())
        val enum = Enum(ctx.simpleIdentifier().text)
        // TODO: parse enum
        topLevelObjects.add(enum)
    }
    
    private fun parseTopLevelExtension(ctx: AprlParser.ExtensionDeclarationContext) {
        enclosingClassRequired = ctx.extensionBody() != null && ctx.extensionBody().extensionMember().size != 0
    }
    
    private fun parseTopLevelFunction(ctx: AprlParser.FunctionDeclarationContext) {
        enclosingClassRequired = true
    }
    
    private fun parseTopLevelProperty(ctx: AprlParser.PropertyDeclarationContext) {
        enclosingClassRequired = true
    }
    
}