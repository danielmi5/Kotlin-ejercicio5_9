fun main() {
    val estudiante = Estudiante("Jesús", 16, "e45", "1A", 4.99)
    val profesor = Profesor("Luis", 34, "p124", "Ciencias", 8)

    println(estudiante)
    estudiante.mostrarRol()
    estudiante.mostrarCalificacion()
    println()
    println(profesor)
    profesor.mostrarRol()
    profesor.mostrarExperiencia()

}