public class FiniteSort{
   public static String sort3(int a, int b, int c){
      /*Given 3 integer values, return a String with the values
        sorted in ascending order of value
        Inputs:
           int a: 1st integer
           int b: 2nd integer
           int c: 3rd integer
        Output:
           return: a String with the values sorted in ascending
                   order
   
        Examples:
           sort3(4, 2, 7) -> "2, 4, 7"
           sort3(-1, 0, -5) -> "-5, -1, 0"
           sort3(5, 0, 0) -> "0, 0, 5"
           sort3(1, 2, 3) -> "1, 2, 3"
      */
      if(a < b){
         if(b < c){
            return a+", "+b+", "+c;
         }
         else if(a < c){
            return a+", "+c+", "+b;
         }
         else{
            return c+", "+a+", "+b;
         }
      }
      else if(c < a){
         return b+", "+c+", "+a;
      }
      else{
         if(c > b){
            return b+", "+a+", "+c;
         }
         else{
            return c+", "+b+", "+a;
         }
      }
   }
   
public class testEquals{
 public static boolean testEquals( int a, int b, int c){

   if (a > b && b > c) {
      return true;}
   
   else{{
     
   
   if (c > b && b > a){
      return true;}
   else{
      
      return false;}}}}
   
   }
}
