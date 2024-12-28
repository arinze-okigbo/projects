import java.util.Scanner;
public class TicketPriceCalculator{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your age: "); //Asks for the age
		int age = input.nextInt();

		System.out.print("Enter the time of the movie show (in 24-hour format, e.g., 15 for 3 PM): ");
		int time = input.nextInt();

		double ticketPrice = 10.0;

		if(time>18)
			ticketPrice += 2.0;

		if(age<12 || age > 65);
			ticketPrice = ticketPrice - (ticketPrice*0.25);

		System.out.println("The final ticket price is: $" + ticketPrice);










		



	}
}