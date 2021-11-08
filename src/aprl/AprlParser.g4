parser grammar AprlParser;

options { tokenVocab = AprlLexer; }

aprlFile
    : NL* preamble NL* (topLevelObject (semi+ topLevelObject?)*)? EOF;

// File preamble

preamble
    : namespaceHeader? importList;

namespaceHeader
    : identifier semi?;

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
    : delegationSpecifier (NL* COMMA NL* delegationSpecifier)*;

delegationSpecifier
    : identifier typeArguments? valueArguments?;

interfaceDelegationSpecifiers
    : annotatedInterfaceDelegationSpecifier (NL* COMMA NL* annotatedInterfaceDelegationSpecifier)*;

annotatedInterfaceDelegationSpecifier
    : annotations? identifier;

valueArguments
    : LPAREN NL* (valueArgument (NL* COMMA NL* valueArgument)* NL*)? RPAREN;

valueArgument
    : annotations? expression;

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
    : varianceModifier | annotation;

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
    : annotations? (functionType | parenthesizedType | arrayType | nullableType | identifier typeArguments?);

functionType
    : functionTypeParameters NL* RARROW_THICK NL* type;

receiverType
    : parenthesizedType | nullableType | identifier;

functionTypeParameters
    : LPAREN NL* (type (NL* COMMA NL* type)*)? NL* RPAREN;

parenthesizedType
    : LPAREN NL* type NL* RPAREN;

arrayType
    : LSQUARE NL* type NL* RSQUARE;

nullableType
    : (identifier typeArguments? | parenthesizedType | arrayType) QUEST;

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
    : modifierList?
    EXTENSION
    (NL* typeParameters)?
    NL* receiverType
    (NL* extensionBody)?;

extensionBody
    : LCURLY NL* extensionMember* NL* RCURLY;

extensionMember
    : functionDeclaration semi+;

// Property

propertyDeclaration
    : modifierList?
    (DEF | CONST | VAR | VAL)
    NL* variableDeclaration
    (NL* ASSIGN NL* expression)?
    (NL* propertyBody)?;

variableDeclaration
    : annotations? simpleIdentifier (NL* COLON NL* type)?;

propertyBody
    : LCURLY NL* (getter (semi* setter)? | setter (semi* getter)?)? NL* RCURLY;

getter
    : modifierList? GETTER (NL* LPAREN NL* RPAREN)? (NL* RARROW NL* type)? NL* functionBody?;

setter
    : modifierList? SETTER NL* ((LPAREN NL* functionValueParameterWithOptionalType NL* RPAREN)? (NL* RARROW NL* type)? NL* functionBody)?;

functionValueParameterWithOptionalType
    : modifierList? parameterWithOptionalType;

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
    : modifierList? parameter (NL* ASSIGN NL* expression)?;

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
    : annotations? NL* (localVariableDeclaration | assignment | loopStatement | expression);

localVariableDeclaration
    : annotations?
    (DEF | CONST | VAR | VAL)
    NL* variableDeclaration
    (NL* ASSIGN NL* expression)?;

loopStatement
    : forStatement | whileStatement | doWhileStatement;

forStatement
    : FOR NL* LPAREN NL* annotations? variableDeclaration NL* IN NL* expression NL* RPAREN NL* block;

whileStatement
    : WHILE NL* LPAREN NL* expression NL* RPAREN NL* block;

doWhileStatement
    : DO NL* block NL* WHILE NL* LPAREN NL* expression NL* RPAREN;

assignment
    : assignableExpression NL* assignmentOperator expression;

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
    : namedInfixExpression (comparisonOperator namedInfixExpression)*;

namedInfixExpression
    : elvisExpression namedInfix*;

namedInfix
    : inOperator elvisExpression | isOperator type;

elvisExpression
    : infixFunctionCall (elvisOperator infixFunctionCall)*;

infixFunctionCall
    : rangeExpression (simpleIdentifier rangeExpression)*;

rangeExpression
    : xorExpression (toOperator xorExpression)?;

xorExpression
    : additiveExpression (xorOperator additiveExpression)*;

additiveExpression
    : multiplicativeExpression (additiveOperator multiplicativeExpression)*;

multiplicativeExpression
    : exponentialExpression (multiplicativeOperator exponentialExpression)*;

exponentialExpression
    : asExpression (exponentialOperator asExpression)*;

asExpression
    : prefixUnaryExpression (asOperator type)?;

prefixUnaryExpression
    : unaryPrefix* postfixUnaryExpression;

postfixUnaryExpression
    : atomicExpression unaryPostfix*;

