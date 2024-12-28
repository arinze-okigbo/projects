public class SimpleLoops{

   public static void countBy1toN(int n){
      /*
      Count up by 1 from 0 to n. Print the result to StdOut.
      If n < 0 print nothing.
      
      Ex.
      countBy1toN(3)
      0
      1
      2
      3
      countBy1toN(0)
      0
      countBy1toN(-3)
      
      */
      int i = 0;
      while (i<=n){
         StdOut.println(i);
         
         i = i + 1;
      }
     }
   
     public static void countBy1fromMtoN(int m, int n){
      /*
      Count up by 1 from m to n. Print the result to StdOut.
      If m > n print nothing.
      
      Ex.
      countBy1FromMtoN(4, 8)
      4
      5
      6
      7
      8
      countBy1FromMtoN(-1, -1)
      -1
      countBy1toN(4, -4)
      
      */
      }
   
   


   /*
   Generate the first n powers of 2. You may not use Math.pow()
   Ex.
   powersOf2(6)
   2
   4
   8
   16
   32
   64

   powersOf2(1)
   2

   powersOf2(0)
   */
   
   public static void harmonicSeries(double n){
   /*
   Generate the first n entries in the Harmonic Series.
   1, 1/2, 1/3, 1/4, 1/5, 1/6, 1/7, 1/8...1/n
   Print the output as decimal values, i.e.:
   1.0
   0.5
   0.3333333333333333
   0.25
   0.2
   0.16666666666666666
   0.14285714285714285
   0.125
   */
   
      double i = 1;
      while (i<=n){
         StdOut.println(1/i);
         
         //i = 1 / i;
         i = i + 1;
      }
   }
  }

   


   