fun main() {

    print("Escriu el número d'un dni:")
    val numdni = readLine()?.toIntOrNull()?:0
    print("Ara escriu la lletra")
    val lletradni = readLine()
    var lletra:String? = null

    val divisio = numdni % 23
    if (divisio == 0){
         lletra = "T"
    }else if (divisio == 1){
         lletra = "R"
    }else if (divisio == 2){
         lletra = "W"
    }else if (divisio == 3){
         lletra = "A"
    }else if (divisio == 4){
         lletra = "G"
    }else if (divisio == 5){
         lletra = "M"
    }else if (divisio == 6){
         lletra = "Y"
    }else if (divisio == 7){
         lletra = "F"
    }else if (divisio == 8){
         lletra = "P"
    }else if (divisio == 9){
         lletra = "D"
    }else if (divisio == 10){
         lletra = "X"
    }else if (divisio == 11){
         lletra = "B"
    }else if (divisio == 12){
         lletra = "N"
    }else if (divisio == 13){
         lletra = "J"
    }else if (divisio == 14){
         lletra = "Z"
    }else if (divisio == 15){
         lletra = "S"
    }else if (divisio == 16){
         lletra = "Q"
    }else if (divisio == 17){
         lletra = "V"
    }else if (divisio == 18){
         lletra = "H"
    }else if (divisio == 19){
         lletra = "L"
    }else if (divisio == 20){
         lletra = "C"
    }else if (divisio == 21){
         lletra = "K"
    }else if (divisio == 22){
         lletra = "E"
    }

if (lletra != lletradni) {
    println("El teu dni no és correcte")
}else {
    println("El teu dni és correcte")
}







}