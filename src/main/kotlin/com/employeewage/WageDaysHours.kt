package com.employeewage

fun wageDaysHour(){
    var totalHrs = 0
    var totalDays = 0
    var totalWage = 0
    val attendance = checkAttendance()

    while(totalHrs < Employee.HRS_IN_MONTH && totalDays < Employee.DAYS_IN_MONTH){
        val(wage, hours) = dailyWage(attendance)
        totalWage += wage
        totalHrs += hours
        totalDays += 1

        println("Day-$totalDays hours-$totalHrs : $totalWage")
    }
    println("Total wage of employee is : $totalWage")
}