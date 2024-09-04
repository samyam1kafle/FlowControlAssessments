package BasicFlowControlAssesment.FlowControlConditional;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*


14. Java Program to check whether a character is a vowel or consonant using if-else.
15. Java Program to check whether a given character is uppercase or lowercase using if-else.
16. Java Program to print week day for a given input week using if-else.
17. Java Program to print number of days for a given input month using if-else.
18. Java Program to check whether a triangle is an equilateral, isosceles, or scalene triangle using
if-else.
19. Java Program to check whether a person is valid for vote or not using if-else?
20. Java Program to check Division on the basis of marks obtained by students. Percentage >=
60% : Division 1, Percentage >= 45% : Division 2, Percentage >= 30% : Division 3, Percentage < 30% :
Fail
21. Java Program to Calculate percentage and grade of students on the basis of marks obtained
in 5 subjects Maths, Physics, Chemistry, English and Hindi. Marks of subject is taken as an input:
Percentage >= 90% : Grade A, Percentage >= 80% : Grade B, Percentage >= 70% : Grade C, Percentage
>= 60% : Grade D, Percentage >= 40% : Grade E, Percentage < 40% : Grade
* */
public class ConditionalAssesments {
    private static Random rand = new Random();
    private static Scanner sc = new Scanner(System.in);
//    <class name > <variable name> = new <classname>()

    public static void main(String[] args) {
//        int firstNumber = rand.nextInt(200);
//        int secondNumber = rand.nextInt(200);
//        int thirdNumber = rand.nextInt(200);
//        System.out.println("First number : " + firstNumber + " Second Number : "+ secondNumber + " Third Number " + thirdNumber);
//        String seperator = "*".repeat(40);
//        isFirstNumberGreater(firstNumber,secondNumber);
//        System.out.println(seperator);
//        findGreater(firstNumber,secondNumber, thirdNumber);
//        System.out.println(seperator);
//
//        isDivisibleByNumber(firstNumber,3);
//        System.out.println(seperator);
//
//        isDivisibleByNumber(firstNumber,5);
//        System.out.println(seperator);
//
//        isDivisibleByNumber(firstNumber,11);
//        System.out.println(seperator);
//
//        checkOddEven(secondNumber);
//        System.out.println(seperator);
//        checkLeapYear();
//        isDigit();
//        isAlphabetDigitsOrSpecialCharacters();
        tempConverter();
    }

    // 1. Java Program to print maximum among two numbers using if-else.
    private static void isFirstNumberGreater(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println("Number " + firstNumber + " is greater then "+ secondNumber);
        } else {
            System.out.println("Number " + secondNumber + " is greater then "+ firstNumber);
        }
    }

    // 2. Java Program to print maximum among three numbers using if-else.
    private static void findGreater(int firstNumber, int secondNumber, int thirdNumber) {
        if (((firstNumber > secondNumber) && (firstNumber > thirdNumber))) {
            System.out.println("Number " + firstNumber + " is greater then "+ secondNumber + " And " + thirdNumber);
        } else if (((secondNumber > firstNumber) && (secondNumber > thirdNumber))) {
            System.out.println("Number " + secondNumber + " is greater then "+ firstNumber + " And " + thirdNumber);
        } else {
            System.out.println("Number " + thirdNumber + " is greater then "+ firstNumber + " And " + secondNumber);
        }
    }

    /*
    3. Java Program to check whether a given number is divisible by 3 or not using if-else.
    4. Java Program to check whether a given number is divisible by 5 or not using if-else.
    5. Java Program to check whether a given number is divisible by 11 or not using if-else.
    */
    private static void isDivisibleByNumber(int number, int divider) {
        if (number%divider == 0) {
            System.out.println("Number " + number + " is divisible by "+ divider);
        }  else {
            System.out.println("Number " + number + " is not divisible by "+ divider);
        }
    }

    //    6. Java Program to check whether a given number is even or odd using if-else.
    private static void checkOddEven(int number) {
        if (number%2 == 0) {
            System.out.println("Number " + number + " is Even");
        }  else {
            System.out.println("Number " + number + " is Odd ");
        }
    }

    // 7. Java Program to check whether a year is leap year or not using if-else.
    private static void checkLeapYear() {
        System.out.println("Enter the year");
        boolean itterate = true;
        int year = 0;
        while(itterate) {
            year = sc.nextInt();
            if (year >= 1000 && year <= 9999) {
                itterate = false;
            } else {
                System.out.println("The year should be of 4 digits Please re-enter valid year!");
            }
        }
        if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
            System.out.println("The year is leap year");
        } else {
            System.out.println("The year is not leap year");
        }
        sc.close();
    }
    // 8. Java Program to check whether a given input is digit or not using if-else.
    private static void isDigit() {
        System.out.println("Please enter a digit");
        char userInput = sc.next().charAt(0);
        if (userInput >= '0' && userInput <= '9') {
            System.out.println(userInput+" is a number");
        } else {
            System.out.println(userInput+" is not a number");
        }
            sc.close();
    }
    // 9. Java Program to check whether a given input is alphabet or not using if-else.
    private static void isAlphabet() {
        System.out.println("Please enter a character");
        char userInput = sc.next().charAt(0);
        if ((userInput >= 'A' && userInput <= 'Z') || userInput >= 'a' && userInput <= 'z') {
            System.out.println(userInput+" is an alphabet");
        } else {
            System.out.println(userInput+" is not an alphabet");
        }
        sc.nextLine().contains("Hello");
        sc.close();

    }

    // 10. Java Program to check if a given input is a Digit or Alphabets or Special Character using if-else.
    private static void isAlphabetDigitsOrSpecialCharacters() {
        System.out.println("Please enter a character");
        char userInput = sc.next().charAt(0);
        if (Character.isDigit(userInput)) {
            System.out.println(userInput+" is a digit");
        } else if (Character.isLetter(userInput)) {
                System.out.println(userInput+" is an alphabet");
        } else {
            System.out.println(userInput+" is a special Character");
        }
        sc.close();
    }
//  11. Java Program to check whether a given number is a positive or negative number using if-else.
    private static void checkPositiveNegative() {
        System.out.println("Please enter a character");
        int userInput = sc.nextInt();
        if (userInput > 0) {
            System.out.println(userInput+" is positive");
        }  else {
            System.out.println(userInput+" is negative");
        }
        sc.close();
    }
//  12. Java Program to convert temperature from Celsius to Fahrenheit using if-else.
//    13. Java Program to convert temperature from Fahrenheit to Celsius using if-else.
    private static void tempConverter() {
        try {
            double temperature = 0;
            System.out.println("Please enter the temperature you want to convert");
            double temp = sc.nextDouble();
            System.out.println("Please enter F to convert it into Fahrenheit or C for Celsius!");
            char toConvert = sc.next().charAt(0);
            if (Character.toUpperCase(toConvert) == 'F') {
                temperature = (temp * 9/5) + 32;
                System.out.println(temp + " celsius is " + temperature + " Fahrenheit");
            } else if (Character.toUpperCase(toConvert) == 'C') {
                temperature = (temp - 32) * 5/9;
                System.out.println(temp + " Fahrenheit is " + temperature + " Celsius");
            } else {
                System.out.println("Invalid input!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
