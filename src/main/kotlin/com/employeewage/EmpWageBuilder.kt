package com.employeewage

interface EmpWageBuilder {
    fun addCompany(companyName: String, empHrs: Int, wagePerHour: Int, hoursInMonth: Int, daysInMonth: Int)
    fun compute()
}