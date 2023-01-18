package com.hr.personnel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {

    Department dept = new Department();
    private Employee hourly;

    @Before
    public void setup() throws Exception {
        hourly = new HourlyEmployee("Jane",
                LocalDate.of(2021, 1, 1),
                160, 30.00);

        dept.addEmployee(hourly);
    }

    @Test
    public void getEmployeeInfo() {
        Assert.assertEquals("name = Jane, hireDate = 2021-01-01hoursWorkedPerMonth = 160hourlyRate = 30.0", hourly.getEmployeeInfo());
    }

    @Test
    public void computeMonthlyTaxToPay() {
        Assert.assertEquals(1200.0, hourly.computeMonthlyTaxToPay(), .001);
    }
}