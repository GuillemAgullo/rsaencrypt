/*fun nullSafetySum(a: Int?,b: Int?): Int {
    val resultat = (a?:0) + (b?:0)
    return resultat
}

fun nullSafetyAverage(list: List<Int?>?): Double {
    list ?: return 0.0
    var suma = 0.0
    var count = 0
    for (elem in list) {
        suma += elem ?: continue
        count++
    }
    return suma / count
}
fun nullControlAverage(list: List<Int?>?): Double? {

    list ?: return 0.0

    var suma = 0.0

    for (elem in list) {

        suma += elem ?: return null

    }
    return suma / list.size

}
fun printOnlyOdds(list: List<Int?>){
    for (elem in list){
        if ((elem?.rem(2) ?: 0) != 0) {
            print("$elem")
        }

    }
}
fun replaceNulls(matrix: List<List<Int?>>): List<List<Int>> {
    for (i in matrix) {
        for (j in matrix) {

        }

    }
}

fun main() {
val r = printOnlyOdds(listOf(1, 2, 3, 4, 5, 6, 7, 8, null, 9, 10))

}
*/
