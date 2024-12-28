public class ForLoops{
 
  public static double Euler(double n){
  
     /*Calculates the sum of the first n entries in the infinite
   series defining Euler's number
   1/1 + 1/1 + 1/(1*2) + 1/(1*2*3) + ...
     
   Ex.
   eulerSeries(1) -> 1.0
   eulerSeries(2) -> 2.0
   eulerSeries(3) -> 2.5
   eulerSeries(4) -> 2.6666666666666665
   eulerSeries(10)-> 2.7182815255731922
   */

        double x = 1;
        
        
        double r = 1;
        
        
        for (double i = 1; i<n; i++){
        
        
        x*=i;
        
        
        r = r+1/x;
        
     }
     
    return r;
    
    }
 
public static double pi_Wallis(int n){
    
    /*Approximate the value of pi using the first n terms
   of the Wallis Infinite Product
   pi/2 = (2/1*2/3)*(4/3*4/5)*(6/5*6/7)*(8/7*8/9)...
   [NOTE: YOU WILL HAVE TO MULTIPLY BY 2 AFTER!]	
   Ex.
   pi_Wallis(1)   -> 2.6666666666666665
   pi_Wallis(2)   -> 2.844444444444444
   pi_Wallis(3)   -> 2.9257142857142853
   pi_Wallis(10)  -> 3.0677038066434976
   pi_Wallis(100) -> 3.133787490628159
   */

    double product = 1;
    
    double a = 2;
    
    
    double bottom = 1;
    
    
    for (double i = 1; i<=n; i++){
    
       product *= ((a/bottom)*(a/(bottom+2)));
       
       a+=2;
       
       bottom+=2;
       
       }
       
       return 2*product;
    }


 public static double pi_GL(int n){
 
   /*Approximate pi using the first n terms of the
   Gregory-Leibniz Series
   4/1 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + 4/13...
   
   Ex.
   pi_GL(1)   -> 4.0
   pi_GL(2)   -> 2.666666666666667
   pi_GL(10)  -> 3.0418396189294032
   pi_GL(100) -> 3.1315929035585537
   */

    double total = 0;
    
    for (double i = 1; i<=n; i++){
       
       if (i%2==1){
       
          total += (4/((i*2)-1));
       }
       
       else{
          total -= (4/((i*2)-1));
       }
     }
     return total;
     }
  
     
public static double pi_NK(int n){

   /*Calculate pi using Nilakantha's Series
  pi = 3 + 4/(2*3*4) - 4/(4*5*6) + 4/(6*7*8)...
  
  Ex.
  pi_NK(1)    -> 3.0
  pi_NK(2)    -> 3.1666666666666665
  pi_NK(3)    -> 3.1333333333333333
  pi_NK(10)   -> 3.141839618929402
  pi_NK(100)  -> 3.1415929035585544
  pi_NK(1000) -> 3.1415937731606722
  */

  double bottom = 2;
  
  double bottom2 =3;
  double bottom3 = 4;
  double ans = 0;
  
    for (double i = 1; i<n; i++){
       if (i%2==1){
             ans += (4/(bottom*(bottom+1)*(bottom+2)));
          bottom+=2;
          
          bottom2+=2;
          
          bottom3+=2;
          
         }
       else{
             ans -= (4/(bottom*(bottom+1)*(bottom+2)));
          bottom+=2;
          
          bottom2+=2;
          
          bottom3+=2;
          
          }
         
      }
       return  ans+3;
}
}
