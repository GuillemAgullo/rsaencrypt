
fun main() {

    //Ex 1
print("\n Introdueix la nota acadèmica: ")
    val nota = readln().toIntOrNull()?:0

    if (nota < 0.0 || nota > 10)
        println("La nota és incorrecta ")
    if (nota < 5)
        println("Has suspés xd ")
    else if (nota<=6)
        println("Has tret un bé, guay ")
    else if (nota<9)
        println("Has tret un Notable, genial")
    else if (nota<10)
        println("Has tret un excelent, molt bé")
    else if (nota==10)
        println("Enhorabuena makina, matricula de honor")

//Ex 2
 print("\nEscribe 3 numeros y te diré el más grande ")
 print("\nEscriu el valor d'A: ")
 val a = readln().toDouble()
 print("\nEscriu el valor de B: ")
 val b = readln().toDouble()
 print("\nEscriu el valor de C: ")
 val c = readln().toDouble()

 if (a > b && a > c)
     print("El numero $a és el més gran ")
 else if ( b > c)
     print("El numero $b és el mes gran")
 else
     print("El numero $c és el més gran")


//Ex 3
    println("\nEscriu dues paraules")
    print("\nPrimera paraula: ")
    val aa = readln()
    print("\nSegona paraula: ")
    val bb = readln()

    val aminuscula = aa.lowercase()
    val bminuscula = bb.lowercase()

    if (aa<bb)
        print("$aa<$bb")
    else if (aa==bb)
        print("aa=bb")
    else
        print("$aa>$bb")

//Ex 4
    println("\nArrodonim 2.4:")
val x = 2.4
val xInt = x.toInt()

val down = xInt
val up = xInt + 1


val round = if (x - xInt >= 0.5){
    up
}   else{
    down
}
print("\nup: $up, down:  $down, round: $round")


//Ex 5








}


