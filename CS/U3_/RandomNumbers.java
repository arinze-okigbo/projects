public class RandomNumbers{
      public static int flipCoin(){
      /*Simulate flipping a coin. Return 0 if heads, 1 if tails
      Inputs:
      Outputs:
         return: 0 if heads, 1 if tails
      */
      double flip = Math.random();
      if(flip < 0.5){//heads
         return 0;
      }
      else{//tails
         return 1;
      }
   }
      public static int flipCoins(int n){
      /*Simulate flipping a coin n times. Return the total
      number of tails.
      Input:
         int n: the number of times to flip the coin
      Output:
         return: the number of tails you flip
      */
      int numTails = 0;
      //flip the coin n times
      for(int i = 0; i < n; i++){
         numTails += flipCoin(); //flip the coin, add num. of tails
      }
      return numTails;
   }
      public static int rollDie(){
      /*Simulate rolling a 6-sided die. Return 1-6, depending on which
      value is rolled.
      Input:
      Output:
         return: 1-6 with equal probability
      */
      double roll = Math.random()*6;
      if(roll < 1){
         return 1;
      
      }
     
      else if(roll > 1 && roll < 2){
         return 2;
      
      }
      
      else if(roll > 2 && roll < 3){
         return 3;
     
      }
     
      else if(roll > 3 && roll < 4){
         return 4;
     
      }
      
      else if(roll > 4 && roll < 5){
         return 5;
     
      }
      
      else{
         return 6;
      } 
   }
      public static int rollMDice(int m){
      /*Simulate one toss of m 6-sided dice. Return the sum of the dice
      For example, the result of rollDice(2) should range from 2-12
      (but will not necessarily be uniformly-distributed). The result of 
      rollDice(4) will range from 4-24, etc.
   
      Input:
         int m: the number of dice to throw
      Output:
         return: the sum of the dice rolled
      */
      int storage = 0;
      for(int i = 0; i < m; i++){
         storage+=rollDie();
         }
         return storage;
      }
   public static void rollDieNTimes(int n){
   /*Simulate rolling one 6-sided die n times. Keep track of how 		
   often you get each value. At the end print out how many times you 	
   got each possible outcome.
   Hint: set up storage for how often you get each possible outcome
   before entering your loop.

   Input:
      int n: the number of times to roll 1 die
   Output:
      print: a message displaying how many times the die was rolled,
      and how many times each result came up
   
   Ex. (Your results will be different, every time you run, due to 	   
   randomness)
   RandomNumbers.rollDieNTimes(100)
   Rolled one die 100 times:
   1: 18
   2: 21
   3: 13
   4: 11
   5: 16
   6: 21
   */
      int a = 0;
      
      int s = 0;
      
      int d = 0;
     
      int f = 0;
     
      int g = 0;
     
      int h = 0;
     
      int store = 0;
     
      for(int i = 0; i < n; i++){
         store=rollDie();
         if (store == 1){
            a++;
         }
         if (store == 2){
            s++;
         }
         if (store == 3){
            d++;
         }
         if (store == 4){
            f++;
         }
         if (store == 5){
            g++;
         }
         if (store == 6){
            h++;
         }
      }
      StdOut.println ("1: "+a);
      StdOut.println ("2: "+s);
      StdOut.println ("3: "+d);
      StdOut.println ("4: "+f);
      StdOut.println ("5: "+g);
      StdOut.println ("6: "+h);
   }
   public static void roll2DiceNTimes(int n){
	/*Simulate rolling two 6-sided dice together, n times. Keep track
	of the sum of the two dice from each round. At the end, print 
	out how many times you got each possible outcome

	Hint: set 	up storage for how often you get each possible outcome 	before entering your loop (what possible outcomes are there?).

	Input:
		int n: the number of times you will roll 2 dice
	Output:
		print: how often you got each possible sum of the 2 dice

	Ex. (Your results will be different, every time you run, due to 		randomness)

	roll2DiceNTimes(100)
	
	Rolled two dice 100 times:
	2: 3
	3: 5
	4: 9
	5: 7
	6: 14
	7: 18
	8: 10
	9: 18
	10: 8
	11: 4
	12: 4
	*/
      int a = 0;
      
      int b = 0;
      
      int c = 0;
      
      int d = 0;
      
      int e = 0;
      
      int f = 0;
      
      int g = 0;
      
      int h = 0;
      
      int i = 0;
      
      int j = 0;
      
      int k = 0;
      
      for(int y = 0; y < n; y++){
      int storage = rollDie();
      int storage2 = rollDie();
      int storage3 = storage + storage2;
         if (storage3 == 2){
         a++;
         }
         if (storage3 == 3){
         b++;
         }
         if (storage3 == 4){
         c++;
         }
         if (storage3 == 5){
         d++;
         }
         if (storage3 == 6){
         e++;
         }
         if (storage3 == 7){
         f++;
         }
         if (storage3 == 8){
         g++;
         }
         if (storage3 == 9){
         h++;
         }
         if (storage3 == 10){
         i++;
         }
         if (storage3 == 11){
         j++;
         }
         if (storage3 == 12){
         k++;
         }
      }
      StdOut.println ("2: "+a);
      StdOut.println ("3: "+b);
      StdOut.println ("4: "+c);
      StdOut.println ("5: "+d);
      StdOut.println ("6: "+e);
      StdOut.println ("7: "+f);
      StdOut.println ("8: "+g);
      StdOut.println ("9: "+h);
      StdOut.println ("10: "+i);
      StdOut.println ("11: "+j);
      StdOut.println ("12: "+k);
   }
}