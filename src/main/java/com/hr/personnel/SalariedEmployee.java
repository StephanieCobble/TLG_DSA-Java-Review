package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    private double monthlySalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary) {
        super(name, hireDate);
        setMonthlySalary(monthlySalary);
    }


    @Override
    public double computeMonthlyCompensation() {
        return getMonthlySalary();
    }

    @Override
    public String getEmployeeInfo() {
        return "name = " + name + ", hireDate = " + hireDate +
                "monthlySalary = " + monthlySalary;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return computeMonthlyCompensation() * SALARIED_TAX_RATE;
    }

    // accessor methods
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}