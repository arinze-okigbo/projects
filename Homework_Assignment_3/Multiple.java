import java.util.Scanner;

class Multiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: "); // Ask for the number
        int n = input.nextInt();

        int i = 1;
        int gcd = 0;
        int lcm = 0;

            while(i<=n && i<=10){ // iterates through to n to find greatest divisor of n and 10
                if(n%i==0 && 10%i ==0){ //ChecksforGcd
                    gcd = i;
                }
                i++;
            }
            lcm = ((n*10)/gcd);

        System.out.println("The smallest multiple of both 10 and "+ n + " is " + lcm);

    }
}