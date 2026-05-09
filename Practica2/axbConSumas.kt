// Multiplicacion de a x b usando sumas
fun main() {
    val a = 9
    val b = 3
    var resultado = 0

    for (i in 1..b) {
        resultado += a
    }
    println("$a multiplicado por $b es igual a: $resultado")
}
