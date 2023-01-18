package com.hr.personnel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DepartmentTest {
    Department dept = new Department();
    private Employee hourly;
    private Employee salaried1;
    @Before
    public void setup() throws Exception {
        hourly = new HourlyEmployee("Jane",
                LocalDate.of(2021, 1, 1),
                160, 30.00);

        salaried1 = new SalariedEmployee("jim",
                LocalDate.of(1999, 1, 1),
                5000.00);

//        Department dept = new Department();

        dept.addEmployee(hourly);
        dept.addEmployee(salaried1);
    }

    @Test
    public void addEmployee() {
        Assert.assertEquals(2, dept.getCurrentIndex());
        Assert.assertEquals("name = Jane, hireDate = 2021-01-01",
                dept.getEmployees()[0].getEmployeeInfo());
    }

    @Test
    public void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        Assert.assertEquals(2, dept.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked());
    }

    @Test
    public void computeDepartmentMonthlyTotalCompensation() {
        Assert.assertEquals(9800.0, dept.ComputeDepartmentMonthlyTotalCompensation(), .001);
    }

    @Test
    public void computeMonthlyCompensation() {
        Assert.assertEquals(4800.0, hourly.computeMonthlyCompensation(), .001);
        Assert.assertEquals(5000.0, salaried1.computeMonthlyCompensation(), .001);
    }


}