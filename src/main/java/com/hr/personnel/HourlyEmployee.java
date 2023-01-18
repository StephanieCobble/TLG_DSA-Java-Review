package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private int hoursWorkedPerMonth;
    private double hourlyRate;

    public HourlyEmployee(){
    }

    public HourlyEmployee(String name, LocalDate hireDate, int hoursWorkedPerMonth, double hourlyRate) {
        super(name, hireDate);
        setHoursWorkedPerMonth(hoursWorkedPerMonth);
        setHourlyRate(hourlyRate);
    }

    @Override
    public double computeMonthlyCompensation() {
        return getHoursWorkedPerMonth() * getHourlyRate();
    }

    @Override
    public String getEmployeeInfo() {
        return "name = " + name + ", hireDate = " + hireDate +
                "hoursWorkedPerMonth = " + hoursWorkedPerMonth +
                "hourlyRate = " + hourlyRate;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return computeMonthlyCompensation() * HOURLY_TAX_RATE;
    }

    // accessor methods
    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}