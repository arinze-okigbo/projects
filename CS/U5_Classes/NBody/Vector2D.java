public class Vector2D{
   private double x; 
   private double y; 
   
   public Vector2D(double x, double y){
      /*Constructor. 
      Input:
         double x: the x coordinate
         double y: the y coordinate
      Output:
         this: a new Cartesian object
      Ex.
      Vector2D c = new Vector2D(1.0, 2.0)
      */
      this.x = x;
      this.y = y;
   }   
   public String toString(){
      /*Return a String representation of this Cartesian
      Input:
         this: a Cartesian object
      Output:
         return: a String representing this Cartesian object
      Side Effects: none
      Ex.
      Cartesian c = new Cartesian(1.0, 2.0)
      c.toString() -> (x = 1.0, y = 2.0)
      */
    
         
     return ("("+this.x + ", " + this.y + ")");
   }

   public boolean equals(Vector2D that){
      /*Check whether this is equal to that
      Input:
         this: a Cartesian object
         that: another Cartesian object
      Output:
         return: whether this and that are equal
      Side Effects: none
      Ex.
      Cartesian c1 = new Cartesian(1.0, 2.0)
      Cartesian c2 = new Cartesian(1.0, 2.0)
      Cartesian c3 = new Cartesian(2.0, 1.0)
      c1 == c2 -> false
      c1.equals(c2) -> true
      c2.equals(c1) -> true
      c1.equals(c3) -> false
      */
      
      if (this.x == that.x){
      
      return true;
      
      }
      
      if (this.y == that.y){
      
      return true;
      }
      
      else{
      
      return false;
      }

   }
   public Vector2D clone(){
      /*Create a cloned copy of this Cartesian object
      Input:
         this: a Cartesian object
      Output:
         return: a cloned copy of this
      Ex.
      Cartesian c1 = new Cartesian(1.0, 2.0)
      Cartesian c2 = c1.clone()
      c1 == c2 -> false
      c1.equals(c2) -> true
      c2.equals(c1) -> true
      */
      return new Vector2D (this.x, this.y);
      }
   
   public double getX(){
      /*Accessor. Return the x component of this
      Input:
         this: a Vector2D
      Output:
         return: the x-component of this
      Ex.
      Vector2D vec = new Vector2D(1.0, 2.0)
      vec.getX() -> 1.0
      */
      
      return this.x;

   }

   public double getY(){
      /*Accessor. Return the y component of this
      Input:
         this: a Vector2D
      Output
         return: the y-component of this
      Ex.
      Vector2D vec = new Vector2D(1.0, 2.0)
      vec.getY() -> 2.0
      */
      return this.y;
   }
   public void setX(double x){
      /*Mutator. Set the x-component of this to x
      Input:
         this: a Vector2D
         double x: the new x-component of this
      Output: none
      Side Effects: this.x is now x
      Ex.
      Vector2D vec = new Vector2D(1.0, 2.0)
      vec.setX(3.0)
      vec.toString() -> (3.0, 2.0)
      */
      this.x = x;
   }

   public void setY(double y){
      /*Mutator. Set the y-component of this to y
      Input:
         this: a Vector2D
         double y: the new y-component
      Output: none
      Side Effects: this.y is now y
      Ex.
      Vector2D vec = new Vector2D(1.0, 2.0)
      vec.setY(4.0)
      vec.toString() -> (1.0, 4.0)
      */
      this.y = y;
   }
   
   public Vector2D add(Vector2D that){
      /*Add this to that
      Input:
         this: a Vector2D
         that: another Vector2D
      Output:
         return: a new Vector2D representing this + that
      Ex.
      Vector2D vec1 = new Vector2D(1.0, 2.0)
      Vector2D vec2 = new Vector2D(-1.0, 3.0)
      Vector2D plus = vec1.add(vec2)
      plus.toString() -> (0.0, 5.0)
      */
      
      double a = this.x + that.x;
      double b = this.y + that.y;
      
      this.x = a;
      this.y = b;
      
      return new Vector2D (this.x, this.y);

   }
   
   public Vector2D subtract(Vector2D that){
      /*Subtract this from that
      Input:
         this: a Vector2D
         that: another Vector2D
      Output:
         return: a new Vector2D representing this - that
      Ex.
      Vector2D vec1 = new Vector2D(1.0, 2.0)
      Vector2D vec2 = new Vector2D(2.0, 1.0)
      Vector2D minus = vec1.subtract(vec2)
      minus.toString() -> (-1.0, 1.0)
      */
      double a = this.x - that.x;
      double b = this.y - that.y;
      
      
      
      return new Vector2D (a, b);
   }
    public Vector2D multiply(double scalar){
      /*Multiply this Vector2D by a scalar
      Input:
         this: a Vector2D
         double scalar: a scalar to multiply this
      Output:
         return: a new Vector2D representing scalar*this
      Ex.
      Vector2D vec = new Vector2D(1.0, 2.0)
      Vector2D times = vec.multiply(2.0)
      times.toString() -> (2.0, 4.0)
      */
      double a = this.x * scalar;
      double b = this.y * scalar;
      
      this.x = a;
      this.y = b;
      
      return new Vector2D (this.x, this.y);
   }
   public Vector2D divide(double scalar){
      /*Divide this Vector2D by a scalar
      Input:
         this: a Vector2D
         double scalar: the scalar to divide by
      Output:
         return: a new Vector2D representing this/scalar
      Ex.
      Vector2D vec = new Vector2D(1.0, 2.0)
      Vector2D div = vec.divide(2.0)
      div.toString() -> (0.5, 1.0)
      */
      double a = this.x / scalar;
      double b = this.y / scalar;
      
      this.x = a;
      this.y = b;
      
      return new Vector2D (this.x, this.y);
   }
   public double abs(){
      /*Return the absolute value or magnitude of this Vector2D
      Input:
         this: a Vector2D
      Output:
         return: the absolute value, a.k.a the magnitude of this
      Ex.
      Vector2D vec = new Vector2D(-3.0, 4.0)
      vec.abs() -> 5.0
      */
       double ans = Math.sqrt((this.x*this.x) + (this.y*this.y));
       
       return ans;
   }
   public Vector2D unit(){
      /*Return a unit vector in the same
      direction as this
      Input:
         this: a Vector2D
      Output:
         return: a Vector2D pointing in the same direction
         as this but with length = 1
      Ex.
      Vector2D vec = new Vector2D(3.0, 4.0)
      Vector2D vecUnit = vec.unit()
      vecUnit.toString() -> (0.6, 0.8)
      */
      double a = Math.sqrt((this.x*this.x) + (this.y*this.y));
      double a1 = this.x/a;
      double a2 = this.y/a;
      
      //this.x = a1;
      //this.y = a2;
      Vector2D result = new Vector2D(a1,a2);
      return result;
    }
    
    public double dot(Vector2D that){
      /*Calculate the dot product of this and that
      Input:
         this: a Vector2D
         that: another Vector2D
      Output:
         return: this dot that
      Ex.
      Vector2D vec1 = new Vector2D(0.0, 5.0)
      Vector2D vec2 = new Vector2D(1.0, 2.0)
      vec1.dot(vec2) -> 10.0
      */
      
      double a = (this.x * that.x) + (this.y * that.y);
      
      return a;
   }
}