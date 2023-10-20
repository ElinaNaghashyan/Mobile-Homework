package com.example.myapplication

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
fun main(){
    // Task 1
    println("Task #1")
    val array = arrayOf(1, 7, 10, 17, 27)
    val list = listOf("Leonardo", "Raphael", "Michelangelo", "Donatello")
    println("Array: ${array.joinToString()}")
    println("List: ${list.joinToString()}")
    println()

    // Task 2
    println("Task #2")
    var string = "Elina "
    string += "Naghashyan"
    val substring = string.substring(6, 13)
    val uppercaseString = string.toUpperCase()
    println("Modified String: $string")
    println("Substring: $substring")
    println("Uppercase String: $uppercaseString")
    println()

    // Task 3
    println("Task #3")
    val map = mapOf("New York" to 1, "Boston" to 2, "Los Angeles" to 3, "Las Vegas" to 4)
    for ((city, value) in map) {
        println("City name: $city, Number: $value")
    }
    println()

    // Task 4
    println("Task #4")
    fun checkNumber(num: Int): String {
        return when {
            num > 0 -> "Positive"
            num < 0 -> "Negative"
            else -> "Zero"
        }
    }
    println("Number is ${checkNumber(27)}")
    println("Number is ${checkNumber(-10)}")
    println("Number is ${checkNumber(0)}")
    println()

    // Task 5
    println("Task #5")
    print("Please enter your name: ")
    val name = readlnOrNull() ?: ""
    print("Please enter your age: ")
    val age = readlnOrNull()?.toIntOrNull() ?: 0
    println("Hi, $name! You are $age years old, Genius!")
    println()

    // Task 6
    println("Task #6")
    fun divide(a: Int, b: Int): String {
        return if (b == 0) "You cannot divide to 0!" else (a / b).toString()
    }
    println(divide(77, 11))
    println(divide(100, 10))
    println()

    //Task 7
    println("Task #7")
    val currentDateTime = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm:ss")
    val formattedDateTime = currentDateTime.format(formatter)
    println("Current Date and Time: $formattedDateTime")
    println()

    //Task 8
    println("Task #8")
    data class Person(val name: String, val age: Int)
    val person = Person("Leonardo DiCaprio", 48)
    println("Name: ${person.name}, Age: ${person.age}")
    println()

    // Task 9
    println("Task #9")
    fun lifeStage(age: Int): String {
        return when {
            age < 13 -> " Child"
            age in 13..18 -> " Teenager"
            else -> "n Adult"
        }
    }
    println("Leonardo is a${lifeStage(person.age)}")
    println()

    // Task 10
    println("Task #10")
    val integers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = integers.filter { it % 2 == 0 }
    println("Even numbers: ${evenNumbers.joinToString()}")

}