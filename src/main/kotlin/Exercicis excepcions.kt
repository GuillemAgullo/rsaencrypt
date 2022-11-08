import java.lang.IndexOutOfBoundsException

fun makeSomeDangerousCalc(): Int {
    val randomNumber = (0..100).random()
    return if (randomNumber > 50) randomNumber
    else throw ArithmeticException()
}
fun Altrafuncio(): Int{

    try {
        val hola = makeSomeDangerousCalc()
        return hola
    } catch (e: ArithmeticException) {
        return -1
    }

}
fun AutumnLeaves(): Int{

    while(true){
        try{
            val x = makeSomeDangerousCalc()
            return x
        } catch (e: ArithmeticException) {
            continue
        }
    }
}
fun filterByIndex(list: List<Any>, indexs: List<Int?>): List<Any> {
    val resultat = arrayListOf<Any>()
    for (index in indexs) {
        try {
            list[index ?: -1]
        } catch (e: IndexOutOfBoundsException){

        }
    }
    return resultat
}
fun main() {

      print(AutumnLeaves())

}