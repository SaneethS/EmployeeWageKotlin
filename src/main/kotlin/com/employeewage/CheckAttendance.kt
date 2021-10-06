package com.employeewage

fun checkAttendance():Int {
    val empCheck = (0..2).random()

    return if(empCheck == Employee.IS_FULL_TIME){
        println("Employee is present and is full time")
        Employee.IS_FULL_TIME
    }else if(empCheck == Employee.IS_PART_TIME){
        println("Employee is present and is part time")
        Employee.IS_PART_TIME
    }else{
        println("Employee is absent")
        0
    }
}