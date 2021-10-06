package com.employeewage

fun monthlyWage(dailyWage: Int):Int {
    return dailyWage * Employee.DAYS_IN_MONTH
}