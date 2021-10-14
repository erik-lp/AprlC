parser grammar AprlParser;

options { tokenVocab = AprlLexer; }

aprlFile
    : NL* preamble NL* (topLevelObject (semi+ topLevelObject?)*)? EOF;

// File preamble

preamble
    : namespaceHeader? importList;

namespaceHeader
    : NAMESPACE identifier semi?;

importList
    : importHeader*;

importHeader
    : USING importIdentifier (COMMA importIdentifier)* semi?;

importIdentifier
    : singleImport | identifier (PERIOD (MUL | LSQUARE subImportIdentifier (COMMA subImportIdentifier)* RSQUARE))?;

subImportIdentifier
    : simpleIdentifier importAlias?;

singleImport
    : identifier importAlias;

importAlias
    : ALIAS simpleIdentifier;

// Top level objects

topLevelObject
    : classDeclaration | interfaceDeclaration | annotationDeclaration | documentDeclaration | structDeclaration | enumDeclaration | extensionDeclaration | functionDeclaration | propertyDeclaration;

// Class

classDeclaration
    : modifierList?
    CLASS
    NL* simpleIdentifier
    (NL* typeParameters)?
    (NL* primaryConstructor)?
    (NL* LARROW NL* delegationSpecifiers)?
    (NL* classBody)?;

interfaceDeclaration
    : modifierList?
    INTERFACE
    NL* simpleIdentifier
    (NL* typeParameters)?
    (NL* LARROW NL* interfaceDelegationSpecifiers)?
    (NL* classBody)?;

annotationDeclaration
    : modifierList?
    ANNOTATION
    NL* simpleIdentifier
    (NL* primaryConstructor)?
    (NL* classBody)?;

documentDeclaration
    : modifierList?
    DOCUMENT
    NL* simpleIdentifier
    (NL* typeParameters)?
    NL* primaryConstructor
    (NL* classBody)?;

primaryConstructor
    : (modifierList? INIT NL*)? classParameters;

classParameters
    : LPAREN NL* (classParameter (NL* COMMA NL* classParameter)*)? NL* RPAREN;

classParameter
    : modifierList? (VAL | VAR)? NL* simpleIdentifier NL* COLON NL* type (NL* ASSIGN NL* expression)?;

delegationSpecifiers
    : annotatedDelegationSpecifier (NL* COMMA NL* annotatedDelegationSpecifier)*;

annotatedDelegationSpecifier
    : annotations? delegationSpecifier;

delegationSpecifier
    : constructorInvocation | userType | functionType;

interfaceDelegationSpecifiers
    : annotatedInterfaceDelegationSpecifier (NL* COMMA NL* annotatedInterfaceDelegationSpecifier)*;

annotatedInterfaceDelegationSpecifier
    : annotations? (userType | functionType);

constructorInvocation
    : userType valueArguments;

valueArguments
    : LPAREN NL* (valueArgument (NL* COMMA NL* valueArgument)* NL*)? RPAREN;

valueArgument
    : annotations? (simpleIdentifier NL* ASSIGN NL*)? TRIPLE_PERIOD? NL* expression;

secondaryConstructor
    : modifierList? INIT NL* functionValueParameters (NL* COLON NL* constructorDelegationCall)? NL* block?;

constructorDelegationCall
    : (THIS | SUPER) NL* valueArguments;

classBody
    : LCURLY NL* classMember* NL* RCURLY;

classMember
    : (topLevelObject | secondaryConstructor | loadScript | initializerBody | partnerDeclaration) semi+;

loadScript
    : EXEC NL* block;

initializerBody
    : INIT NL* block;

partnerDeclaration
    : modifierList? PARTNER (NL* classBody)?;

// Types

typeArguments
    : LANGLE NL* typeProjection (NL* COMMA typeProjection)* NL* RANGLE;

typeProjection
    : typeProjectionModifierList? type | QUEST;

typeProjectionModifierList
    : (typeProjectionModifier NL*)+;

typeProjectionModifier
    : varianceModifier NL* | annotation;

typeParameters
    : LANGLE NL* typeParameter (NL* COMMA NL* typeParameter)* NL* RANGLE;

typeParameter
    : typeParameterModifierList? simpleIdentifier (NL* COLON NL* type (NL* CONJ NL* type)*)?;

typeParameterModifierList
    : (typeParameterModifier NL*)+;

typeParameterModifier
    : (reificationModifier | varianceModifier | annotation) NL*;

reificationModifier
    : ACTUAL;

varianceModifier
    : SUB_ | SUPER;

type
    : annotations? (functionType | parenthesizedType | arrayType | nullableType | userType);

functionType
    : functionTypeParameters NL* RARROW_THICK NL* type;

receiverType
    : annotations? (parenthesizedType | nullableType | userType);

