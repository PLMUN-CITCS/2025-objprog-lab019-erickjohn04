import java.util.Scanner;

public class FactorialCalculator {

    // Method to get the user input (non-negative integer)
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        return scanner.nextInt();
    }

    // Method to calculate the factorial of a non-negative integer
    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        // Get the user input (non-negative integer)
        int number = getInput();

        // Ensure the input is non-negative
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
            return; // Exit if the input is negative
        }

        // Calculate the factorial
        long factorial = calculateFactorial(number);

        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
