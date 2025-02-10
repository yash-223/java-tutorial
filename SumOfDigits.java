import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int sum = 0;
        int temp = num; // Store original number

        // Calculate sum of digits
        while (temp != 0) {
            sum += temp % 10; // Extract last digit and add to sum
            temp /= 10;       // Remove last digit
        }

        // Display result
        System.out.println("Sum of digits of " + num + " is: " + sum);

        scanner.close();
    }
}
