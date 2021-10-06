package com.employeewage

fun main(){
    println("Welcome to employee wage")
    var attendance = checkAttendance()
    var wage = dailyWage(attendance)
    println("Daily wage of employee is : $wage")
}