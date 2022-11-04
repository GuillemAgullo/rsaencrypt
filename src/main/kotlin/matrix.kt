fun main() {
    /*print("Posa el nombre de columnes")
    val files = readln()?.toIntOrNull()?:0
    println("Posa el nombre de files")
    val columnes = readln()?.toIntOrNull()?:0
    val matrix = arrayListOf<ArrayList<Int>>()
    val contador = 0
    for (i in 0..files - 1){
        matrix.add(arrayListOf())
        for (j in 0..columnes - 1){
                println("Introdueix el contingut:")
                val element = readln().toIntOrNull() ?:0
                matrix[j].add(element)
            contador = contador + element
        }

    }
    print(contador)*/

    // apartat b

    println("exercici 8")

    val matrix = listOf(listOf(1, 2, 3,),
                        listOf(4, 5, 6,),
                        listOf(7, 8, 9,))
    val files = matrix.size - 1
    val columnes = matrix[0].size - 1

    for (i in 0..files){
        var sumesfiles = 0
        for (j in 0..columnes){
            sumesfiles += matrix[i][j]
        }
        print("La fila $i suma $sumesfiles")
    }








}