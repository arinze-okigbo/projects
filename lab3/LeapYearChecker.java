import java.util.Scanner;
public class LeapYearChecker{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: "); //Asks for the year
		int year = input.nextInt();

		if(year % 100 != 0 && year % 4 == 0)
			System.out.println(year + " is a leap year");

		else if (year % 400 == 0)
			System.out.println(year + " is a leap year");
		
		else
			System.out.println(year + " is not a leap year");

	}
}