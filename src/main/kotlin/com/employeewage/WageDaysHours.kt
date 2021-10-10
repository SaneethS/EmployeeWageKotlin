package com.employeewage

class WageDaysHours {
    fun wageDaysHour(){
        var totalHrs = 0
        var totalDays = 0
        var totalWage = 0
        val attendance = CheckAttendance()
        val checkAttendance = attendance.checkAttendance()
        val dailyWage = DailyWage()

        while(totalHrs < Constants.HRS_IN_MONTH && totalDays < Constants.DAYS_IN_MONTH){
            val(wage, hours) = dailyWage.dailyWage(checkAttendance)
            totalWage += wage
            totalHrs += hours
            totalDays += 1

            println("Day-$totalDays hours-$totalHrs : $totalWage")
        }
        println("Total wage of employee is : $totalWage")
    }
}
