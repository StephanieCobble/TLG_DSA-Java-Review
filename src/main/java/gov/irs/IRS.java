package gov.irs;

import com.hr.corp.Corporation;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.util.ArrayList;
import java.util.List;

public class IRS {
    private List<TaxPayer> taxPayers = new ArrayList<>();

    Employee hourly = new HourlyEmployee();
    Employee salaried = new SalariedEmployee();
    Corporation corp = new Corporation();

    public double computeTotalMonthlyTaxToCollect() {
        double total = 0;
        for (TaxPayer taxPayer : taxPayers) {
            total += taxPayer.computeMonthlyTaxToPay();
        }
        return total;
    }

    public void register(TaxPayer taxPayer) {
        taxPayers.add(taxPayer);
    }



}