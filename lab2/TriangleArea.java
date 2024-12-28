import java.util.Scanner;
class TriangleArea{
/*Enter the lengths of the three sides of the triangle: 
Side 1: 5
Side 2: 6
Side 3: 7
The area of the triangle is: 14.6969*/
	public static void main(String[] args){

		Scanner scnr = new Scanner(System.in);

		double side1;
		double side2;
		double side3;
		double area;

		System.out.println("Enter the lengths of the three sides of the triangle:");
		System.out.print("Side 1: ");
		side1 = scnr.nextDouble();
		System.out.print("Side 2: ");
		side2 = scnr.nextDouble();
		System.out.print("Side 3: ");
		side3 = scnr.nextDouble();

		double s = (side1 + side2 + side3)/2.0;

		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));



		System.out.printf("The area of the triangle is: %.4f", area);


	}

}

