package com.employeewage

class WageDaysHours {
    fun wageDaysHour(companyName: String, empHrs: Int, wagePerHour: Int, hoursInMonth: Int, daysInMonth: Int){
        var totalHrs = 0
        var totalDays = 0
        var totalWage = 0
        val attendance = CheckAttendance()
        val checkAttendance = attendance.checkAttendance(companyName)
        val dailyWage = DailyWage()

        while(totalHrs < hoursInMonth && totalDays < daysInMonth){
            val(wage, hours) = dailyWage.dailyWage(checkAttendance, empHrs, wagePerHour)
            totalWage += wage
            totalHrs += hours
            totalDays += 1

            println("Day-$totalDays hours-$totalHrs : $totalWage")
        }
        println("Total wage of employee is : $totalWage")
    }
}
