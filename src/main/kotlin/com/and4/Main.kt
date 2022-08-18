package com.and4

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter tesla  Model")
    val tesla_Model: String  = scanner.nextLine()
    println("Enter tesla Color")
    val tesla_color: String = scanner.nextLine()
    var tesla_Speed: Int
    do{
        println("Enter tesla Speed")
     tesla_Speed = scanner.nextInt()}
        while(tesla_Speed<0 || tesla_Speed>100)
    println("Enter bmw  Model")
    val bmw_Model: String  = scanner.nextLine()
    println("Enter bmw Color")
    val bmw_color: String = scanner.nextLine()
    var bmw_Speed: Int
    do{
        println("Enter bmw Speed")
        bmw_Speed = scanner.nextInt()}
    while(bmw_Speed<0 || bmw_Speed>100)
    val tesla = Tesla(tesla_Model, tesla_color, tesla_Speed)
    val bmw = BMW(bmw_Model, bmw_color, bmw_Speed)
    tesla.printcar()
    bmw.printcar()
}

