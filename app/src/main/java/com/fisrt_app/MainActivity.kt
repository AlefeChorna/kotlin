//package com.fisrt_app
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//class MainActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//}
/*
fun main() {
    println("Hello World")

    var name: String;
    name = "Juca Bala"

    println("$name")
    println("Double MAX: " + Double.MAX_VALUE)
    println("Float MAX: " + Float.MAX_VALUE)
    println("Long MAX: " + Long.MAX_VALUE)
    println("Int MAX: " + Int.MAX_VALUE)
    println("Short MAX: " + Short.MAX_VALUE)
    println("Byte MAX: " + Byte.MAX_VALUE)

    // val is imutable variable
    val gender = "male"
    // var is mutable variable
    var gender2 = "male"
}
*/

// short function example
fun sum(num1: Int, num2: Int) = num1 + num2;

fun main() {
    val string = "Trabalhando com strings no Kotlin"
    var compostString = """
        
        New Article
        
            Please, read.
    """.trimIndent()

    println("Template string ex: ${string.plus(" - :)")}")
    println(compostString)
    println("Sum: ${sum(2, 5)}")

    // num interactions
    var num = 0;
    num++;
    num+=2;
    num-=1;
    num*=4
    num/=2
    num%=2;
    ++num
    println("Num Interactions: ${num}")
}