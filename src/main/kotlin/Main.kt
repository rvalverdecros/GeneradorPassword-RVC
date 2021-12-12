import kotlin.random.Random //importa la funcion random para que podamos usarla en el codigo

fun genpassword(long:Int): String {
    var pass= "" //Declaramos que actualmente la contraseña solo es un espacio vacio actualmente
    for(i in 1..long){ //Como declaramos aqui es que por numero que hay del 1 al que hemos puesto, se pondra una
        pass += Random.nextInt(33, 126).toChar() //distinta variable
    }
    println("Tu password generada es:")
    return pass
}

fun main() {
    println("¿De cuanta longitud quieres tu password?")
    val con = readLine()!!.toInt()
    println(genpassword(con))
}