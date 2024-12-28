public class ordered{
 public static boolean ordered( int a, int b, int c){


/* Returns true if a, b, and c are ordered smallest to
   largest, or largest to smallest

   Examples:
   ordered(1, 2, 3) -> true
   ordered(4, 2, 1) -> true
   ordered(2, 4, 1) -> false
   ordered(1, 1, 10) -> true
*/

   if (a > b && b > c) {
      return true;}
   
   else{{
     
   
   if (c > b && b > a){
      return true;}
   else{
      
      return false;}}}
   
   }
}
