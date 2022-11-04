fun main() {

    print("Escriu un nombre")
    var num1 = readLine()?.toIntOrNull()?:0
    print("Escriu un altre nombre")
    var num2 = readLine()?.toIntOrNull()?:0
    while(num2 > num1){
        print("$num2")
        --num2

    }
}





















