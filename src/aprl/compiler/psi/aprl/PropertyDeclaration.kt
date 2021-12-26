package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class PropertyDeclaration(
    override val position: Position,
    override val modifiers: ModifierList,
    val static: Boolean,
    val final: Boolean,
    val variableDeclaration: VariableDeclaration,
    val expression: Expression?,
    val propertyBody: PropertyBody?,
) : TopLevelObject(), Named {
    
    override val name: SimpleIdentifier
        get() = variableDeclaration.name
    
}
