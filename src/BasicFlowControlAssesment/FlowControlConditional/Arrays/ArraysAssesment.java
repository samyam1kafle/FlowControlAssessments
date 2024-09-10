package BasicFlowControlAssesment.FlowControlConditional.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static BasicFlowControlAssesment.FlowControlConditional.Arrays.Utility.ArraysUtils.*;

public class ArraysAssesment {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of the array you want to create!");
        int n= sc.nextInt();
        int[] elements = new int[n];
        System.out.println("Enter the element's value!");
        for (int i = 0; i < n; i++) {
            elements[i] = sc.nextInt();
        }



        printOptions();
        System.out.println("-".repeat(40));
        System.out.println("Please Choose an option from 1-28 depending upon the program you want to run. \n");
        boolean nextOption = true;
        while(nextOption) {
            int userInput = sc.nextInt();
            if (userInput <= 0 && userInput > 28) {
                System.out.println("Invalid Option Please re Enter the valid number from 1-28 \n depending upon your preference");
                printOptions();
            } else if (userInput == 28) {
                System.out.println("Thank you for using our program! \nSee you around :)");
                nextOption = false;
            } else {
                switch (userInput) {
                    case 1 -> {
                        System.out.println("Please enter the upper limit you want to print the natural numbers to.");
                        break;
                    }
                    case 11,12,14,15 -> {
                        System.out.println("Enter the position of the `K` element you want to fetch! ");
                        int k = sc.nextInt();
                        boolean orderByHighest = false;
                        boolean getAbsoluteValue = false;
                        if(userInput == 11) {
                            getAbsoluteValue = true;
                            orderByHighest=true;
                            findTheKElement(elements, k, orderByHighest,getAbsoluteValue);
                        } else if(userInput == 12) {
                            getAbsoluteValue = true;
                            findTheKElement(elements, k, orderByHighest,getAbsoluteValue);
                        }  else if (userInput == 14) {
                            orderByHighest=true;
                            findTheKElement(elements, k, orderByHighest,getAbsoluteValue);
                        } else if(userInput == 15){
                            System.out.println("Enter the position of the smallest element you want to fetch! ");
                            findTheKElement(elements, k, orderByHighest,getAbsoluteValue);
                        }
                        break;
                    }
                    case 24,25 -> {
                        boolean orderByAsc = false;
                        if(userInput == 24) {
                            orderByAsc=true;
                            System.out.println(Arrays.toString(sortTheArray(elements, orderByAsc)));
                        } else if(userInput == 25) {
                            sortTheArray(elements, orderByAsc);
                        }
                        break;
                    }
                    default -> {
                        nextOption = false;
                        break;
                    }
                }
                try{
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("*".repeat(40));
                printOptions();
            }


        }
    }


}
