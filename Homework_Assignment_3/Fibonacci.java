import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: "); // Ask for the number
        int n = input.nextInt();
        int check = 2;
        int first = 0;
        int second = 1;
        int third = 0;

        while(check<n){
            third = first + second;
            first = second;
            second = third;
            check++;
        }

        System.out.println(n + "th Fibonacci number is " + third);
    }
}