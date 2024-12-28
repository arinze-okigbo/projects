import java.util.Scanner;
public class SimpleCalculator{

	public static void main(String[] args) {

		int choice;

		System.out.println("Welcome to the SimpleCalculator!!");
		System.out.println("Choose your math operator by typing the corresponding number");
		System.out.println("1 Add");
		System.out.println("2 Subtract");
		System.out.println("3 Multiply");
		System.out.println("4 Divide");

		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		System.out.print("Enter first number: "); //Asks for the first number
		int x = input.nextInt();
		System.out.print("Enter second number: "); //Asks for the second number
		int y = input.nextInt();

	public static void Add (int x, int y){

		int out = x+y;

		System.out.println(x + " + " + y  + " = " + out); 
	}

	public static void Subtract(int x, int y){

		int out = x-y;

		System.out.println(x + " - " + y + " = " + out);
	}

	public static void Multiply(int x, int y){

	    int out = x*y;

			System.out.println(x + " * " + y + " = " + out);
		}

		public static void Divide(int x, int y){

			int out = x/y;

			System.out.println(x + " / " + y + " = " + out);
		}

		if(choice == 1){
			Add(x,y);
		}

		else if(choice == 2){
			Subtract(x,y);
		}

		else if(choice == 3){
			Multiply(x,y);
		}

		else if(choice == 3){
			Divide(x,y);
		}

		
	}
}