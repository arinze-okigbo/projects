import java.util.Scanner;
public class TotalCostCalculator{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the total number of items purchased: ");

		int totalItems = input.nextInt();

		System.out.print("Enter the price of each item: $");

		double pricePerItem = input.nextDouble();
	
		double totalCost = totalItems * pricePerItem;

		if (totalCost >= 100 && totalItems >= 5){
		
			double discount = 0.10 * totalCost;

			totalCost -= discount;
			
			System.out.println("A 10% discount has been applied.");
		}
		
		System.out.println("Total cost before discount: $" + totalCost);

		System.out.println("Total cost after discount: $" + totalCost);
	}
}
	