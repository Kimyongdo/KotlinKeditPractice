package chapter9.reified

inline fun<reified T>getType(value:Int):T{
    println(T::class)
    println(T::class.java)

    return when(T::class){
        Float::class->value.toFloat() as T
        Int::class -> value as T
        else -> throw IllegalStateException("${T::class} is not supported!!")

    }
}

fun main(){
    val result = getType<Float>(10)
    println("$result")
}