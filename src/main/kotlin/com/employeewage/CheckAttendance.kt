package com.employeewage

fun checkAttendance(){
    val empCheck = (0..1).random()

    if(empCheck == Employee.IS_PRESENT){
        println("Employee is present")
    }else{
        println("Employee is absent")
    }
}