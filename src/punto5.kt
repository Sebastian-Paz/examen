
abstract class FiguraGeometrica {
    abstract fun calcularArea(): Double
}

class Rectangulo(private val ancho: Double, private val alto: Double) : FiguraGeometrica() {
    override fun calcularArea() = ancho * alto
}

class Circulo(private val radio: Double) : FiguraGeometrica() {
    override fun calcularArea() = Math.PI * radio * radio
}

fun main() {
    val rectangulo = Rectangulo(5.0, 10.0)
    val circulo = Circulo(3.0)

    println("Área del rectángulo: ${rectangulo.calcularArea()}")
    println("Área del círculo: ${circulo.calcularArea()}")
}
