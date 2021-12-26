lexer grammar AprlLexer;

import UnicodeClasses;

DelimitedComment: '/*' (DelimitedComment | .)*? '*/'-> channel(HIDDEN);
DocComment: '/**' .*? '*/' -> channel(HIDDEN);
LineComment: '//' ~[\u000A\u000D]* -> channel(HIDDEN);

WS: [\u0020\u0009\u000C] -> skip;

NL: '\u000A' | '\u000D' '\u000A';

// Keywords
USING: 'using';
ALIAS: 'alias';

CLASS: 'class';
INTERFACE: 'interface';
STRUCT: 'struct';
DOCUMENT: 'document';
ANONYMOUS: 'anonymous';
ENUM: 'enum';
ANNOTATION: 'annotation';
PARTNER: 'partner';
BLUEPRINT: 'blueprint';

THIS: 'this';
SUPER: 'super';

SUB_: 'sub';
ACTUAL: 'actual';

INIT: 'init';
EXEC: 'exec';

PRIVATE: 'private';
BOUNDED: 'bounded';
LOCAL: 'local';
PUBLIC: 'public';

GETTER: 'getter';
SETTER: 'setter';

DEF: 'def';
CONST: 'const';
VAR: 'var';
VAL: 'val';

ABSTRACT: 'abstract';
COVER: 'cover';
OPEN: 'open';
FINAL: 'final';

INLINE: 'inline';
EXTERNAL: 'external';
SYNC: 'sync';

FUNCTION: 'function';
SCRIPT: 'script';
OPERATOR: 'operator';
EXTENSION: 'extension';

PARAMS: 'params';

IF: 'if';
UNLESS: 'unless';
ELSIF: 'elsif';
ELSE: 'else';

FOR: 'for';
MATCH: 'match';
WHEN: 'when';
DO: 'do';
WHILE: 'while';

RETURN: 'return';
BREAK: 'break';
CONTINUE: 'continue';

AS: 'as';
AS_QUEST: 'as?';
IS: 'is';
NOT_IS: '!is';
IN: 'in';
NOT_IN: '!in';

TRY: 'try';
TRY_QUEST: 'try?';
CATCH: 'catch';
FINALLY: 'finally';
TRIGGER: 'trigger';

TRUE: 'true';
FALSE: 'false';
NONE: 'none';

NULL: 'null';

// Operators
LPAREN: '(';
RPAREN: ')';
LSQUARE: '[';
RSQUARE: ']';
LCURLY: '{';
RCURLY: '}';

ASSIGN: '=';
DEFINE: ':=';
ADD: '+'; ADD_ASSIGN: '+='; INCR: '++';
SUB: '-'; SUB_ASSIGN: '-='; DECR: '--';
MUL: '*'; MUL_ASSIGN: '*=';
DIV: '/'; DIV_ASSIGN: '/=';
MOD: '%'; MOD_ASSIGN: '%=';
EXP: '**'; EXP_ASSIGN: '**=';
CONJ: '&' | '&&'; CONJ_ASSIGN: '&=' | '&&=';
DISJ: '|' | '||'; DISJ_ASSIGN: '|=' | '||=';
XOR: '~' | '~~'; XOR_ASSIGN: '~=' | '~~=';

COMMA: ',';
PERIOD: '.';
QUEST_PERIOD: '?.';
DOWNTO: '>..';
TO: '..';
UNTIL: '..<';
TRIPLE_PERIOD: '...';
COLON: ':';
DOUBLE_COLON: '::';
SEMICOLON: ';';
EXCL: '!';
DOUBLE_EXCL: '!!';
QUEST: '?';
HASH: '#';
AT: '@';
DOUBLE_AT: '@@';

ELVIS: '?:';
ELVIS_ASSIGN: '?=';

