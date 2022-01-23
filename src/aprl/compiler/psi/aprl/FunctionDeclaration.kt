package aprl.compiler.psi.aprl

import aprl.compiler.Scope
import aprl.compiler.error.ErrorProne
import aprl.compiler.error.TypeInferenceError
import aprl.compiler.psi.Position
import aprl.compiler.psi.java.MethodDeclaration
import java.io.File

class FunctionDeclaration(
    override val file: File,
    override val position: Position,
    override val modifiers: ModifierList,
    val static: Boolean,
    val operator: Boolean,
    val typeParameters: List<TypeParameter>,
    override val name: SimpleIdentifier,
    val parameters: List<FunctionValueParameter>,
    val returnType: TypeReference?,
    val body: FunctionBody?,
) : TopLevelObject(), Named, ErrorProne {
    
    fun asMethodDeclaration(scope: Scope<Named>): MethodDeclaration {
        return MethodDeclaration(
            position,
            modifiers.toJavaModifierList(),
            typeParameters.map { it.toJavaTypeParameter() },
            name.toJavaIdentifier(),
            parameters.map { it.toMethodValueParameter() },
            returnType?.toType() ?: inferReturnType(scope) ?: throw TypeInferenceError(file, position),
            body?.toBlock()
        )
    }
    
    fun inferReturnType(scope: Scope<Named>) = body?.inferReturnType(scope)
    
}
