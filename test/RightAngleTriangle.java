import java.util.Scanner;
class RightAngleTriangle{
	public static void main(String[] args){
		Scanner scn = new Scanner (System.in);

		System.out.print("Enter side 1:");
		double side1 = scn.nextDouble();

		System.out.print("Enter side 2:");
		double side2 = scn.nextDouble();

		System.out.print("Enter side 3:");
		double side3 = scn.nextDouble();

		side1 = Math.pow(side1, 2);
		side2 = Math.pow(side2, 2);
		side3 = Math.pow(side3, 2);

		if(side1 == side2 + side3){

			System.out.print("It's a RightAngleTriangle");
		}
		
		else if (side2 == side1 + side3){

			System.out.print("It's a RightAngleTriangle");
		}

		else if (side3 == side1 + side2){

			System.out.print("It's a RightAngleTriangle");

		}

		else{

			System.out.println("It's not a Right Angle triangle.");
		}


		
	


		

	}
}
	
