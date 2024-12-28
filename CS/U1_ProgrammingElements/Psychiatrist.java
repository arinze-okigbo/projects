public class Psychiatrist{
   public static void main(String[] args){
      /*
      Ask the user how they are feeling then ask them 
      how they feel about that feeling. Then tell them
      how they are feeling.
      Inputs:
         StdIn:
            String feeling1: how the user is feeling
            String feeling2:how they feel about that feeling
      Outputs:
         Stdout: prints out how the user is feeling
      */
      
      //Ask the user how they are feeling
      StdOut.println( "How are you feeling right now?");
      String feeling1 = StdIn.readString();
      
      //Ask how they feel about that
      StdOut.println("And how do you feel about that?");
      String feeling2 = StdIn.readString();
      
      //Tell them how they're feeling
      StdOut.print ("It sounds like you are feeling ");
      StdOut.print (feeling2) ;
      StdOut.print(" about feeling ");
      StdOut.print (feeling1);
      StdOut.println(" right now. ");
      
   
   }
}