functionTypeParameters
    : LPAREN NL* ((parameter | type) (NL* COMMA NL* (parameter | type))*)? NL* RPAREN;

parenthesizedType
    : LPAREN NL* type NL* RPAREN;

arrayType
    : LSQUARE NL* type NL* RSQUARE;

nullableType
    : (userType | parenthesizedType | arrayType) NL* QUEST+;

userType
    : simpleUserType (NL* PERIOD NL* simpleUserType)*;

simpleUserType
    : simpleIdentifier (NL* typeArguments)?;

// Struct

structDeclaration
    : modifierList? STRUCT
    NL* simpleIdentifier
    (NL* LARROW NL* delegationSpecifiers)?
    (NL* structBody)?;

structBody
    : LCURLY NL* structMember* NL* RCURLY;

structMember
    : (topLevelObject | loadScript | initializerBody) semi+;

// Enum

enumDeclaration
    : modifierList? ENUM NL* simpleIdentifier (NL* primaryConstructor)? (NL* enumBody);

enumBody
    : LCURLY NL* enumEntries? (NL* SEMICOLON NL* classMember*)? NL* RCURLY;

enumEntries
    : enumEntry (NL* COMMA NL* enumEntry)*;

enumEntry
    : modifierList? simpleIdentifier (NL* valueArguments)? (NL* classBody)?;

// Extension

extensionDeclaration
    : modifierList? EXTENSION NL* receiverType (NL* extensionBody)?;

extensionBody
    : LCURLY NL* extensionMember* NL* RCURLY;

extensionMember
    : (functionDeclaration | propertyDeclaration | secondaryConstructor) semi+;

// Property

propertyDeclaration
    : modifierList?
    (DEF | CONST | VAR | VAL)
    (NL* typeParameters)?
    (NL* (variableDeclaration | multiVariableDeclaration))
    (NL* ASSIGN NL* expression)?
    (NL* propertyBody)?;

variableDeclaration
    : annotations? simpleIdentifier (NL* COLON NL* type)?;

multiVariableDeclaration
    : LPAREN NL* variableDeclaration (NL* COMMA NL* variableDeclaration)* NL* RPAREN;

propertyBody
    : LCURLY NL* (getter (semi* setter)? | setter (semi* getter)?)? NL* RCURLY;

getter
    : modifierList? GETTER (NL* LPAREN NL* RPAREN)? (NL* RARROW NL* type)? NL* functionBody?;

setter
    : modifierList? SETTER NL* ((LPAREN NL* functionValueParameterWithOptionalType NL* RPAREN)? (NL* RARROW NL* type)? NL* functionBody)?;

functionValueParameterWithOptionalType
        : parameterModifiers? parameterWithOptionalType (NL* ASSIGN NL* expression)?;

parameterModifiers
        : (annotation | parameterModifier)+;

parameterWithOptionalType
        : simpleIdentifier (NL* COLON NL* type)?;

// Function

functionDeclaration
    : modifierList?
    (FUNCTION | SCRIPT | OPERATOR)
    (NL* typeParameters)?
    NL* simpleIdentifier
    NL* functionValueParameters
    (NL* RARROW NL* type)?
    (NL* functionBody)?;

functionValueParameters
    : LPAREN NL* (functionValueParameter (NL* COMMA NL* functionValueParameter)*)? NL* RPAREN;

functionValueParameter
    : parameterModifiers? parameter (NL* ASSIGN NL* expression)?;

parameter
    : simpleIdentifier NL* COLON NL* type;

functionBody
    : block | ASSIGN NL* expression;

// Code Block

block
    : LCURLY NL* statements NL* RCURLY;

statements
    : (statement (semi+ statement)*)? semi*;

statement
    : (labelDefinition | annotation)* NL* (topLevelObject | assignment | loopStatement | expression);

loopStatement
    : forStatement | whileStatement | doWhileStatement;

forStatement
    : FOR NL* LPAREN NL* annotations? (variableDeclaration | multiVariableDeclaration) NL* IN NL* expression NL* RPAREN NL* controlStructureBody;

whileStatement
    : WHILE NL* LPAREN NL* expression NL* RPAREN NL* controlStructureBody;

doWhileStatement
    : DO NL* controlStructureBody NL* WHILE NL* LPAREN NL* expression NL* RPAREN;

assignment
    : (assignableExpression NL* assignmentOperator)? expression;

// Expressions

expression
    : disjunction;

disjunction
    : conjunction (disjunctionOperator conjunction)*;

conjunction
    : equalityComparison (conjunctionOperator equalityComparison)*;

equalityComparison
    : identityComparison (equalityOperator identityComparison)*;

identityComparison
    : comparison (identityOperator comparison)*;

comparison
    : callExpression (comparisonOperator callExpression)*;