atomicExpression
    : parenthesizedExpression
    | identifier
    | literalConstant
    | contextualReference
    | callableReference
    | lambdaLiteral
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
    : receiverType DOUBLE_COLON NL* simpleIdentifier;

collectionLiteral
    : LSQUARE NL* expression? (NL* COMMA NL* expression)* NL* RSQUARE;

thisExpression
    : THIS;

superExpression
    : SUPER;

conditionalExpression
    : ifExpression | matchExpression;

ifExpression
    : (IF | UNLESS) NL* LPAREN NL* expression NL* RPAREN NL* block (NL* elsifExpression)* (NL* ELSE NL* block)?;

elsifExpression
    : ELSIF NL* LPAREN NL* expression NL* RPAREN NL* block;

matchExpression
    : MATCH NL* LPAREN NL* expression NL* RPAREN NL* LCURLY (NL* matchEntry)+ NL* RCURLY;

matchEntry
    : WHEN NL* literalConstant (NL* COMMA NL* literalConstant)* NL* RARROW_THICK NL* block semi? | ELSE NL* RARROW_THICK NL* block;

optionalTryExpression
    : TRY_QUEST NL* (block | expression);

tryExpression
    : TRY NL* block (NL* catchBlock)* (NL* finallyBlock)?;

catchBlock
    : CATCH NL* LPAREN NL* annotations? simpleIdentifier NL* COLON NL* type (NL* CONJ NL* type)* NL* RPAREN NL* block;

finallyBlock
    : FINALLY NL* block;

jumpExpression
    : triggerExpression | returnExpression | continueExpression | breakExpression;

triggerExpression
    : TRIGGER NL* expression;

returnExpression
    : RETURN NL* expression?;

continueExpression
    : CONTINUE;

breakExpression
    : BREAK;

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

lambdaLiteral
    : LCURLY NL* (lambdaParameters? NL* RARROW_THICK NL*)? statements NL* RCURLY;

lambdaParameters
    : lambdaParameter (NL* COMMA NL* lambdaParameter)*;

lambdaParameter
    : annotations? simpleIdentifier NL* COLON NL* type;

// Operators

assignmentOperator
    : NL* (ASSIGN | DEFINE | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | EXP_ASSIGN | CONJ_ASSIGN | DISJ_ASSIGN | XOR_ASSIGN | ELVIS_ASSIGN) NL*;

disjunctionOperator
    : NL* DISJ NL*;

conjunctionOperator
    : NL* CONJ NL*;

equalityOperator
    : NL* (EQUAL | NEQUAL) NL*;

identityOperator
    : NL* (IDENTICAL | NIDENTICAL) NL*;

comparisonOperator
    : NL* (LANGLE | NLANGLE | RANGLE | NRANGLE | LEQ | NLEQ | GEQ | NGEQ) NL*;

inOperator
    : NL* (IN | NOT_IN) NL*;

isOperator
    : NL* (IS | NOT_IS) NL*;

elvisOperator
    : NL * ELVIS NL*;

toOperator
    : NL* (TO | DOWNTO | UNTIL) NL*;

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
    : INCR | DECR | ADD | SUB | EXCL | DOUBLE_AT;

unaryPostfix
    : postfixUnaryOperator | typeArguments | callSuffix | indexingSuffix | navigationSuffix;

postfixUnaryOperator
    : INCR | DECR | DOUBLE_EXCL;

assignableExpression
    : expression assignableSuffix+ | parenthesizedAssignableExpression;

parenthesizedAssignableExpression
    : LPAREN NL* assignableExpression NL* RPAREN;

assignableSuffix
    : indexingSuffix | navigationSuffix;

// Access operators

callSuffix
    : typeArguments? (lambdaCallSuffix | valueArguments);

lambdaCallSuffix
    : valueArguments? annotatedLambda;

annotatedLambda
    : annotations? NL* lambdaLiteral;

indexingSuffix
    : LSQUARE NL* expression (NL* COMMA NL* expression)* NL* RSQUARE;

navigationSuffix
    : memberAccessOperator simpleIdentifier;

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
    : ABSTRACT
    | FINAL
    | OPEN
    | COVER;

parameterModifier
    : PARAMS;

functionModifier
    : INLINE
    | SYNC
    | EXTERNAL;

// Annotations

annotations
    : (annotation NL*)+;

annotation
    : HASH (unescapedAnnotation | LSQUARE NL* unescapedAnnotation+ NL* RSQUARE);

unescapedAnnotation
    : identifier valueArguments?;

// Identifiers

identifier
    : simpleIdentifier (NL* PERIOD NL* simpleIdentifier)*;

simpleIdentifier
    : Identifier;
    // TODO: soft keywords?

// Separators

semi
    : NL+ | NL* SEMICOLON NL*;
