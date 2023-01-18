package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public abstract class Employee implements TaxPayer {

    // fields
    public String name;
    public LocalDate hireDate;

    // ctor
    public Employee(){
    }

    public Employee(String name, LocalDate hireDate) {
        setName(name);
        setHireDate(hireDate);
    }

    // business methods
    public abstract String getEmployeeInfo();
//    {
//        return "name = " + name + ", hireDate = " + hireDate;
//    }

    public String work() {
        return String.format("%s worked", getName());
    }

    public abstract double computeMonthlyCompensation();

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}