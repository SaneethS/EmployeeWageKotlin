package com.employeewage

fun main(){
    println("Welcome to employee wage")
    val wageDaysHoursVariable = WageDaysHours()
    wageDaysHoursVariable.wageDaysHour("Jio",8,20,100,25)
    println()

    wageDaysHoursVariable.wageDaysHour("Tata",10,15,110,20)
}