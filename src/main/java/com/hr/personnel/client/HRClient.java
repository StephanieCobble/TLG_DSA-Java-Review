package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        // create two Employee Objects
        // & invoke getEmployeeInfo() methods

//        Employee employee1 = new Employee("steph", LocalDate.of(2022, 10, 3));
//        String employeeInfo1 = employee1.getEmployeeInfo();
//        System.out.println(employeeInfo1);
//        System.out.println(employee1.work());

        // 1 HourlyEmployee
        Employee hourly = new HourlyEmployee("Jane", LocalDate.of(2021, 1, 1), 160, 30.00);

        // 2 SalariedEmployees
        Employee salaried1 = new SalariedEmployee("jim", LocalDate.of(1999, 1, 1), 5000.00);
        Employee salaried2 = new SalariedEmployee("Sam", LocalDate.of(2000, 5, 5), 6000.00);

        Department dept = new Department();

        System.out.println(hourly.getEmployeeInfo());
        System.out.println(salaried1.getEmployeeInfo());
        System.out.println(salaried2.getEmployeeInfo());

        dept.addEmployee(hourly);
        dept.addEmployee(salaried1);
        dept.addEmployee(salaried2);

        System.out.println(dept.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked());

        // compute monthly pay
        System.out.println("Monthly pay: " + hourly.computeMonthlyCompensation());
        System.out.println("Monthly pay: " + salaried1.computeMonthlyCompensation());
        System.out.println("Monthly pay: " + salaried2.computeMonthlyCompensation());

        System.out.println();
        // compute taxes
        System.out.println("Monthly taxes: " + hourly.computeMonthlyTaxToPay());
        System.out.println("Monthly taxes: " + salaried1.computeMonthlyTaxToPay());
        System.out.println("Monthly taxes: " + salaried2.computeMonthlyTaxToPay());

        System.out.println();

        System.out.println("Total dept comp: " + dept.ComputeDepartmentMonthlyTotalCompensation());
    }
}