public class ordered {
  public static void testOrdered(){
   /*Tests whether ordered() works properly*/

   StdOut.println("------------------------------");
   StdOut.println("Testing ordered():");
      
   //Test 1.1
   Testing.testEquals("Test 1.1", ordered(1, 1, 1), true);
   
   //Test 1.2
   Testing.testEquals("Test 1.2", ordered(3, 1, 2), true);
   
   //Test 1.3
   Testing.testEquals("Test 1.3", ordered(3, 8, 2), false);
   
   
   
}
   
   }

