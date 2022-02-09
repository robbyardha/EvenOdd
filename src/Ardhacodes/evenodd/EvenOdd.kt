package Ardhacodes.evenodd

fun main() {
    println("Input Your Number")
    var input = readLine()
    println("Your input is ${input}")

    if (input == null){
        println("Input Null")
    }else{
        if (input.toInt() % 2 == 0){
            println("${input} is Even")
        }else{
            println("${input} is Odd")
        }
    }

//    Batas
    println("Menentukan bilangan ganjil genap dengan batas")
    if (input == null) {
        println("Input Null")
    }else{
        for (i in 1..input.toInt()){
            if (i % 2 == 0){
                println("${i} is Even")
            }else{
                println("${i} is Odd")
            }
        }
    }
}