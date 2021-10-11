package com.employeewage

class EmployeeWageComputation: EmpWageBuilder {
    private var companyList:ArrayList<CompEmpWage> = arrayListOf<CompEmpWage>()
    private var map:HashMap<String,CompEmpWage> = hashMapOf<String,CompEmpWage>()

    override fun addCompany(companyName: String, empHrs: Int, wagePerHour: Int, hoursInMonth: Int, daysInMonth: Int){
        var company = CompEmpWage(companyName,empHrs,wagePerHour,daysInMonth,hoursInMonth)
        companyList.add(company)
        map[companyName] = company
    }

    private fun computeWage(compEmpWage: CompEmpWage):Int {
        var totalHrs = 0
        var totalDays = 0
        var totalWage = 0
        val attendance = CheckAttendance()
        val checkAttendance = attendance.checkAttendance(compEmpWage.companyName)
        val dailyWage = DailyWage()


        while(totalHrs < compEmpWage.hoursInMonth && totalDays < compEmpWage.daysInMonth) {
            val (wage, hours) = dailyWage.dailyWage(attendance.checkAttendance(compEmpWage.companyName), compEmpWage.empHrs, compEmpWage.wagePerHour)
            totalWage += wage
            totalHrs += hours
            totalDays += 1

            println("Day-$totalDays wage : $wage")
        }

        return totalWage
    }

    override fun compute(){
        for(company in companyList){
           company.setCompanyWage(this.computeWage(company))
           println(company)
        }
    }

    override fun getCompany(companyName: String): Int {
        return map[companyName]?.totalEmpWage?: -1
    }
}
