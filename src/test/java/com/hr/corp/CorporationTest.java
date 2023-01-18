package com.hr.corp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CorporationTest {

    private Corporation corp;

    @Before
    public void setup() throws Exception {
        corp = new Corporation("XYZ ltd", 10000.0);
    }

    @Test
    public void computeMonthlyTaxToPay() {
        Assert.assertEquals(1000.0, corp.computeMonthlyTaxToPay(), .001);
    }
}