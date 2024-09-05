package BasicFlowControlAssesment.FlowControlConditional;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


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
//        tempConverter();
//        vowelOrConsonant();
//        CharUpperOrLower();
//        weekDayForInput();
//        numberOfDaysInTheMonth();
//        checkTypeOfTriangle();
//        isElligibleToVote();
        checkDivision();
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

    //    14. Java Program to check whether a character is a vowel or consonant using if-else.
    private static void vowelOrConsonant(){
        System.out.println("Please enter a character");
       char input = sc.next().charAt(0);
       char inputLower = Character.toLowerCase(input);
       if (inputLower == 'a' || inputLower == 'e' ||inputLower == 'i' || inputLower == 'o' || inputLower == 'u' ) {
           System.out.println(input + " is a vowel");
       } else {
           System.out.println(input + " is a consonant");
       }
       sc.close();
    }

    //    15. Java Program to check whether a given character is uppercase or lowercase using if-else.
    private static void CharUpperOrLower(){
        System.out.println("Please enter a character");
        char input = sc.next().charAt(0);
        if (Character.isLowerCase(input)) {
            System.out.println(input + " is in lower case");
        } else {
            System.out.println(input + " is in upper case");
        }
        sc.close();
    }

    //16. Java Program to print week day for a given input week using if-else.
    private static void weekDayForInput(){
        System.out.println("Please enter number which you want to see the day for!");
        int input = sc.nextInt();
        if (input < 1 || input > 7) {
            System.out.println(input + " is Invalid");
            return;
        } else {
            if(input == 1)
                System.out.println("It's Sunday");
            else if (input == 2)
                System.out.println("It's Monday");
            else if (input == 3)
                System.out.println("It's Tuesday");
            else if (input == 4)
                System.out.println("It's Wednesday");
            else if (input == 5)
                System.out.println("It's Thursday");
            else if (input == 6)
                System.out.println("It's Friday");
            else if (input == 7)
                System.out.println("It's Saturday");
        }
        sc.close();
    }
    //17. Java Program to print number of days for a given input month using if-else.
    private static void numberOfDaysInTheMonth(){
        System.out.println("Please enter month number which you want to see the numbers of day for!");
        int input = sc.nextInt();
        if (input < 1 || input >= 12) {
            System.out.println(input + " Month is Invalid");
            return;
        } else {
            if(input == 1)
                System.out.println("Days = 31" );
            else if (input == 2){
                int year = sc.nextInt();

                if ((year % 4 == 0 && year % 100 != 0) ||(year % 400 ==0)) {
                    System.out.println("Days = 29" );
                } else {
                    System.out.println("Days = 28" );
                }
            }

            else if (input == 3)
                System.out.println("Days = 31" );
            else if (input == 4)
                System.out.println("Days = 30" );
            else if (input == 5)
                System.out.println("Days = 31" );
            else if (input == 6)
                System.out.println("Days = 30" );
            else if (input == 7)
                System.out.println("Days = 31" );

            else if (input == 8)
                System.out.println("Days = 31" );

            else if (input == 9)
                System.out.println("Days = 30" );

            else if (input == 10)
                System.out.println("Days = 31" );

            else if (input == 11)
                System.out.println("Days = 30" );

            else if (input == 12)
                System.out.println("Days = 31" );

        }
        sc.close();
    }

       /*
        18. Java Program to check whether a triangle is an equilateral, isosceles, or scalene triangle using
            if-else.
        Equilateral: All three sides are equal in length.
            Isosceles: Two sides are equal in length, while the third side is different.
            Scalene: All three sides are different lengths.
       */
    private static void checkTypeOfTriangle(){
        System.out.println("Enter the length of each side of the triangle!");
        System.out.println("Enter the first side length!");
        int side1 = sc.nextInt();

        System.out.println("Enter the second side length!");
        int side2 = sc.nextInt();

        System.out.println("Enter the third side length!");
        int side3 = sc.nextInt();


        if(side1 == side2 && side2 == side3) {
            System.out.println("The triangle is Equilateral");
        } else if(side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is Isosceles");
        } else {
            System.out.println("The triangle is Scalene");
        }
        sc.close();
    }


    // 19. Java Program to check whether a person is valid for vote or not using if-else?
    private static void isElligibleToVote() {
        System.out.println("Enter your Age!!");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Elligible to vote");
        } else {
            System.out.println("Not Elligible to vote");
        }
        sc.close();
    }

    /*
    *  20. Java Program to check Division on the basis of marks obtained by students. Percentage >=
    * 60% : Division 1, Percentage >= 45% : Division 2, Percentage >= 30% : Division 3, Percentage < 30% :
    * Fail
    *
    * 21. Java Program to Calculate percentage and grade of students on the basis of marks obtained
    * in 5 subjects Maths, Physics, Chemistry, English and Hindi. Marks of subject is taken as an input:
    * Percentage >= 90% : Grade A, Percentage >= 80% : Grade B, Percentage >= 70% : Grade C, Percentage
    * >= 60% : Grade D, Percentage >= 40% : Grade E, Percentage < 40% : Grade
    * */
    private static void checkDivision() {
        System.out.println("Enter the students roll number");
        int roll = sc.nextInt();
        double maths = 0;
        double nepali = 0;
        double science = 0;
        boolean mathsAdded = false;
        boolean scienceAdded = false;
        boolean nepaliAdded = false;
        boolean nextVal = true;
        int totalMarks = 300;

        while(nextVal) {
            String menu = "Enter the marks obtained by the student for \n Maths(M), Science(S), Nepali(N) \n" +
                    "Use M for maths , S for science & N for nepali";
            System.out.println(menu);
            char userInput = sc.next().charAt(0);
            userInput = Character.toLowerCase(userInput);
            switch (userInput) {
                case 'm':
                    System.out.println("Enter the marks obtained by the student in Maths");
                    if (mathsAdded) {
                        System.out.println("Marks already added for Maths! Do you want to re enter it ? \n Type y for yes and n for no.");
                        char updateMathScore = sc.next().charAt(0);
                        if (Character.toLowerCase(updateMathScore) == 'y') {
                            System.out.println("Please re enter the marks");
                            maths = sc.nextDouble();
                        }
                    } else {
                        maths = sc.nextDouble();
                    }
                    mathsAdded = true;
                    break;
                case 'n':
                    System.out.println("Enter the marks obtained by the student in Nepali");
                    if (nepaliAdded) {
                        System.out.println("Marks already added for Nepali! Do you want to re enter it ? \n Type y for yes and n for no.");
                        char updateNepaliScore = sc.next().charAt(0);
                        if (Character.toLowerCase(updateNepaliScore) == 'y') {
                            System.out.println("Please re enter the marks");
                            nepali = sc.nextDouble();
                        }
                    } else {
                        nepali = sc.nextDouble();
                    }
                    nepaliAdded = true;
                    break;
                case 's':
                    System.out.println("Enter the marks obtained by the student in Science");
                    if (scienceAdded) {
                        System.out.println("Marks already added for Science! Do you want to re enter it ? \n Type y for yes and n for no.");
                        char updateScienceScore = sc.next().charAt(0);
                        if (Character.toLowerCase(updateScienceScore) == 'y') {
                            System.out.println("Please re enter the marks");
                            science = sc.nextDouble();
                        }
                    } else {
                        science = sc.nextDouble();
                    }
                    scienceAdded = true;
                    break;
                default:
                    System.out.println("Invalid option selected. Please enter valid response!");
                    break;
            }
            if (((mathsAdded == true) && (scienceAdded == true) && (nepaliAdded == true))) {
                nextVal = false;
            }
        }

        System.out.println("*" . repeat(50));
        System.out.println("*". repeat(15) + "Marksheet of "+ roll + "*".repeat(15));
        System.out.println("Marks in Maths: \t" + maths);
        System.out.println("Marks in Science: \t" + science);
        System.out.println("Marks in Nepali: \t" + nepali);
        System.out.println("*" . repeat(50));
        double obtainedPercent = ((maths+science+nepali) * 100)/totalMarks;
        System.out.println(obtainedPercent);
        if (obtainedPercent >= 60 && obtainedPercent <= 100) {
            System.out.println("First Division!");
        } else if (obtainedPercent >= 45 && obtainedPercent <= 59) {
            System.out.println("Second Division!");
        } else if (obtainedPercent >= 30 && obtainedPercent <= 44) {
            System.out.println("Third Division!");
        } else {
            System.out.println("Failed!!!");
        }
        System.out.println("*" . repeat(40));
        sc.close();
    }


}