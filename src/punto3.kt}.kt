//ESTE ES EL PUNTO 4
fun aplicarOperacion(numero: Int, operacion: (Int) -> Int): Int {
    return operacion(numero)
}
fun cuadrado(numero: Int): Int {
    return numero * numero
}
fun main() {
    println(aplicarOperacion(5, ::cuadrado))
}
