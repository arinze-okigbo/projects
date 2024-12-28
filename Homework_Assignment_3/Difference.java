import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        int product = 1;
        int sum = 0;
        
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        
        int difference = product - sum;
        System.out.println("The difference is: " + difference);
    }
}
