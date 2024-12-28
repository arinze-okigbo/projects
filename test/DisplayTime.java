import java.util.Scanner;
class DisplayTime{
	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);

		System.out.print ("How many seconds: ");

		int seconds = scn.nextInt();
		int minutes = seconds/60;
		int secondsLeft = minutes%60;

		System.out.println("There are " + minutes + " minutes and " + secondsLeft + " seconds");

	}

	
}
