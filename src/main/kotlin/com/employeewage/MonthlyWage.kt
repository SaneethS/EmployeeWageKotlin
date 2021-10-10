package com.employeewage

class MonthlyWage {
    fun monthlyWage(dailyWage: Int):Int {
        return dailyWage * Constants.DAYS_IN_MONTH
    }
}
