abstract class Persona(val nombre: String, var edad: Int, val id: String){

    open fun mostrarRol(rol: String = "Persona"){
        println("El rol de $nombre es $rol.")
    }

    override fun toString(): String {
        return "Persona(nombre = $nombre, edad = $edad, id = $id')"
    }
}