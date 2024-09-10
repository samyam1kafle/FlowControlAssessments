package BasicFlowControlAssesment.FlowControlConditional.Loops.LoopsUtils;

import java.util.Scanner;

public class Utils {
    public static void printNaturalNumbers(int upperBound) {
        System.out.println("The numbers are : ");
        for (int i = 1; i <= upperBound; i++)
            System.out.println(i);
    }

    public static void printOddEvenInRange(Scanner scanner, boolean printOdd) {
        int upperBound = scanner.nextInt();
        for (int i = 1; i <= upperBound; i++) {
            boolean isOdd = isOddValue(i);
            if (printOdd && isOdd) {
                System.out.println(i);
            } else if(!printOdd && !isOdd) {
                System.out.println(i);
            }
        }
    }
    public static void addOddEvenInRange(Scanner scanner, boolean addOdd) {
        int upperBound = scanner.nextInt();
        int total = 0;
        for (int i = 1; i <= upperBound; i++) {
            boolean isOdd = isOddValue(i);
            if (addOdd && isOdd) {
                total += i;
            } else if(!addOdd && !isOdd) {
                total += i;
            }
        }
        System.out.println("The Total is : " + total);

    }
    private static boolean isOddValue(int i) {
        if (i%2 == 0) {
            return false;
        }
        return true;
    }
    public static void getMultiplicationTable(Scanner scanner) {
        System.out.println("Enter the number you want the multiplication table for!");
        int multiplicationTableFor = scanner.nextInt();
        System.out.println("Enter the number you want the multiplication table Up to!");
        int upperBound = scanner.nextInt();
        for (int i=1; i<= upperBound;i++ ){
            System.out.printf("%s X %s = %s%n", multiplicationTableFor,i, (i*multiplicationTableFor) );
        }
    }


    public static void getDigitsCount(Scanner scanner,boolean getSum){
        System.out.println("Enter the Number!");
//        long userInputNumber = scanner.nextLong();
        String userInputNumber = scanner.next();
        int digitCount = 0;
//        long absoluteValue = Math.abs(userInputNumber);
        long total = 0;
//        while (absoluteValue > 0){
//            if(getSum) {
//                total += absoluteValue % 10;
//            }
//            absoluteValue = absoluteValue/10;
//            digitCount++;
//        }
//        if (userInputNumber == 0) {
//            digitCount = 1;
//            total = 0;
//        }

        for (int i = 0; i < userInputNumber.length(); i++) {
            if (Character.isDigit(userInputNumber.charAt(i))) {
                if (getSum) {
                    total += Character.getNumericValue(userInputNumber.charAt(i));
                } else {
                    digitCount += 1;
                }
            }
        }
//        Java program to print the sum of digits of a given number using for
//loop.
        if (getSum) {
            System.out.printf("The Total sum of the provided number %s is : %s %n", userInputNumber,total );
        } else {
            System.out.printf("The Total Digits in the string is %s %n", digitCount);
        }
    }

    public static void checkPalindromeNumber(Scanner scanner){
        System.out.println("Enter the number! ");
        int input = scanner.nextInt();
        int reversed = 0;
        int userinputReal = input;
        while(input != 0) {
            int num = input % 10;
            reversed = reversed * 10 + num;
            input /= 10;
        }
        if (userinputReal == reversed) {
            System.out.println(userinputReal + " is a palindrome.");
        } else {
            System.out.println(userinputReal + " is not a palindrome.");
        }

    }
}
