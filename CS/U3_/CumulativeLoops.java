public class CumulativeLoops{
   public static int sum100(){
   /*Add up all of the numbers from 1 to 100 (inclusive)
   */
   int sum = 0;
   int i = 1;
   while(i <= 100){
      sum += i;
      i++;
   }
   return sum;
   }
   
   public static int sum1toN(int n){
   /*Add up all of the integers from 1 to n (inclusive)
   
   Ex.
   sum1toN(4)  -> 10
   sum1toN(15) -> 120
   sum1toN(1500) -> 1125750
   */
   
   i = 0;
   sum = 0;
   
   while(i<n){
   
   sum = sum+ i;
   
   i = i + 1;
   } 
   
   return sum;   
}

public static double sumHarmonic(int n){
   /*Sum the first n entries of the Harmonic Series:
   1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 + ... 1/n
   
   Ex.
   sumN(1) -> 1.0
   sumN(2) -> 1.5
   sumN(5) -> 2.283333333333333
   */
   
    i = 0;
   sum = 0;
   
   while(i<n){
   
   sum = sum+ 1/i;
   
   i = i + 1;
   }
   
   return sum;
}
public static int factorial(int n){
   /*Calculate the value of n!, i.e.
   1 * 2 * 3 * 4 * 5 * 6 ... * n

   Ex.
   factorial(3) -> 6
   factorial(4) -> 24
   factorial(5) -> 120*/
   
   i = 0;
   sum = 0;
   
   while(i<n){
   
   sum = sum* i;
   
   i = i + 1;
   } 
   
   return sum;
   
}
}