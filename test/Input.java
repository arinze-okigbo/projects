import java.util.Scanner;
class Input{
	public static void main(String[] args){

		Scanner scnr = new Scanner(System.in);
		System.out.println("What is the base?");
		int base = scnr.nextInt();
		System.out.println("What is the height?");
		int height = scnr.nextInt();
		int area = (base*height/2);
		System.out.print("The area is: " + area);

	}
}