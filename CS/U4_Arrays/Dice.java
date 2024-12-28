import java.util.Arrays;
public class Dice{
   public static int rollNormalDice(){
      /*Return a random roll of 2 normal dice
      Input: none
      Output: the sum of a roll of two normal dice
      */
      //setup Die #1
      int[] die1 = new int[6];
      die1[0] = 1;
      die1[1] = 2;
      die1[2] = 3;
      die1[3] = 4;
      die1[4] = 5;
      die1[5] = 6;
      //setup Die #2
      int[] die2 = new int[6];
      die2[0] = 1;
      die2[1] = 2;
      die2[2] = 3;
      die2[3] = 4;
      die2[4] = 5;
      die2[5] = 6;
      //Pick random faces for each die
      int face1 = StdRandom.uniform(6); //a random number [0-6)
      int face2 = StdRandom.uniform(6); //a random number [0-6)
      return die1[face1] + die2[face2];
   }
   
   public static int rollSichermanDice(){
   /*Return a random roll of Sicherman dice
   Die 1: [1, 2, 2, 3, 3, 4]
   Die 2: [1, 3, 4, 5, 6, 8]
   
   Input: none
   Output: the sum of a roll of 2 Sicherman dice
   */
   int[] sdie1 = new int[6];
      sdie1[0] = 1;
      sdie1[1] = 2;
      sdie1[2] = 2;
      sdie1[3] = 3;
      sdie1[4] = 3;
      sdie1[5] = 4;
      //setup Die #2
      int[] sdie2 = new int[6];
      sdie2[0] = 1;
      sdie2[1] = 3;
      sdie2[2] = 4;
      sdie2[3] = 5;
      sdie2[4] = 6;
      sdie2[5] = 8;
      
      int sface1 = StdRandom.uniform(6); //a random number [0-6)
            int sface2 = StdRandom.uniform(6); //a random number [0-6)
            return sdie1[sface1] + sdie2[sface2];
   }

   public static int[] rollNormalDiceNTimes(int n){
   /*Roll a pair of normal dice n times.
   Input:
      int n: the number of times to roll the pair of dice
   Output:
      return: an int[] showing the number of times you got
              each outcome (the index of the array is the
              outcome sum, the value of the array is the
              number of times you got that outcome)
   Ex.
   If you rolled the following: 4, 6, 7, 4, 5, 6, 3
   the output would be:
   rollNormalDiceNTimes(7) -> [0, 0, 0, 1, 2, 1, 2, 1,...
                        index: 0  1  2  3  4  5  6  7 ...
   */
      
   int[] sum = new int[13];
   
      
      int i = 0;
      
      while(i<n){
        
         int sumx = rollNormalDice();
         
         if( sumx == 2){
         
         sum[2] = sum[2] + 1;
         }
         
         if(sumx == 3){
         
         sum[3] = sum[3] + 1;
         }
         
         if(sumx == 4){
         
         sum[4] = sum[4] + 1;
         }
         
         if(sumx == 5){
         
         sum[5] = sum[5] + 1;
         }
         
         if(sumx == 6){
         
         sum[6] = sum[6] + 1;
         }
         
         if(sumx == 7){
         
         sum[7] = sum[7] + 1;
         }
         
         if(sumx == 8){
         
         sum[8] = sum[8] + 1;
         }
         
         if(sumx == 9){
         
         sum[9] = sum[9] + 1;
         }
         
         if(sumx == 10){
         
         sum[10] = sum[10] + 1;
         }
         
         if(sumx == 11){
         
         sum[11] = sum[11] + 1;
         }
         
         if(sumx == 12){
         
         sum[12] = sum[12] + 1;
         }

         i = i + 1;
      }
 
 return sum;
   
   }
   
   public static int[] rollSichermanDiceNTimes(int n){
   /*Roll a pair of Sicherman dice n times.
   Input:
      int n: the num. of times to roll the Sicherman dice
   Output:
      return: an int[] showing the number of times you got
              each outcome (the index of the array is the
              outcome sum, the value of the array is the
              number of times you got that outcome)
   Ex.
   If you rolled the following: 4, 6, 7, 4, 5, 6, 3
   the output would be:
   rollSichermanDiceNTimes(7) -> [0, 0, 0, 1, 2, 1, 2, 1,...
                           index: 0  1  2  3  4  5  6  7 ...
   */
   int[] sum = new int[13];
   
      
      int i = 0;
      
      while(i<n){
        
         int sumx = rollSichermanDice();
         
         if( sumx == 2){
         
         sum[2] = sum[2] + 1;
         }
         
         if(sumx == 3){
         
         sum[3] = sum[3] + 1;
         }
         
         if(sumx == 4){
         
         sum[4] = sum[4] + 1;
         }
         
         if(sumx == 5){
         
         sum[5] = sum[5] + 1;
         }
         
         if(sumx == 6){
         
         sum[6] = sum[6] + 1;
         }
         
         if(sumx == 7){
         
         sum[7] = sum[7] + 1;
         }
         
         if(sumx == 8){
         
         sum[8] = sum[8] + 1;
         }
         
         if(sumx == 9){
         
         sum[9] = sum[9] + 1;
         }
         
         if(sumx == 10){
         
         sum[10] = sum[10] + 1;
         }
         
         if(sumx == 11){
         
         sum[11] = sum[11] + 1;
         }
         
         if(sumx == 12){
         
         sum[12] = sum[12] + 1;
         }

         i = i + 1;
      }
 
 return sum;
   
   }

   public static void main(String[] args){
      /*
      Welcome to _(you fill in)_____. This program compares ___(you fill in)_______.
   How many times would you like to roll the dice?
   5
   Normal Dice:
   [0, 0, 0, 0, 1, 0, 0, 1, 3, 0, 0, 0, 0]
     Sicherman Dice:
   [0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0]
      */
      
      
      StdOut.print("Welcome to DiceRoll. This program compares noraml dice rolls and the Sicherman Dice Rolls");
      StdOut.println("How many times would you like to roll the dice?");
      int trials = StdIn.readInt();
      
      StdOut.println("Normal Dice:");
      StdOut.println(Arrays.toString(rollNormalDiceNTimes(trials)));
      StdOut.println("Sicherman Dice:");
      StdOut.println(Arrays.toString(rollSichermanDiceNTimes(trials)));
      
   }    


}