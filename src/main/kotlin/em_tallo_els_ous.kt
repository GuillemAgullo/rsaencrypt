fun sortOfGuillemLukeSkywalkerPablo(array: ArrayList<Int>) {


    for (i in 0 .. array.size - 1) {
        for (j in i downTo 1) {

            val firstelement = array[j]
            val secondelement = array[j - 1]
            if (firstelement < secondelement) {
                swap(array, j, j - 1)
            }
        }
    }
}

fun swap(array: ArrayList<Int>, i: Int, j: Int) {
    val aux = array[i]
    array[i] = array[j]
    array[j] = aux
}


fun main() {
    val hola = arrayListOf(2, 1, 8, 7, 11, 2, 3, 4, 7, 0, 6, 3)
    sortOfGuillemLukeSkywalkerPablo(hola)
    print(hola)

}