class Estudiante(nombre: String, edad: Int, id: String, val curso: String, private val calificacionPromedio: Double): Persona(nombre, edad, id){

    fun mostrarCalificacion(){
        println("La calificacion promedio de $nombre es $calificacionPromedio.")
    }

    fun mostrarRol() {
        super.mostrarRol("Estudiante")
    }

    override fun toString(): String {
        val msj = super.toString().substring(0, super.toString().length - 2)
        return msj + ", curso = $curso)"
    }


}