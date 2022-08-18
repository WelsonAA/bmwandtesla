package com.and4


abstract class Car(val Model1 : String, val color1 : String, var Speed1 : Int = 50): Vehicle {
    var model : String = Model1
    var color : String = color1
    var speed : Int = Speed1
    var Max_speed : Int = 100
    abstract val fuel : String

    fun getfueltype():String{
        return fuel
    }
    fun printcar(){
        println(model)
        println(color)
        println(speed)
        println(getfueltype())
    }
}