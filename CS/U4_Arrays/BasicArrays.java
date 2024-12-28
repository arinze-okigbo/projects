import java.util.Arrays;
public class BasicArrays{
   public static String[] studentNames(){
      /*Returns an array of all of the first names of students in
      this class, sorted alphabetically A->Z by first name
      Inputs: none
      Outputs:
          return: a String[] with alphabetized student first names
      Ex.
      studentNames() -> [Ryan, Chao, Lucy, Arinze,...]
      */
   
      String[] names = new String[15];
      
      
      names[0] = "Adam"; 
      
      
      names[1] = "Arinze";
      
      
      names[2] = "Carly";
      
      
      names[3] = "Chao";
      
      
      names[4] = "Gage";
      
     
      names[5] = "Jeremy";
      
      
      names[6] = "Justin";
      
      
      names[7] = "Kai";
      
      
      names[8] = "Lucy";
      
      
      names[9] = "Maddy";
      
    
      names[10] = "Peter";
      
      
      names[11] = "Robinson";
      
      
      names[12] = "Ryan";
      
      
      names[13] = "Selene";
      
      
      names[14] = "Teddy";
      
      return names;

}

   public static double[] taxBrackets(){
      /*Returns a double[] containing the marginal tax rates for
      the US. Income Tax, sorted from lowest to highest.
      Input: none
      Output:
          return: a double[] containing the US marginal tax rates
                  sorted from low to high. Convert percentages to
                  decimals, i.e. 10% -> 0.10
      */

   double[] tax = new double[7];
      
      
      tax[0] = 0.10; 
      
      
      tax[1] = 0.12;
      
      
      tax[2] = 0.22;
      
      
      tax[3] = 0.24;
      
      
      tax[4] = 0.32;
      
     
      tax[5] = 0.35;
      
      
      tax[6] = 0.37;
     
     return tax;
}

   public static void januaryCalendar(){
   /*Print out a representation of the monthly calendar for
   April 2022. There should be 0s for days not in April.
   Inputs: none
   Outputs:
      print: a representation of the monthly calendar for 
      April 2022
   */
   //Make storage for the days in each week
   int[] week1 = new int[7]; //calendar day of Sun(0)-Sat(6)
   int[] week2 = new int[7]; //calendar day of Sun-Sat week 2
   int[] week3 = new int[7];
   int[] week4 = new int[7];
   int[] week5 = new int[7];
       //...KEEP GOING. How many weeks do you need?

   //Store the appropriate date in each day of the week
   //Remember, days not in April should be 0
   week1[0] = 0;
   week1[1] = 0;
   week1[2] = 0;
   week1[3] = 0;
   week1[4] = 0;
   week1[5] = 1;
   week1[6] = 2;
   
   week2[0] = 3;
   week2[1] = 4;
   week2[2] = 5;
   week2[3] = 6;
   week2[4] = 7;
   week2[5] = 8;
   week2[6] = 9;
   
   week3[0] = 10;
   week3[1] = 11;
   week3[2] = 12;
   week3[3] = 13;
   week3[4] = 14;
   week3[5] = 15;
   week3[6] = 16;
   
   week4[0] = 17;
   week4[1] = 18;
   week4[2] = 19;
   week4[3] = 20;
   week4[4] = 21;
   week4[5] = 22;
   week4[6] = 23;
   
   week5[0] = 24;
   week5[1] = 25;
   week5[2] = 26;
   week5[3] = 27;
   week5[4] = 28;
   week5[5] = 29;
   week5[6] = 30;

   

   //print out the calendar view
   StdOut.println(Arrays.toString(week1));
   StdOut.println(Arrays.toString(week2));
   StdOut.println(Arrays.toString(week3));
   StdOut.println(Arrays.toString(week4));
   StdOut.println(Arrays.toString(week5));
   
   //...KEEP GOING. Print out all of the weeks!


}

   public static int[] ones(int n){
   /*Return an n-length int[] full of 1s
   Input:
      int n: how long the final array should be
   Output:
      return: an int[] with n 1s in it
   Ex.
   ones(4) -> [1, 1, 1, 1]
   */
   int[] arr = new int[n]; //make storage with n bins
   for(int i = 0; i < n; i++){ //traverse the array
      arr[i] = 1; //assign each element to be 1
   }
   return arr;
}

public static int[] powersOf2(int n){
   /*Return the first n powers of 2
   Input:
      int n: how many powers of 2 to calculate
   Output:
      return: int[] containing 2^1 to 2^n
   Ex.
   powersOf2(5) -> [2, 4, 8, 16, 32]
   */
   
   int i = 2;
   
    int[] arr = new int[n];
   
      while (i<=n){
      
   for(int x = 0; x < n; x++){
   arr[x] = i;
         
         i = (i * 2);

      }

   }

   return arr;
   }
   
   public static void monthlyCalendar(int startDay, int numDays){
   /*Print out a monthly calendar given the number of days and
   starting day of the week
   Input:
      int startDay: the weekday of the 1st (0 = Sun, 6 = Sat)
      int numDays: the number of days in the month (28-31)
   Output:
      print: a monthly calendar
   Ex.
   monthlyCalendar(2, 30);
     [0, 0, 1, 2, 3, 4, 5]
     [6, 7, 8, 9, 10, 11, 12]
     [13, 14, 15, 16, 17, 18, 19]
     [20, 21, 22, 23, 24, 25, 26]
     [27, 28, 29, 30, 0, 0, 0]
     [0, 0, 0, 0, 0, 0, 0]
   */
   int[] week1 = new int[7];
   int[] week2 = new int[7];
   ...
   int[] week6 = new int[7]; //a month can span 6 weeks at most
   
   //figure out how to make each week look right
   
   //print out the calendar week by week
   StdOut.println(Arrays.toString(week1));
   StdOut.println(Arrays.toString(week2));
   ...
   StdOut.println(Arrays.toString(week6));
}


}