callExpression
    : namedInfixExpression callSuffix*;

namedInfixExpression
    : elvisExpression (inOperator elvisExpression | isOperator type)*;

elvisExpression
    : infixFunctionCall (elvisOperator infixFunctionCall)*;

infixFunctionCall
    : rangeExpression (simpleIdentifier rangeExpression)*;

rangeExpression
    : xorExpression (toOperator xorExpression (byOperator xorExpression)?)*;

xorExpression
    : additiveExpression (xorOperator additiveExpression)*;

additiveExpression
    : multiplicativeExpression (additiveOperator multiplicativeExpression)*;

multiplicativeExpression
    : exponentialExpression (multiplicativeOperator exponentialExpression)*;

exponentialExpression
    : asExpression (exponentialOperator asExpression)*;

asExpression
    : prefixUnaryExpression (asOperator type)*;

prefixUnaryExpression
    : unaryPrefix* postfixUnaryExpression;

postfixUnaryExpression
    : atomicExpression unaryPostfix*;

atomicExpression
    : parenthesizedExpression
    | simpleIdentifier
    | literalConstant
    | contextualReference
    | callableReference
    | functionLiteral
    | anonymousObjectLiteral
    | collectionLiteral
    | thisExpression
    | superExpression
    | conditionalExpression
    | optionalTryExpression
    | tryExpression
    | jumpExpression;

parenthesizedExpression
    : LPAREN expression RPAREN;

contextualReference
    : PERIOD identifier;

callableReference
    : receiverType? DOUBLE_COLON NL* (simpleIdentifier | CLASS);

anonymousObjectLiteral
    : ANONYMOUS (NL* LARROW NL* delegationSpecifiers)? (NL* classBody)?;

collectionLiteral
    : LSQUARE NL* expression? (NL* COMMA NL* expression)* NL* RSQUARE;

thisExpression
    : THIS labelReference?;

superExpression
    : SUPER (LANGLE NL* type NL* RANGLE)? labelReference?;

conditionalExpression
    : ifExpression | matchExpression;

ifExpression
    : (IF | UNLESS) NL* LPAREN NL* expression NL* RPAREN NL* controlStructureBody (NL* ELSIF NL* LPAREN NL* expression NL* RPAREN NL* controlStructureBody)* (NL* ELSE NL* controlStructureBody)?;

controlStructureBody
    : block | assignment;

matchExpression
    : MATCH NL* LPAREN NL* expression NL* RPAREN NL* LCURLY NL* (matchEntry NL*)+ NL* RCURLY;

matchEntry
    : WHEN NL* literalConstant (NL* COMMA NL* literalConstant)* NL* RARROW_THICK NL* controlStructureBody semi? | ELSE NL* RARROW_THICK NL* controlStructureBody;

optionalTryExpression
    : TRY_QUEST NL* (block | expression);

tryExpression
    : TRY NL* block (NL* catchBlock)* (NL* finallyBlock)?;

catchBlock
    : CATCH NL* LPAREN NL* annotations? simpleIdentifier NL* COLON NL* userType (NL* CONJ NL* userType)* NL* RPAREN NL* block;

finallyBlock
    : FINALLY NL* block;

jumpExpression
    : triggerExpression | returnExpression | continueExpression | breakExpression;

triggerExpression
    : TRIGGER NL* expression;

returnExpression
    : (RETURN | RETURN_AT) NL* expression?;

continueExpression
    : CONTINUE | CONTINUE_AT;

breakExpression
    : BREAK | BREAK_AT;

labelDefinition
    : simpleIdentifier AT NL*;

labelReference
    : AT simpleIdentifier;

// Literals

literalConstant
    : nullLiteral
    | boolLiteral
    | trileanLiteral
    | integerLiteral
    | longLiteral
    | shortLiteral
    | byteLiteral
    | floatLiteral
    | doubleLiteral
    | complexLiteral
    | characterLiteral
    | stringLiteral;

nullLiteral
    : NULL;

boolLiteral
    : TRUE | FALSE;

trileanLiteral
    : TRUE | FALSE | NONE;

integerLiteral
    : IntegerLiteral;

longLiteral
    : LongLiteral;

shortLiteral
    : ShortLiteral;

byteLiteral
    : ByteLiteral;

floatLiteral
    : FloatLiteral;

doubleLiteral
    : DoubleLiteral;

complexLiteral
    : ComplexLiteral;

characterLiteral
    : CharacterLiteral;

stringLiteral
    : lineStringLiteral | multiLineStringLiteral;

lineStringLiteral
    : QUOTE_OPEN (lineStringContent | lineStringExpression)* QUOTE_CLOSE;

multiLineStringLiteral
    : TRIPLE_QUOTE_OPEN (multiLineStringContent | multiLineStringExpression | lineStringLiteral | MultiLineStrQuote)* TRIPLE_QUOTE_CLOSE;

