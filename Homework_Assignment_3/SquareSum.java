import java.util.Scanner;

class SquareSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: "); // Ask for the number
        int n = input.nextInt();
        int sum = 0;  

        
        while (n > 0) {
            int digit = n % 10;  // Extract the last digit
            sum += Math.pow(digit, 2);  // Add the square of the digit to the sum
            n /= 10;  // Remove the last digit
        }

        System.out.println("The summation is: " + sum);  // Output the result
    }
}
