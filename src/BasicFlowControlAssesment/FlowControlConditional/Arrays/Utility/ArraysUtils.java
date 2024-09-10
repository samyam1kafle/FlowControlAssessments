package BasicFlowControlAssesment.FlowControlConditional.Arrays.Utility;

import java.util.Arrays;


public class ArraysUtils {

    public static void findTheKElement(int[] elements, int k, boolean orderByHighest, boolean getAbsoluteValue) {
        System.out.println(Arrays.toString(elements));
        Arrays.sort(elements);
        System.out.println(Arrays.toString(elements));
        if(orderByHighest) {
            if (getAbsoluteValue) {
                System.out.println(elements[elements.length-k] +" : is the " + (k) + " largest value we have!");
            } else {
                for (int i = elements.length-1; i >= elements.length - k ; i--) {
                    System.out.println(elements[i] +" : is the " + (i+1) + " largest value we have!");
                }
            }

        } else {
            if (getAbsoluteValue) {
                System.out.println(elements[k-1] +" : is the " + (k) + " smallest value we have!");
            } else {
                for (int i = 0; i <= elements.length - k ; i++) {
                    System.out.println(elements[i] +" : is the " + (i+1) + " smallest value we have!");
                }
            }

        }
    }

    public static int[] sortTheArray(int[] elements,boolean orderByAsc){
        int arraySize = elements.length;
        if(orderByAsc){
            for (int i = 0; i < arraySize-1; i++) {
                for (int j = 0; j < arraySize-1-i; j++) {
                    if(elements[j] > elements[j+1]){
                        int swapVar = elements[j];
                        elements[j] = elements[j+1];
                        elements[j+1] = swapVar;
                    }
                }
            }
        }
        return elements;
    }

    public static void printOptions() {
        String menu = """
                    1) Write a Java program to calculate the average value of array 
                    2) Write a Java program to test if an array contains a specific value
                    3) Write a Java program to find the index of an array element
                    4) Write a Java program to remove a specific element from an array
                    5) Write a Java program to find the maximum and minimum value of an
                    array
                    6) Write a Java program to reverse an array of integer values
                    7) Write a Java program to find the duplicate values of an array of
                    integer values
                    8) Write a Java program to find the duplicate values of an array of
                    string values
                    9) Write a Java program to find the common elements between two
                    arrays (string values)
                    10) Write a Java program to remove duplicate elements from an array
                    11) Write a Java program to find the second largest element in an
                    array.
                    12) Write a Java program to find the second smallest element in an
                    array.
                    13) Write a Java program to separate even and odd numbers of a
                    given array of integers. Put all even numbers first, and then odd
                    numbers.
                    14) Write a Java program to find the k largest elements in a given
                    array. Elements in the array can be in any order
                    15) Write a Java program to find the k smallest elements in a given
                    array. Elements in the array can be in any order
                    16) Swap two array with temporary variable.
                    17) Swap three numbers with temporary variable
                    18) Program to copy all the elements of one array into another array
                    19) Program to find the frequency of each element of an array
                    20) Program to print the elements of an array in reverse order
                    21) Program to print the elements of an array present on even
                    position
                    22) Program to print the elements of an array present on odd position
                    23) Program to print the sum of all the elements of an array
                    24) Program to sort the elements of an array in ascending order
                    25) Program to sort the elements of an array in descending order
                    26) Swap two array with temp variable
                    27) Swap three array with temp variable
                    28) Terminate program
                """;
        System.out.println(" " + menu);
    }
}
