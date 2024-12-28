public class isOdd{
   public static int sumGeometric(int n, double r){
   
   int p = 1
   double s = 1;
   
   double r2 = r
   
   while(p<n){
   s+=(r2);
   r2*=r2;
   p++;
   
   return s;
 
      }
   }  