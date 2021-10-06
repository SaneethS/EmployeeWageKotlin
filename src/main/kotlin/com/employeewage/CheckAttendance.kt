package com.employeewage

fun checkAttendance():Int {
    val empCheck = (0..1).random()

    return if(empCheck == Employee.IS_PRESENT){
        println("Employee is present")
        Employee.IS_PRESENT
    }else{
        println("Employee is absent")
        0
    }
}