fun main() {


    while (true) {
        print("escriu un nombre")
        val n = readln().toIntOrNull()


        if (n == null)
             break

             for (j in 1..n) {
                 for (i in 0..n - 1) {
                     print("$n")

                 }
                 println()
             }


    }
}