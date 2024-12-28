/*
Author: Arinze Okigbo
Last Updated: 12/6/2021
*/

public class SpyName { 
   public static void main(String[] args){
      StdOut.println("Hello, Welcome to SpyName.java!");
      StdOut.println (" ");
      
      //Asks for name
      StdOut.print( "Full Name (no spaces): ");
      String name = StdIn.readString();
      
      //Ask for no. of letters in first name
      StdOut.print( "How many letters in your first name?: ");
      int fln = StdIn.readInt();
      
      //Ask for no. of letters in last name
      StdOut.print( "How many letters in your last name?: ");
      int lln = StdIn.readInt();
      
      //Asks Street
      StdOut.print( "What street you were born on (no spaces)?: ");
      String street = StdIn.readString();
      
      StdOut.print( "What street suffix did you just use?: ");
      String suffix = StdIn.readString();
      
      StdOut.print( "Ok, your spy name is... ");
      
      StdOut.print (name.substring (fln,(name.length()-lln)));
      StdOut.print(" ");
      StdOut.print (street.substring (0,(street.length()-suffix.length())));
      
      
      

      
   }
}
      
      
      


      
      

