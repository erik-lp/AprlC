package aprl.compiler.psi.java

import aprl.compiler.psi.Position
import java.lang.reflect.Type

class MethodDeclaration(
    override val position: Position,
    override val modifiers: ModifierList,
    val typeParameters: List<TypeParameter>,
    override val name: SimpleIdentifier,
    val parameters: List<MethodValueParameter>,
    val returnType: Type,
    val body: Block?
) : ClassMember, Modifiable, Named {



}
