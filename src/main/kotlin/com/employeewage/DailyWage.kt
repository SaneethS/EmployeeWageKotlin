package com.employeewage

class DailyWage {
    fun dailyWage(empType:Int, empHrs: Int, wagePerHour: Int): Pair<Int,Int> {

        var dailyWage = when(empType){
            Constants.IS_FULL_TIME -> Pair(wagePerHour * empHrs, empHrs)
            Constants.IS_PART_TIME -> Pair(wagePerHour * (empHrs/2), (empHrs/2))
            else -> Pair(0,0)
        }
        return dailyWage
    }
}