lineStringContent
    : LineStrText | LineStrEscapedChar | LineStrRef;

lineStringExpression
    : LineStrExprStart expression RCURLY ;

multiLineStringContent
    : MultiLineStrText | MultiLineStrEscapedChar | MultiLineStrRef;

multiLineStringExpression
    : MultiLineStrExprStart expression RCURLY;

functionLiteral
    : lambdaLiteral | anonymousFunction;

lambdaLiteral
    : LCURLY NL* (lambdaParameters? NL* RARROW_THICK NL*)? statements NL* RCURLY;

lambdaParameters
    : lambdaParameter (NL* COMMA NL* lambdaParameter)*;

lambdaParameter
    : variableDeclaration
    | multiVariableDeclaration (NL* COLON NL* type)?;

anonymousFunction
    : FUNCTION
    (NL* receiverType NL* PERIOD)?
    NL* functionValueParameters
    (NL* RARROW NL* type)?
    (NL* functionBody)?;

// Operators

assignmentOperator
    : NL* (ASSIGN | DEFINE | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | EXP_ASSIGN | CONJ_ASSIGN | DISJ_ASSIGN | XOR_ASSIGN | ELVIS_ASSIGN) NL*;

disjunctionOperator
    : NL* (DISJ | OR) NL*;

conjunctionOperator
    : NL* (CONJ | AND) NL*;

equalityOperator
    : NL* (EQUAL | NEQUAL) NL*;

identityOperator
    : NL* (IDENTICAL | NIDENTICAL) NL*;

comparisonOperator
    : NL* (LANGLE | NLANGLE | RANGLE | NRANGLE | LEQ | NLEQ | GEQ | NGEQ | SPACESHIP) NL*;

inOperator
    : NL* (IN | NOT_IN) NL*;

isOperator
    : NL* (IS | NOT_IS) NL*;

elvisOperator
    : NL * ELVIS NL*;

toOperator
    : NL* (DOUBLE_PERIOD | TO) NL*;

byOperator
    : NL* (BY | DOUBLE_COLON) NL*;

xorOperator
    : NL* XOR NL*;

additiveOperator
    : NL* (ADD | SUB) NL*;

multiplicativeOperator
    : NL* (MUL | DIV | MOD) NL*;

exponentialOperator
    : NL* EXP NL*;

asOperator
    : NL* (AS | AS_QUEST) NL*;

unaryPrefix
    : annotation | labelDefinition | prefixUnaryOperator;

prefixUnaryOperator
    : INCR | DECR | ADD | SUB | EXCL | NOT | DOUBLE_AT;

unaryPostfix
    : postfixUnaryOperator | typeArguments | callSuffix | indexingSuffix | navigationSuffix;

postfixUnaryOperator
    : INCR | DECR | DOUBLE_EXCL;

assignableExpression
    : postfixUnaryExpression assignableSuffix | simpleIdentifier | parenthesizedAssignableExpression;

parenthesizedAssignableExpression
    : LPAREN NL* assignableExpression NL* RPAREN;

assignableSuffix
    : typeArguments | indexingSuffix | navigationSuffix;

// Access operators

callSuffix
    : typeArguments? (valueArguments? annotatedLambda | valueArguments);

annotatedLambda
    : annotations? labelDefinition? NL* lambdaLiteral;

indexingSuffix
    : LSQUARE NL* expression (NL* COMMA NL* expression)* NL* RSQUARE;

navigationSuffix
    : memberAccessOperator (simpleIdentifier | parenthesizedExpression);

memberAccessOperator
    : NL* (PERIOD | QUEST_PERIOD | DOUBLE_COLON) NL*;

// Modifiers

modifierList
    : (annotations NL* | modifier NL*)+;

modifier
    : visibilityModifier
    | inheritanceModifier
    | parameterModifier
    | functionModifier;

visibilityModifier
    : PUBLIC
    | LOCAL
    | BOUNDED
    | PRIVATE;

inheritanceModifier
    : SAMPLE
    | FINAL
    | OPEN
    | COVER;

parameterModifier
    : PARAMS;

functionModifier
    : DIRECT
    | SYNC
    | EXTERNAL;

// Annotations

annotations
    : (annotation NL*)+;

annotation
    : HASH (unescapedAnnotation | LSQUARE NL* unescapedAnnotation+ NL* RSQUARE);

unescapedAnnotation
    : identifier typeArguments? valueArguments?;

// Identifiers

identifier
    : simpleIdentifier (NL* PERIOD NL* simpleIdentifier)*;

simpleIdentifier
    : Identifier;
    // TODO: soft keywords?

// Separators

semi
    : NL+ | NL* SEMICOLON NL*;
