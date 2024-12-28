import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        String binary = "";
        
        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n /= 2;
        }
        
        System.out.println("Binary value: " + binary);
    }
}
