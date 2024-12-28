class GFG {
  
        static void Fibonacci(int n)
      /*Calculate the nth Fibonacci number (use 0-based indexing)
      Ex.
      fibonacci(0) -> 0
      fibonacci(1) -> 1
      fibonacci(2) -> 1
      fibonacci(3) -> 2
      fibonacci(4) -> 3
      fibonacci(5) -> 5
      */
  
    {
        int num1 = 0, num2 = 1;
  
        int i = 0;
  
        while (i < n) {
  

            
  
            
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            i = i + 1;
     
        }
        System.out.print(num1 + " ");
    }
  
    
    public static void main(String args[])
    {
    
        int n = 10;
  
        Fibonacci(n);
    }
}