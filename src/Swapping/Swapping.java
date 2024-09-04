package Swapping;

/*
*
* WAP to swap 2 numbers without using a temp variable
* WAP to swap 3 numbers using a temp variable
* WAP to swap 3 numbers without using a temp variable
* */
public class Swapping {
//    public static void main(String[] args) {
//      String seperator = "*". repeat(30);
////      swapTwoNumbersUsingTemp(1,2);
////      System.out.println(seperator);
////      swapTwoNumbersWithoutUsingTemp(1,2);
////      System.out.println(seperator);
////      swapThreeNumbersUsingTemp(1,2,3);
////      System.out.println(seperator);
////      swapThreeNumbersWithoutUsingTemp(1,2,3);
////      System.out.println(seperator);
////      swapFourNumbersUsingTemp(1,2,3,4);
////      System.out.println(seperator);
//      swapFourNumbersWithoutUsingTemp(1,2,3,4);
//      System.out.println(seperator);
//
//    }
    // Program to swap 2 numbers using a temp variable
    public static void swapTwoNumbersUsingTemp(int a, int b) {
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
    public static void swapTwoNumbersWithoutUsingTemp(int a, int b) {
        System.out.println("Swapping two numbers without temp variable");

        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("-------------------------------");


        a =  a + b ; // 1 + 2 => 3 -> originally a = 1
        b = a - b; // a = 3 - 2 => 1 -> b
        a = a - b; // 3 - 1 => 2 -> a

        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
    }

    // Program to swap 3 numbers using a temp variable
    public static void swapThreeNumbersUsingTemp(int a, int b, int c) {
        System.out.println("Swapping three numbers with temp variable");

        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("Value of C : "+ c);
        System.out.println("-------------------------------");
        int temp = a; // temp -> a -> 1
        a = b; // a -> 2
        b = c; // b -> 3
        c= temp; // c -> 1

        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("Value of C : "+ c);

    }
    // Program to swap 3 numbers without using a temp variable
    public static void swapThreeNumbersWithoutUsingTemp(int a, int b,int c) {
        System.out.println("Swapping three numbers without temp variable");
        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("Value of C : "+ c);
        System.out.println("-------------------------------");
/*
* c = 1
* b = 3
* a = 2
* */
        c =  a + b + c ; // c -> 6
        b = c - ( b + a ); // 6 - 3 => 3 -> b
        a = c - (b + a ); // 6 - (3 + 1) -> 2 -> a
        c = c - (b + a); // 6 - (3+2) -> 1 ->c

//        a = a+b+c;
//        b = a -(b+c);
//        c = a -(b+c);
//        a = a -(b+c);

        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("Value of C : "+ c);
    }

    // Program to swap 3 numbers using a temp variable
    public static void swapFourNumbersUsingTemp(int a, int b, int c, int d) {
        System.out.println("Swapping Four numbers with temp variable");

        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("Value of C : "+ c);
        System.out.println("Value of D : "+ d);
        System.out.println("-------------------------------");
        int temp = a; // temp -> a -> 1
        a = b; // a -> 2
        b = c; // b -> 3
        c = d; // c -> 4
        d = temp; // d -> 1

//        int temp1 = d;
//        d = c;
//        c = b;
//        b = a;
//        a = temp1;
        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("Value of C : "+ c);
        System.out.println("Value of D : "+ d);


    }
    // Program to swap 3 numbers without using a temp variable
    public static void swapFourNumbersWithoutUsingTemp(int a, int b,int c, int d) {
        System.out.println("Swapping three numbers without temp variable");
        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("Value of C : "+ c);
        System.out.println("Value of D : "+ d);
        System.out.println("-------------------------------");
/*
* c = 4
* b = 3
* a = 2
* d = 1
* */
        d =  a + b + c + d ; // d -> (1+2+3+4) => 10
        c = d - (a + b + c); // c -> 10 - (1+2+3) => 4
        b = d - (a + b + c); // b -> 10 - (1+2+4) => 3
        a = d - (a + b + c); // a -> 10 - (1+3+4) => 2
        d = d - (a + b + c); // d -> 10 - (2+3+4) => 1

        System.out.println("Value of A : "+ a);
        System.out.println("Value of B : "+ b);
        System.out.println("Value of C : "+ c);
        System.out.println("Value of D : "+ d);
    }

}
