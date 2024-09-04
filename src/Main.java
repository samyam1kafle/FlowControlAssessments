import static Swapping.Swapping.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        String seperator = "*". repeat(30);
        swapFourNumbersWithoutUsingTemp(1,2,3,4);
        System.out.println(seperator);

        swapThreeNumbersWithoutUsingTemp(1,2,3);
        System.out.println(seperator);

        swapTwoNumbersWithoutUsingTemp(1,2);
        System.out.println(seperator);
    }
}