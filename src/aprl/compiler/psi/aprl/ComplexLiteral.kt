package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position
import aprl.lang.Complex

class ComplexLiteral(
    override val position: Position,
    override val value: Complex
) : LiteralConstant<Complex>
