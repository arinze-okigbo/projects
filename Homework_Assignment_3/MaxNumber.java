import java.util.Scanner;

class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 1;
        int maxnumber = 0;

        while(n!=0){
            
            System.out.print("Enter a number: "); // Ask for a number
            int nextnumber = input.nextInt();
            n = nextnumber;
            if(nextnumber>maxnumber)
                maxnumber = nextnumber;      
        }

        System.out.print("Max is : " + maxnumber);

    }
}