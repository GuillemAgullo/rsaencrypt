fun sortOfGuillemLukeSkywalkerPablo(array: ArrayList<Int>) {


    for (i in 0 .. array.size - 1) {
        for (j in i downTo 1) { //Aqui posem fins a 1 perquè ens agafi les iteracions de la llista fins al ptimer element. Sinó donaría la excepció out of bounds.

            val FirstElement = array[j]
            val SecondElement = array[j - 1]
            if (FirstElement < SecondElement) {
                swap(array, j, j - 1)
            }
        }
    }
}

fun swap(array: ArrayList<Int>, i: Int, j: Int) { //Aquesta funció canvia el FirstElement per el SecondElement
    val aux = array[i]
    array[i] = array[j]
    array[j] = aux
}


fun main() {
    val hola = arrayListOf(2, 1, 8, 7, 11, 2, 3, 4, 7, 0, 6, 3)
    sortOfGuillemLukeSkywalkerPablo(hola)
    print(hola)

}