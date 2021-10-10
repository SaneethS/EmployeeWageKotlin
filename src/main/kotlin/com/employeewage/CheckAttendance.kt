package com.employeewage
class CheckAttendance {
    fun checkAttendance():Int {
        var empCheck:Int = (0..2).random()

        return when(empCheck){
            Constants.IS_FULL_TIME -> {
                println("Employee is present and is full time")
                Constants.IS_FULL_TIME
            }
            Constants.IS_PART_TIME -> {
                println("Employee is present and is part time")
                Constants.IS_PART_TIME
            }
            else -> {
                println("Employee is absent")
                0
            }
        }
    }
}
