public class Complex{
   double re; //the real part
   double im; //the imaginary part
  
   public Complex(double re, double im){
      this.re = re;
      this.im = im;
  }
  
  public String toString(){
      /*Return a String representation of this Complex
      Input:
         this: a Complex number
      Output:
         return: a String representing this Complex
      Side Effects: none
      Ex.
      Complex c1 = new Complex(1.0, 2.0)
      c1.toString() -> "1.0 + 2.0i"
      Complex c2 = new Complex(1.0, -2.0)
      c2.toString() -> "1.0 - 2.0i"
      */
      //your code goes here
      
      String im2="";
      
      if(this.im < 0){
      
      im2 =" - "+ this.im/-1 + "i";
      }
      
   
     return this.re + im2; 
   }

   public boolean equals(Complex that){
      /*Check if this equals that
      Input:
         this: a Complex number
         that: another Complex number
      Output:
         return: true if this is equivalent to that, i.e. if
                 both their real and imaginary parts are equal
      Side Effects: none
      Ex.
      Complex c1 = new Complex(1.0, 2.0);
      Complex c2 = new Complex(1.0, 2.0);
      Complex c3 = new Complex(2.0, 1.0);
      c1 == c2 -> false
      c1.equals(c2) -> true
      c2.equals(c1) -> true
      c1.equals(c3) -> false
      c3.equals(c1) -> false
      */
      
      if (this.re == that.re){
      
      return true;
      
      }
      
      if (this.im == that.im){
      
      return true;
      }
      
      else{
      
      return false;
      }
      
   }
      
   public Complex clone(){
      /*Returns a cloned copy of this Complex
      Input:
         this: a Complex number
      Output:
         return: a new Complex that is a copy of this
      Side Effects: none
      Ex.
      Complex c1 = new Complex(1.0, 2.0)
      Complex c2 = c1.clone()
      c2.toString() -> "1.0 + 2.0i"
      c2.re = -3.0
      c1.toString() -> "1.0 + 2.0i"
      c2.toString() -> "-3.0 + 2.0i"
      */
      
      return new Complex (this.re, this.im);

   }
   
   public Complex add(Complex that){
      /*Add together this and that
      Input:
         this: a Complex number
         that: another Complex number
      Output:
         return: a new Complex representing this + that
      Side Effects: none
      Ex.
      Complex c1 = new Complex(1.0, 2.0)
      Complex c2 = new Complex(2.0, -1.0)
      Complex c3 = c1.add(c2)
      c3.toString() -> "3.0 + 1.0i"
      */
      return new Complex(this.re+that.re,this.im+that.im);
   }
   
   public Complex times(double scalar){
      /*Multiply this times a scalar value
      Input:
         this: a Complex number
         double scalar: a scalar value
      Output:
         return: a Complex number representing this * scalar
      Side Effects: none
      Ex.
      Complex c1 = new Complex(1.0, -2.0)
      Complex c2 = c1.times(4.0)
      c2.toString() -> 4.0 - 8.0i
      */
      return new Complex(scalar*this.re,scalar*this.im);
   }
   
   public Complex times(Complex that){
      /*Multiply this times that
      Input:
         this: a Complex number
         that: another Complex number
      Output:
         return: a new Complex representing this * that
      Side Effects: none
      Ex.
      Complex c1 = new Complex(1.0, 2.0)
      Complex c2 = new Complex(2.0, -1.0)
      Complex c3 = c1.times(c2)
      c3.toString() -> 4.0 + 3.0i
      */
      return new Complex(this.re*that.re - this.re*that.im,this.im*that.re+this.re*that.im);
         
   }
   
    public double abs(){
      /*Return the absolute value of this Complex number
      Input:
         this: a Complex number
      Output:
         return: the absolute value of this Complex number
      Side Effects: none
      Ex.
      Complex c1 = new Complex(3.0, -4.0)
      c1.abs() -> 5.0
      */
      return (Math.sqrt(this.re*this.re + this.im*this.im));
   }

}
