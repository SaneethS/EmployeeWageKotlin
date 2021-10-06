package com.employeewage

fun dailyWage():Int {
    return if(checkAttendance() == Employee.IS_PRESENT){
        Employee.WAGE_PER_HOUR * Employee.FULL_TIME_HOUR
    }else{
        0
    }
}