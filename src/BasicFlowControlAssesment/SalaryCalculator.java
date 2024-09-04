package BasicFlowControlAssesment;

import static Utils.Utilities.calculateAmountBasedUponPercentage;
import static Utils.Utilities.stripDecimalPoints;

public class SalaryCalculator {
    public static void main(String[] args) {
        double basicSalary = 85000d;
        double taPercent = 15d;
        double daPercent = 20d;
        double hraPercent = 18d;
        double pfPercent = 20d;
        double taxPercent = 25d;
        double taAmt = calculateAmountBasedUponPercentage(basicSalary, taPercent);
        double daAmt = calculateAmountBasedUponPercentage(basicSalary, daPercent);
        double hraAmt = calculateAmountBasedUponPercentage(basicSalary, hraPercent);
        double pfAmt = calculateAmountBasedUponPercentage(basicSalary, pfPercent);
        double taxAmt = calculateAmountBasedUponPercentage(basicSalary, taxPercent);
        double totalGrossSalary = basicSalary + taAmt+daAmt+hraAmt;
        double netSalary = totalGrossSalary - (pfAmt+taxAmt);
        String bill = "*". repeat(30);
        bill += "\t\t\n Net salary CALCULATOR \n";
        bill += "Basic salary : \t" + basicSalary +"\n";
        bill += "Ta Percent : \t" + taPercent +"\n";
        bill += "Ta Amount : \t" + taAmt +"\n";
        bill += "Da Percent : \t" + daPercent +"\n";
        bill += "Da Amount : \t" + daAmt +"\n";
        bill += "Hra Percent : \t" + hraPercent +"\n";
        bill += "Hra Amount : \t" + hraAmt +"\n";

        bill += "Pf Percent : \t" + pfPercent +"\n";
        bill += "Pf Amount : \t" + pfAmt +"\n";
        bill += "Tax Percent : \t" + taxPercent +"\n";
        bill += "Tax Amount : \t" + taxAmt +"\n";

        bill += "Gross Salary : \t" + totalGrossSalary +"\n";
        bill += "-". repeat(30);
        bill += "\n";
        bill += "Total Net Salary : \t" + stripDecimalPoints(netSalary)  +"\n";
        System.out.printf(bill);
    }
}
