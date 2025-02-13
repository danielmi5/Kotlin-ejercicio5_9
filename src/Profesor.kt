class Profesor(nombre: String, edad: Int, id: String, val departamento: String, private val aniosExperiencia: Int) : Persona(nombre, edad, id){

    fun mostrarExperiencia(){
        println("$nombre lleva siendo profesor $aniosExperiencia años.")
    }

    fun mostrarRol() {
        super.mostrarRol("Profesor")
    }

    override fun toString(): String {
        val msj = super.toString().substring(0, super.toString().length - 2)
        return msj + ", departamento = $departamento)"
    }
}