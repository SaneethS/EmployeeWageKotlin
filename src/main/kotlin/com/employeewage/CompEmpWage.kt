package com.employeewage

class CompEmpWage(var companyName: String, var empHrs: Int, var wagePerHour: Int, var daysInMonth: Int, var hoursInMonth: Int) {
    var totalEmpWage:Int = 0

    fun setCompanyWage(totalEmpWage:Int){
        this.totalEmpWage = totalEmpWage
    }

    override fun toString(): String {
        return "Total employee wage in a company name $companyName is : $totalEmpWage"
    }
}