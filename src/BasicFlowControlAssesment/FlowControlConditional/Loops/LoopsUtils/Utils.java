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

    private static boolean isOddValue(int i) {
        if (i%2 == 0) {
            return false;
        }
        return true;
    }

}
