package com.employeewage
class CheckAttendance {
    fun checkAttendance(companyName: String):Int {
        var empCheck:Int = (0..2).random()

        return when(empCheck){
            Constants.IS_FULL_TIME -> {
                println("Employee is present and is full time in $companyName")
                Constants.IS_FULL_TIME
            }
            Constants.IS_PART_TIME -> {
                println("Employee is present and is part time in $companyName")
                Constants.IS_PART_TIME
            }
            else -> {
                println("Employee is absent in $companyName")
                0
            }
        }
    }
}
