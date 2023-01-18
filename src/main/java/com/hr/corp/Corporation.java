package com.hr.corp;

import gov.irs.TaxPayer;

public class Corporation implements TaxPayer {
    String name;
    double monthlyIncome;

    // ctor
    public Corporation(){
    }

    public Corporation(String name, double monthlyIncome) {
        setName(name);
        setMonthlyIncome(monthlyIncome);
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return monthlyIncome * CORP_TAX_RATE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
}