package BasicFlowControlAssesment.FlowControlConditional.Loops;

import java.util.Scanner;

import static BasicFlowControlAssesment.FlowControlConditional.Loops.LoopsUtils.Utils.*;

/*
* 1. Java program to print all natural numbers from 1 to n using for loop.
2. Java program to print all even numbers between 1 to 100 using for
loop.
3. Java program to print all odd number between 1 to 100 using for loop.
4. Java program to print sum of all even numbers between 1 to n using
for loop.
5. Java program to print sum of all odd numbers between 1 to n using for
loop.
6. Java program to print multiplication of any number using for loop.
7. Java program to count the digits of a given number using for loop.
8. Java program to print the sum of digits of a given number using for
loop.
9. Java program to print all natural numbers in reverse order using for
loop.
10.Java program to check whether a given number is Prime or not using
for loop.
11.Java program to print all Prime numbers between 1 to n using for loop.
12.Java program to find sum of all prime numbers between 1 to n using
for loop.
13.Java program to check a given number is Armstrong or not using for
loop.
14.Java program to print all Armstrong numbers between 1 to n using for
loop.
15.Java program to check a given number is Perfect or not using for loop.
16.Java program to check all Perfect numbers between 1 to n using for
loop.
17.Java program to check a given number is Strong number or not using
for loop.
18.Java program to print all Strong numbers between 1 to n using for
loop.
19.Write a program in Java to swap first and last digit of number using for
loop.
20.Java program to swap values using third variable using for loop.
21.Java program to swap values without using third variable using for
loop.
22.Java program to calculate power of a number without using pow
method using for loop.
23.Java program to find power of a number without using pow method
using for loop.
24.Java program to calculate power of a number using pow method using
for loop.
25.Java program to check number is palindrome or not using for loop.
26.Java program to print Fibonacci series of a given number using for
loop.

* */
public class LoopMain {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printOptions();
        System.out.println("-".repeat(40));
        System.out.println("Please Choose an option from 1-27 depending upon the program you want to run. \n");
        boolean nextOption = true;
        while(nextOption) {
            int userInput = sc.nextInt();
            if (userInput <= 0 && userInput > 27) {
                System.out.println("Invalid Option Please re Enter the valid number from 1-27 \n depending upon your preference");
                printOptions();
            } else if (userInput == 27) {
                System.out.println("Thank you for using our program! \nSee you around :)");
                nextOption = false;

            } else {
                switch (userInput) {
                    case 1 -> {
                        System.out.println("Please enter the upper limit you want to print the natural numbers to.");
                        printNaturalNumbers(sc.nextInt());
                        break;
                    }
                    case 2,3 -> {
                        System.out.println("Please enter the upper limit you want the odd/even numbers till.");
                        if (userInput == 3) {
                            printOddEvenInRange(sc,true);
                        } else {
                            printOddEvenInRange(sc,false);
                        }
                        break;
                    }
                    case 4,5 -> {
                        System.out.println("Please enter the upper limit you want to add odd/even numbers till.");
                        if (userInput == 5) {
                            addOddEvenInRange(sc,true);
                        } else {
                            addOddEvenInRange(sc,false);
                        }
                        break;
                    }
                    case 6 -> {
                        getMultiplicationTable(sc);
                        break;
                    }
                    case 7,8 -> {
                        if (userInput == 7) {
                            getDigitsCount(sc,false);
                        } else {
                            getDigitsCount(sc,true);
                        }
                        break;
                    }
                    case 25 -> {
                        checkPalindromeNumber(sc);
                    }
                    default -> {
                        nextOption = false;
                        break;
                    }
                }
                printOptions();
            }


        }

    }

    private static void printOptions() {
        String menu = """
                1. Java program to print all natural numbers from 1 to n using for loop.
                2. Java program to print all even numbers between 1 to 100 using for\s
                loop.
                3. Java program to print all odd number between 1 to 100 using for loop.
                4. Java program to print sum of all even numbers between 1 to n using\s
                for loop.
                5. Java program to print sum of all odd numbers between 1 to n using for\s
                loop.
                6. Java program to print multiplication of any number using for loop.
                7. Java program to count the digits of a given number using for loop.
                8. Java program to print the sum of digits of a given number using for\s
                loop.
                9. Java program to print all natural numbers in reverse order using for\s
                loop.
                10.Java program to check whether a given number is Prime or not using\s
                for loop.
                11.Java program to print all Prime numbers between 1 to n using for loop.
                12.Java program to find sum of all prime numbers between 1 to n using\s
                for loop.
                13.Java program to check a given number is Armstrong or not using for\s
                loop.
                14.Java program to print all Armstrong numbers between 1 to n using for\s
                loop.
                15.Java program to check a given number is Perfect or not using for loop.
                16.Java program to check all Perfect numbers between 1 to n using for\s
                loop.
                17.Java program to check a given number is Strong number or not using\s
                for loop.
                18.Java program to print all Strong numbers between 1 to n using for\s
                loop.
                19.Write a program in Java to swap first and last digit of number using for\s
                loop.
                20.Java program to swap values using third variable using for loop.
                21.Java program to swap values without using third variable using for\s
                loop.
                22.Java program to calculate power of a number without using pow\s
                method using for loop.
                23.Java program to find power of a number without using pow method\s
                using for loop.
                24.Java program to calculate power of a number using pow method using\s
                for loop.
                25.Java program to check number is palindrome or not using for loop.
                26.Java program to print Fibonacci series of a given number using for\s
                loop.
                27. Terminate Program
                """;
        System.out.println(" " + menu);
    }


}
