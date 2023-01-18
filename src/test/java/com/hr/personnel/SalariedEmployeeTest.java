package com.hr.personnel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {

    Department dept = new Department();
    private Employee salaried1;
    @Before
    public void setup() throws Exception {
        salaried1 = new SalariedEmployee("jim",
                LocalDate.of(1999, 1, 1),
                5000.00);

        dept.addEmployee(salaried1);
    }

    @Test
    public void getEmployeeInfo() {
        Assert.assertEquals("name = jim, hireDate = 1999-01-01monthlySalary = 5000.0", salaried1.getEmployeeInfo());
    }

    @Test
    public void computeMonthlyTaxToPay() {
        Assert.assertEquals(1500.0, salaried1.computeMonthlyTaxToPay(), .001);
    }
}