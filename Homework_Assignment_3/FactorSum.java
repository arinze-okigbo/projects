import java.util.*;
class FactorSum{
	public static void main(String[]args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: "); //Asks for the number
		int number = input.nextInt();

		int divide = 1; //Divide Number

		int even = 0; //Even Numbers
		int odd = 0; //Odd Numbers

		while(divide<=number){

			if(number%divide == 0){//Check if is factor

				if (divide%2 == 0) //check if even
					even = even + divide;
				else
					odd = odd +divide;
				divide++;
			} 
			else
				divide++;
		}	

		System.out.println("The difference is : " + Math.abs(even-odd));		 

	}
		
}