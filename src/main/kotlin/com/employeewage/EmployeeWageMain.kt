package com.employeewage

fun main(){
    println("Welcome to employee wage")
    var attendance = checkAttendance()
    var wage = dailyWage(attendance)
    var monthWage = monthlyWage(wage)
    println("Daily wage of employee is : $wage")
    println("Monthly wage of employee is : $monthWage")
}