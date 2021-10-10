package com.employeewage

fun main(){
    println("Welcome to employee wage")
    var employeeWageComputation = EmployeeWageComputation()
    employeeWageComputation.addCompany("Jio", 8,20,100,25)
    employeeWageComputation.addCompany("Tata",10,15,110,25)
    employeeWageComputation.compute()
}