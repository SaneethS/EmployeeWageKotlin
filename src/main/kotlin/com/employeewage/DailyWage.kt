package com.employeewage

fun dailyWage(empType:Int): Pair<Int,Int> {

    var dailyWage = when(empType){
        Employee.IS_FULL_TIME -> Pair(Employee.WAGE_PER_HOUR * Employee.FULL_TIME_HOUR, Employee.FULL_TIME_HOUR)
        Employee.IS_PART_TIME -> Pair(Employee.WAGE_PER_HOUR * Employee.PART_TIME_HOUR, Employee.PART_TIME_HOUR)
        else -> Pair(0,0)
    }
    return dailyWage
}