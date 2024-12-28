/*
Author: Arinze Okigbo
Last Updated: 12/1/2021
*/

public class MailMerge { 
   public static void main(String[] args){
      
      //Variables
      String firstname = "John" ;
      String lastname = "Adams" ;
      String mfirstname = "Rick" ;
      String mlastname = "Astley" ;
      String email = "johnadams@gmail.com" ;
      String company = "Ligma" ;
      String memail = "info@geniuswarranty.com" ;
      String mcompany = "Genius Warranty" ;
      
      StdOut.print("Dear Mr. ");
      StdOut.print(firstname);
      StdOut.print(" ");
      StdOut.print(lastname);
      StdOut.print(",");
      StdOut.println(" ");
      StdOut.println(" ");
      StdOut.print("My name is ");
      StdOut.print(mfirstname);
      StdOut.print(" ");
      StdOut.print(mlastname);
      StdOut.print(", ");
      StdOut.println("and we've been trying to reach you concerning your vehicle's extended");
      StdOut.print("warranty. You should've received a notice in your email: ");
      StdOut.print(email);
      StdOut.print(" ");
      StdOut.println("about your car's");
      StdOut.print("extended warranty eligibility. We also reached out to your company: ");
      StdOut.print(company);
      StdOut.println(". Since we've not gotten a ");
      StdOut.println("response, we're giving you a final courtesy call before we close out your file. ");
      StdOut.println(" ");
      StdOut.print( "Please email us at: ");
      StdOut.print(memail);  
      StdOut.println(" to be removed and placed on our do-not-call list. To speak to someone about");   
      StdOut.print("possibly extending or reinstating your vehicle's warranty, email us at ");   
      StdOut.print(memail); 
      StdOut.println(" to speak");
      StdOut.println("with a warranty specialist.");
      StdOut.println(" ");
      StdOut.println("Yours sincerely,");
      StdOut.println(" ");
      StdOut.print(mfirstname);
      StdOut.print(" ");
      StdOut.print(mlastname);
      StdOut.println(" ");
      StdOut.print("Sales Associate, ");
      StdOut.println(mcompany);
      StdOut.print(memail); 
      
      
      

      
      
   }
}
      
      
   
