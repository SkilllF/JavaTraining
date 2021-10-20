package com.tasks;

public class Employee {
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance =250.80;
    double hra = 1000.50;


    void Employee(long id, String name, String address, long phone){

        employeeId = id;
        employeeName = name;
        employeeAddress = address;
        employeePhone = phone;
    }

    void calculateSalary( double bsalary, double allowance, double hra){
        double salary;

        basicSalary = bsalary;
        specialAllowance = allowance;
        this.hra = hra;

        salary = basicSalary + ( basicSalary* specialAllowance/100) + (basicSalary * hra /100);

        System.out.println("Salary is: "+salary);




    }
}
