public class MoreFunctions { 
   public static double ar(double a, double b, double c){
   
       double s = (a + b + c)/2;
       double area =  Math.sqrt(s*(s - a)*(s - b)*(s - c));
       return area;          
   }
   public static double interest(double p, double r, double n, double t){
    
      double in = p*( Math.pow(1 + r/n,n*t));
      return in;
   }
}