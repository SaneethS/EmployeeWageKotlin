package com.employeewage

fun dailyWage(empType:Int):Int {
    var dailyWage = 0
    dailyWage = if(empType == Employee.IS_FULL_TIME){
        Employee.WAGE_PER_HOUR * Employee.FULL_TIME_HOUR
    }else if(empType == Employee.IS_PART_TIME){
        Employee.WAGE_PER_HOUR * Employee.PART_TIME_HOUR
    }else{
        0
    }
    return dailyWage
}