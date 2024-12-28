import java.util.Scanner;

public class Reduce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        int steps = 0;
        
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
            steps++;
        }
        
        System.out.println("Steps: " + steps);
    }
}
