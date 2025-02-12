open class Persona(val nombre: String, var edad: Int, val id: String){

    protected open fun mostrarRol(rol: String = "Persona"){
        print("El rol de $nombre es $rol.")
    }

    override fun toString(): String {
        return "Persona(nombre = $nombre, edad = $edad, id = $id')"
    }
}

class Estudiante(nombre: String, edad: Int, id: String, val curso: String, private val calificacionPromedio: Double): Persona(nombre, edad, id){

    fun mostrarCalificacion(){
        println("La calificacion promedio de $nombre es $calificacionPromedio.")
    }

    override fun mostrarRol(rol: String) {
        super.mostrarRol("Estudiante")
    }

    override fun toString(): String {
        val msj = super.toString().substring(0, super.toString().length - 2)
        return msj + ", curso = $curso)"
    }


}

class Profesor(nombre: String, edad: Int, id: String, val departamento: String, private val aniosExperiencia: Int) : Persona(nombre, edad, id){

    fun mostrarExperiencia(){
        println("$nombre lleva siendo profesor $aniosExperiencia años.")
    }

    override fun mostrarRol(rol: String) {
        super.mostrarRol("Profesor")
    }

    override fun toString(): String {
        val msj = super.toString().substring(0, super.toString().length - 2)
        return msj + ", departamento = $departamento)"
    }
}

fun main() {
    val estudiante = Estudiante("Jesús", 16, "e45", "1A", 4.99)
    val profesor = Profesor("Luis", 34, "p12", "Ciencias", 8)

    println(estudiante)
    estudiante.mostrarCalificacion()

    println(profesor)
    profesor.mostrarExperiencia()

}