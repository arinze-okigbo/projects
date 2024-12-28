/*
Author: Arinze Okigbo
Last Updated: 12/3/2021
*/

public class TemperatureConversion { 
   public static void main(String[] args){
      StdOut.println("Hello, Welcome to TemperatureConversion.java!");
      //insert Fahrenheit
      StdOut.print( "Temp F: ");
      double fahr = StdIn.readDouble();
      double celc= 5.0/9.0*(fahr-32);
      double kelv= celc+273.15;
      
      //prints temperature.
      StdOut.print("Temp. (C) -> ");
      StdOut.println(celc);
      
      StdOut.print("Temp. (K) -> ");
      StdOut.println(kelv);

      //insert data
      StdOut.print( "Temp C: ");
      double celc2 = StdIn.readDouble();
      double fahr2= celc2+32.0;
      double kelv2= celc2+273.15;
      
      //prints temperature.
      StdOut.print("Temp. (F) -> ");
      StdOut.println(fahr2);
      
      StdOut.print("Temp. (K) -> ");
      StdOut.println(kelv2);
      
      //insert data
      StdOut.print( "Temp K: ");
      double kelv3 = StdIn.readDouble();
      double celc3= 273.15-kelv3;
      double fahr3= celc2+32.0;
      
      //prints temperature.
      StdOut.print("Temp. (F) -> ");
      StdOut.println(fahr3);
      
      StdOut.print("Temp. (C) -> ");
      StdOut.println(celc3);
      




      
      
      
            
      

      


   }
}
      
