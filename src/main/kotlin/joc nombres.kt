import kotlin.math.*
fun main() {
    print("Entra un nombre")
    val n = readln().toDoubleOrNull() ?:0.0
    var isNotPrime = false


    for (i in 2 .. sqrt(n).toInt()) {
        if (n.toInt() % i == 0) {
           println("No és primer")
            isNotPrime = true
            break
        }
    }



    if (!isNotPrime){
            println("És pirmer")
    }



}