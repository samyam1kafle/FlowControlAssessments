package Swapping;

/*
*
* WAP to swap 2 numbers without using a temp variable
* WAP to swap 3 numbers using a temp variable
* WAP to swap 3 numbers without using a temp variable
* */
public class Swapping {
    public static void main(String[] args) {
      String seperator = "*". repeat(30);
      swapTwoNumbersUsingTemp(7,9);
      System.out.println(seperator);
      swapTwoNumbersWithoutUsingTemp(4,3);
      System.out.println(seperator);
      swapThreeNumbersUsingTemp(5,6,7);
      System.out.println(seperator);
      swapThreeNumbersWithoutUsingTemp(1,2,3);
      System.out.println(seperator);
      swapFourNumbersUsingTemp(1,2,3,4);
      System.out.println(seperator);
      swapFourNumbersWithoutUsingTemp(1,2,3,4);
      System.out.println(seperator);

    }
    // Program to swap 2 numbers using a temp variable
    private static void swapTwoNumbersUsingTemp(int a, int b) {
        System.out.println("Swapping two numbers with temp variable");

        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("-------------------------------");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
    }
    // Program to swap 2 numbers without using a temp variable
    private static void swapTwoNumbersWithoutUsingTemp(int a, int b) {
        System.out.println("Swapping two numbers without temp variable");

        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("-------------------------------");

        a =  a + b ;
        b = a - b;
        a = a - b;

        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
    }

    // Program to swap 3 numbers using a temp variable
    private static void swapThreeNumbersUsingTemp(int a, int b, int c) {
        System.out.println("Swapping three numbers with temp variable");

        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("Value of C : "+ c);
        System.out.println("-------------------------------");
        int temp = a;
        a = b;
        b = c;
        c= temp;

        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("Value of C : "+ c);

    }
    // Program to swap 3 numbers without using a temp variable
    private static void swapThreeNumbersWithoutUsingTemp(int a, int b,int c) {
        System.out.println("Swapping three numbers without temp variable");
        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("Value of C : "+ c);
        System.out.println("-------------------------------");

        c =  a + b + c ;
        b = c - ( b + a );
        a = c - (b + a );
        c = c - (b + a);

        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("Value of C : "+ c);
    }

    // Program to swap 3 numbers using a temp variable
    private static void swapFourNumbersUsingTemp(int a, int b, int c, int d) {
        System.out.println("Swapping Four numbers with temp variable");

        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("Value of C : "+ c);
        System.out.println("Value of D : "+ d);
        System.out.println("-------------------------------");
        int temp = a;
        a = b;
        b = c;
        c= d;
        d = temp;

        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("Value of C : "+ c);
        System.out.println("Value of D : "+ d);


    }
    // Program to swap 3 numbers without using a temp variable
    private static void swapFourNumbersWithoutUsingTemp(int a, int b,int c, int d) {
        System.out.println("Swapping three numbers without temp variable");
        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("Value of C : "+ c);
        System.out.println("Value of D : "+ d);
        System.out.println("-------------------------------");

        d =  a + b + c + d ;
        c = d - (a + b + c);
        b = d - (a + b + c);
        a = d - (a + b + c);
        d = d - (a + b + c);

        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("Value of C : "+ c);
        System.out.println("Value of D : "+ d);
    }

}
