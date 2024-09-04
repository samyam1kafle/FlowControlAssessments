package BasicFlowControlAssesment;

import static Utils.Utilities.*;

public class SalaryTotalAmount {
    public static void main(String[] args) {
        double grossSalary = 85000d;
        double tax = 20d;
        String bill = "*". repeat(30);
        double taxAmount = calculateAmountBasedUponPercentage(grossSalary, tax);
        double finalAmount = grossSalary - taxAmount;
        bill += "\t\t\n SALARY CALCULATOR \n";
        bill += "Gross salary : \t" + grossSalary +"\n";
        bill += "Tax percent : \t" + tax +"\n";
        bill += "Total tax Amount : \t" + stripDecimalPoints(taxAmount)+"\n";
        bill += "-". repeat(30);
        bill += "\n";
        bill += "Net Salary : \t" + stripDecimalPoints(finalAmount)  +"\n";
        System.out.printf(bill);
    }
}
