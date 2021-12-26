package aprl.compiler.conversion

import aprl.compiler.decodeWholeNumber
import aprl.lang.Complex
import java.math.BigDecimal
import java.math.BigInteger

fun BigInteger(value: Number): BigInteger = BigInteger.valueOf(value.toLong())

fun BigDecimal(value: Number): BigDecimal = BigDecimal.valueOf(value.toDouble())

fun String.decodeWholeNumber(): BigInteger {
    return if (startsWith("-")) {
        -removePrefix("-").decodeWholeNumber()
    } else {
        drop(2).replace("_", "").let {
            if (startsWith("0x", true)) {
                BigInteger(it, 16)
            } else if (startsWith("0b", true)) {
                BigInteger(it, 2)
            } else if (startsWith("0o", true)) {
                BigInteger(it, 8)
            } else {
                BigInteger(this)
            }
        }
    }
}

fun String.decodeWholeNumberOrNull(): BigInteger? {
    return tryOrNull { decodeWholeNumber() }
}

fun String.decodeDecimalNumber(): BigDecimal {
    TODO("String.decodeDecimalNumber()")
}

fun String.decodeDecimalNumberOrNull(): BigDecimal? {
    TODO("String.decodeDecimalNumberOrNull()")
}

fun String.decodeComplexNumber(): Complex {
    val (realStr, imaginaryStr) = split("j", ignoreCase = true).run { get(0) to get(1) }
    val real = if ("." in realStr) realStr.decodeDecimalNumber() else realStr.decodeWholeNumber().toBigDecimal()
    val imaginary = if ("." in imaginaryStr) imaginaryStr.decodeDecimalNumber() else imaginaryStr.decodeWholeNumber().toBigDecimal()
    return Complex(real, imaginary)
}

fun String.decodeComplexNumberOrNull(): Complex? {
    return tryOrNull { decodeComplexNumber() }
}

fun <T> tryOrNull(action: () -> T): T? {
    return try {
        action()
    } catch (ex: Throwable) {
        null
    }
}
