package com.employeewage

class EmployeeWageComputation: EmpWageBuilder {
    var companyList = mutableListOf<CompEmpWage>()

    override fun addCompany(companyName: String, empHrs: Int, wagePerHour: Int, hoursInMonth: Int, daysInMonth: Int){
        companyList.add(CompEmpWage(companyName,empHrs,wagePerHour,daysInMonth,hoursInMonth))
    }

    private fun computeWage(compEmpWage: CompEmpWage):Int {
        var totalHrs = 0
        var totalDays = 0
        var totalWage = 0
        val attendance = CheckAttendance()
        val checkAttendance = attendance.checkAttendance(compEmpWage.companyName)
        val dailyWage = DailyWage()

        while(totalHrs < compEmpWage.hoursInMonth && totalDays < compEmpWage.daysInMonth){
            val(wage, hours) = dailyWage.dailyWage(checkAttendance, compEmpWage.empHrs, compEmpWage.wagePerHour)
            totalWage += wage
            totalHrs += hours
            totalDays += 1

//            println("Day-$totalDays hours-$totalHrs : $totalWage")
        }
        return totalWage
    }

    override fun compute(){
        for(company in companyList){
           company.setCompanyWage(this.computeWage(company))
           println(company)
        }
    }
}
