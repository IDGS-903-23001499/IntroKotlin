// Distancia entre dos puntos
import kotlin.math.pow

fun main() {
    val x1 = 3.0
    val y1 = 5.0
    val x2 = 7.0
    val y2 = 8.0

    val baseX = x2 - x1
    val baseY = y2 - y1

    val distancia = (baseX.pow(2.0) + baseY.pow(2.0)).pow(0.5)

    println("La distancia es: $distancia")
}