EQUAL: '==';
NEQUAL: '!=';
IDENTICAL: '===';
NIDENTICAL: '!==';
LANGLE: '<';
NLANGLE: '!<';
LEQ: '<=';
NLEQ: '!<=';
RANGLE: '>';
NRANGLE: '!>';
GEQ: '>=';
NGEQ: '!>=';

LARROW: '<-';
RARROW: '->';
RARROW_THICK: '=>';

// Quotes
SINGLE_QUOTE: '\'';
QUOTE_OPEN: '"' -> pushMode(LineString);
TRIPLE_QUOTE_OPEN: '"""' -> pushMode(MultiLineString);

// Literals
fragment DecDigit: [0-9];

IntegerLiteral: WholeIntegerLiteral | HexLiteral | BinLiteral | OctalLiteral;
LongLiteral: IntegerLiteral [lL];
ShortLiteral: IntegerLiteral [sS]?;
ByteLiteral: IntegerLiteral [bB]?;
fragment WholeIntegerLiteral: [-]? NaturalNumberLiteral;
fragment NaturalNumberLiteral: DecDigit+ | DecDigit (DecDigit | '_')* DecDigit;
fragment FloatingPointLiteral: [-]? NaturalNumberLiteral? '.' NaturalNumberLiteral;

FloatLiteral: (FloatingPointLiteral | ScientificNumberLiteral | IntegerLiteral) [fF];
DoubleLiteral: ((FloatingPointLiteral | ScientificNumberLiteral) [dD]?) | (IntegerLiteral [dD]);
fragment ScientificNumberLiteral: FloatingPointLiteral [eE] WholeIntegerLiteral;

ComplexLiteral: (WholeIntegerLiteral | FloatingPointLiteral) [jJ] (WholeIntegerLiteral | FloatingPointLiteral);

HexLiteral: [-]? '0' [xX] (HexDigit | HexDigit HexCharacter* HexDigit);
fragment HexDigit: [0-9a-fA-F];
fragment HexCharacter: HexDigit | '_';

BinLiteral: [-]? '0' [bB] (BinDigit | BinDigit BinCharacter* BinDigit);
fragment BinDigit: [01];
fragment BinCharacter: BinDigit | '_';

OctalLiteral: [-]? '0' [oO] (OctalDigit | OctalDigit OctalCharacter* OctalDigit);
fragment OctalDigit: [0-7];
fragment OctalCharacter: OctalDigit | '_';

BooleanLiteral: TRUE | FALSE;
TrileanLiteral: BooleanLiteral | NONE;

Identifier: (Letter | '_') (Letter | '_' | DecDigit)* | '`' (~[`])+ '`';

FieldIdentifier: '$' Identifier;

CharacterLiteral: '\'' (EscapeSeq | .) '\'';

fragment EscapeSeq: UniCharacterLiteral | EscapedIdentifier;
fragment UniCharacterLiteral: '\\' 'u' HexDigit HexDigit HexDigit HexDigit;
fragment EscapedIdentifier: '\\' ('t' | 'b' | 'r' | 'n' | '\'' | '"' | '\\' | '$');

fragment Letter : UNICODE_CLASS_LL | UNICODE_CLASS_LM | UNICODE_CLASS_LO | UNICODE_CLASS_LT | UNICODE_CLASS_LU | UNICODE_CLASS_NL;

mode LineString;

QUOTE_CLOSE: '"' -> popMode;

LineStrRef: FieldIdentifier;
LineStrText: (~[\\"$])+;
LineStrEscapedChar: '\\' . | UniCharacterLiteral;
LineStrExprStart: '${';

mode MultiLineString;

TRIPLE_QUOTE_CLOSE: MultiLineStrQuote? '"""' -> popMode;

MultiLineStrQuote: '"'+;
MultiLineStrRef: FieldIdentifier;
MultiLineStrText: ~('\\' | '"' | '$')+ | '$';
MultiLineStrEscapedChar: '\\' .;
MultiLineStrExprStart: '${';
MultiLineNL: NL -> skip;
