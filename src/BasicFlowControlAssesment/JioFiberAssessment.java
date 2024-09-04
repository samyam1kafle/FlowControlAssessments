package BasicFlowControlAssesment;

import static Utils.Utilities.*;

public class JioFiberAssessment {
    public static void main(String[] args) {
        double planCost = 699d;
        double gstPercent = 18d;
        String bill = "*". repeat(30);
        double gstAmount = calculateAmountBasedUponPercentage(planCost, gstPercent);
        double finalAmount = planCost + gstAmount;
        bill += "\t\t\n GST BILL CALCULATOR \n";
        bill += "Plan cost : \t" + stripDecimalPoints(planCost) +"\n";
        bill += "GST percent : \t" + stripDecimalPoints(gstPercent)+"\n";
        bill += "-". repeat(30);
        bill += "\n";
        bill += "GST Amount : \t" + stripDecimalPoints(gstAmount)+"\n";
        bill += "Final Amount : \t" + stripDecimalPoints(finalAmount)+"\n";
        System.out.printf(bill);
    }
}
