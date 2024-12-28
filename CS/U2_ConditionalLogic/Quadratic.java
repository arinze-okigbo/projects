public class Quadratic{
	public static double quadY(double x, double a, double b,
double c){
		/*Returns the y-value for the given x, a, b, and c
		Inputs:
			double x: the x-coordinate
			double a: "a" in y = ax^2 + bx + c
			double b: "b" in y = ax^2 + bx + c
			double c: "c" in y = ax^2 + bx + c
		Outputs:
			return: the y-coordinate at x given a, b, c
		*/
      
       return  a * (x * x) + b * (x) + c;
     
	}
   
	public static void testQuadY(){
		/*A test client, tests quadY()
		*/
      
      StdOut.println("------------------------------");
   StdOut.println("Testing ordered():");
   //Test 1.1
      Testing.testEquals("Test QuadY", quadY(0, 2, -11, 5), "5.0");
            
	}
	
	public static double discriminant(double a, double b, double c){
		/*Returns the discriminant given a, b, and c
		*/

   return (b * b) - 4 * a * c;
   
   }
  

	public static void testDiscriminant(){
		/*A test client, tests discriminant()
	}
	
	public static int numRoots(double a, double b, double c){
		/*Returns the number of roots given a, b, and c
		*/
      
      Testing.testEquals("Test Discriminant", discriminant(2, -11, 5), "81");
	}
	
	public static int numRoots(double a, double b, double c){
		/*Returns the number of roots given a, b, and c
		*/
      
   if (b*b-4*a*c > 0) {
      return 2;
      }
   
   else if (b*b-4*a*c == 0) {
      return 1;
      }
   
   else {
      return 0;
      }

	}
	public static void testNumRoots(){
		/*A test client, tests numRoots().
	}

	public static double plusRoot(double a, double b, double c){
		/*Finds the "plus" root of the quadratic given a, b, c,i.e. 		(-b + sqrt(b^2-4ac))/(2a) <- this is not proper Java syntax
		If there is no root return NaN (read more about NaN here)
		*/
      
      Testing.testEquals("Test NumRoots", numRoots(2, -11, 5), 2);
      
	}
   public static double plusRoot(double a, double b, double c){
		   /*Finds the "plus" root of the quadratic given a, b, c,i.e. 		
      (-b + sqrt(b^2-4ac))/(2a) <- this is not proper Java syntax
		   If there is no root return NaN (read more about NaN here)
		*/
      
   double discriminant = (b * b) - 4 * a * c ;
   
   if (discriminant > 0.||discriminant == 0) {
     return (-b + Math.sqrt(discriminant))/(2*a);
     }
     
   else{
   
   return 0.0;
   
   }   
      
   }
	public static void testPlusRoot(){
		/*A test client, tests plusRoot()
		*/
      
      Testing.testEquals("Test PlusRoots", plusRoot(2, -11, 5), 0.5);

      
	}

	public static double minusRoot(double a, double b, double c){
		/*Find the "minus" root of the quadratic given a, b, c,i.e.
		(-b - sqrt(b^2-4ac))/(2a) <- this is not proper Java syntax
		If there is no root return NaN (read more about NaN here)
		*/
      
      double discriminant = (b * b) - 4 * a * c ;
   
   return (-b - Math.sqrt(discriminant))/(2*a);
	}

	public static void testMinusRoot(){
		/*A test client, tests minusRoot()
		*/
      
      Testing.testEquals("Test MinusRoots", minusRoot(2, -11, 5), 5);
	}

	public static String findRoots(double a, double b, double c){
		/*Given a, b, and c, find the roots, if any, of the
      quadratic equation y = ax^2 + bx + c. Return a String 
      containing this information, with the roots in order
		from smallest to greatest.

		Must work for all possible values of a, b, and c

		Ex:
		findRoots(-5.0, 10.0, 15.0) -> "x = -1.0 and x = 3.0"
		findRoots(1.0, -4.0, 4.0) -> "x = 2.0"
		findRoots(2.5, 5.0, 4.0) -> ""
		*/
      
      if (numRoots(a,b,c) > 0) {
         return ("x=" + plusRoot(a,b,c) + "and x = " + minusRoot(a,b,c));
      }
      else if (numRoots(a,b,c) == 0) {  
         return ("x = " + plusRoot(a,b,c));
      }
      else{
      return " ";
      
      }       
            
            
	}

	public static void testFindRoots(){
		/*A test client, tests findRoots()
		*/
      
      Testing.testEquals("Test FindRoots", findRoots(-4, 12, -9), 1.5);

	}

	public static double xSym(double a, double b, double c){
		/*Find the x-coordinate of the line of symmetry of
		y = ax^2+bx+c
		*/
      
      double x = -b / 2 * a;
      return x;
	} 

	public static void testXSym(){
		/*A test client, tests xSym().
		*/
      Testing.testEquals("Test XSym", xSym(2, -11, 5), 2.75);
	}

	public static double yVertex(double a, double b, double c){
		/*Find the y-coordinate of the vertex given a, b, c
		*/
      
      double vertex = a * (xSym(a,b,c) * xSym(a,b,c)) + b * (xSym(a,b,c)) + c;
      return vertex;
	}
	
	public static void testYVertex(){
		/*A test client, tests yVertex().
		*/
      
      Testing.testEquals("Test YVertex", yVertex(-4, 12, -9), -10.125);

	}

	public static void main(String[] args){
		/*The main method. When run, it should run your tests
		*/
      
      testQuadY();
      testXSym();
      testDiscriminant();
      testNumRoots();
      testPlusRoot();
      testMinusRoot();
      testFindRoots();
      testYVertex();1 > 2
	}
}
