public class SimpleLoops2{
   public static void divideBy2(int i){
      /* Divide i by 2 (integer division) until you get to 1. You may
      assume that i is a positive integer
      */
   
      while (i>=1){
         StdOut.println(i);
         
         i = i /2;
      }
     }

   
   public static void baselSeries(int n){
      /*Generate the first n entries in the Basel Series
      1, 1/4, 1/9, 1/16, 1/25, 1/36, 1/49...1/(n^2)
      Print the output as decimal numbers, i.e.
      1.0
      0.25
      0.1111111111111111
      0.0625
      0.04
      0.027777777777777776
      0.02040816326530612
      ...
      */
      
      double i = 1;
      while (i<=n){
         StdOut.println(1/Math.pow(i,2));
         
         i =(i + 1);
      }

   }
   
  public static void pyramidString(String s){
      /*Break a string into pyramid-shaped chunks. If there are chars
      left at the end discard/don't display them.
   
      Ex.
      pyramidString("acetyl")
      a
      ce
      tyl
   
      pyramidString("kickboxing")
      k
      ic
      kbo
      xing
   
      pyramidString("underpublicized")
      u
      nd
      erp
      ubli
      cized
   
      pyramidString("multifrequency")
      m
      ul
      tif
      requ
      */
      
      int x = 0;
      int y = 1;
      int z = 0;
      int a = 1;
      while (s.length() >= y){
         StdOut.println(s.substring(x,y));
         z += 1;
         x += z;
         a += 1;
         y += a;
        }
   }
   
}
  