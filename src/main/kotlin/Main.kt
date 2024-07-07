package org.example

fun main() {
    val inputString = "aaBcdEf1234567890aBcdEf123456789"
    val pattern = "ghijklmnopqrstuvwxyz"
    val sizeString = 32
    var isGoodString = true


    if (inputString.length == sizeString) {
        for (symbol in pattern.toCharArray()){
            for (input in inputString.toCharArray()) {
                if (symbol.equals(input,ignoreCase = true)){
                    println("Bad symbol")
                    isGoodString = false
                    break
                }
                break
            }
            break
        }
        if (isGoodString) {
            println("Good string")
        }
    } else {
        println("Bad size")
    }
}