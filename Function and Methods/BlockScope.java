import java.util.Scanner;

public class BlockScope {

    // Method to compute sum of digits
    public static int sumOfDigits(int number) {

        int sum = 0;

        while (number != 0) {

            int lastDigit = number % 10;   // find last digit
            sum = sum + lastDigit;         // add to sum
            number = number / 10;          // remove last digit
        }

        return sum;
    }

    // Test the method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.println("Sum of digits = " + sumOfDigits(n));
    }
}
