package Utils;

public class Utilities {
    public static double calculateAmountBasedUponPercentage(double price, double percentage) {
        return ((percentage/100) * price);
    }
    public static String stripDecimalPoints(double toStrip){
        return String.format("%.2f", toStrip);
    }


//    public static boolean findMaxOfTwoNumbers(int number1, int number2){
//
//        return false;
//    }

}
