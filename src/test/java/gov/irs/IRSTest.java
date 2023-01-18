package gov.irs;

import com.hr.corp.Corporation;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class IRSTest {

    private Employee hourly;
    private Employee salaried1;
    private Corporation corp;

    IRS taxPayer = new IRS();

    @Before
    public void setup() throws Exception {
        hourly = new HourlyEmployee("Jane",
                LocalDate.of(2021, 1, 1),
                160, 30.00);

        salaried1 = new SalariedEmployee("jim",
                LocalDate.of(1999, 1, 1),
                5000.00);

        corp = new Corporation("XYZ ltd", 10000.0);

        taxPayer.register(hourly);
        taxPayer.register(salaried1);
        taxPayer.register(corp);
    }

    @Test
    public void computeTotalMonthlyTaxToCollect() {
        Assert.assertEquals(3700.0, taxPayer.computeTotalMonthlyTaxToCollect(), .001);
    }
}