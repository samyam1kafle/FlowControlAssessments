package BasicFlowControlAssesment;

import static Utils.Utilities.calculateAmountBasedUponPercentage;
import static Utils.Utilities.stripDecimalPoints;

public class InterestCalculator {
    public static void main(String[] args) {
        double depositAmount = 500000d;
        int time = 5;
        double rate = 6.8d;
        double priceRate = depositAmount * time * rate;
        String bill = "*". repeat(30);
        double interestAmount = calculateAmountBasedUponPercentage(priceRate, 1);
        double finalAmount = depositAmount + interestAmount;
        bill += "\t\t\n Interest CALCULATOR \n";
        bill += "Principal amount : \t" + depositAmount +"\n";
        bill += "Rate : \t" + rate +"\n";
        bill += "Time : \t" + time +"\n";
        bill += "Total Interest Amount : \t" + stripDecimalPoints(interestAmount)+"\n";
        bill += "-". repeat(30);
        bill += "\n";
        bill += "Total Payable : \t" + stripDecimalPoints(finalAmount)  +"\n";
        System.out.printf(bill);
    }
}
