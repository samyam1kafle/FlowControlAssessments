package BasicFlowControlAssesment;

import static Utils.Utilities.*;

public class PizzasAssessment {
    public static void main(String[] args) {
        int quantity = 2;
        double pizzaPerSlice = 399d;
        double discountPercent = 20d;
        double totalPriceForPizza = quantity*pizzaPerSlice;
        String bill = "*". repeat(30);
        double discountAmount = calculateAmountBasedUponPercentage(totalPriceForPizza, discountPercent);
        double finalAmount = totalPriceForPizza - discountAmount;
        bill += "\t\t\n PIZZA BILL CALCULATOR \n";
        bill += "Pizza cost : \t" + pizzaPerSlice +"\n";
        bill += "Pizza Amount for "+ quantity +" : \t" + stripDecimalPoints(totalPriceForPizza)+"\n";
        bill += "Pizza Discount Amount : \t" + stripDecimalPoints(discountAmount)+"\n";
        bill += "-". repeat(30);
        bill += "\n";
        bill += "Pizza Discount Amount : \t" + stripDecimalPoints(discountAmount)  +"\n";
        bill += "Final Amount : \t" + stripDecimalPoints(finalAmount) +"\n";
        System.out.printf(bill);
    }
}
