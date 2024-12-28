public class Planet{
   //instance variables
   private double mass; //the planet's mass
   private Vector2D pos;//the planet's position
   private Vector2D vel;//the planet's velocity
   
   //static variables
   private static double G = 6.67408E-11; //gravity constant
   
   public Planet(double mass, double pos_x, double pos_y, double vel_x, double vel_y){
      /*Constructor. Initialize a new Planet object.
      Input:
         double mass: the planet's mass, kg
         double pos_x: the x-component of initial position, m
         double pos_y: the y-component of initial position, m
         double vel_x: the x-component of initial velocity, m
         double vel_y: the y-component of initial velocity, m
      Output:
         this: a new Planet object with the given mass,
         position, velocity
      Ex.
      Planet p = new Planet(100.0, 200.0, 0.0, 0.0, 200.0)
      p is a planet with mass 100, at (200, 0) moving up with
      v = (0, 200)
      */
      this.mass = mass;
      this.pos = new Vector2D(pos_x,pos_y);
      this.vel = new Vector2D(vel_x,vel_y);
   }
   public String toString(){
      /*Return a String representation of this Planet
      Input:
         this: a Planet object
      Output:
         return: a String representing this Planet
      Ex.
      Planet p = new Planet(100.0, 200.0, 0.0, 0.0, 200.0)
      p.toString() -> "m=100.0, pos=(200.0, 0.0), vel=(0.0, 200.0)"
      */
      return ("m="+ this.mass + ", pos=" +this.pos+", vel=" + this.vel);
   }
   public double getMass(){
      /*Accessor. Return this Planet's mass
      Input:
         this: a Planet object
      Output:
         return: this Planet's mass
      Ex.
      Planet p = new Planet(100.0, 200.0, 0.0, 0.0, 200.0)
      p.getMass() -> 100.0
      */
      return this.mass;
   }
   public Vector2D getPos(){
      /*Accessor. Return this Planet's position
      Input:
         this: a Planet object
      Output:
         return: this Planet's position
      Ex.
      Planet p = new Planet(100.0, 200.0, 0.0, 0.0, 200.0)
      Vector2D pos = p.getPos()
      pos.toString() -> "(200.0, 0.0)"
      */
      return this.pos;
   }
   public Vector2D getVel(){
      /*Accessor. Return this Planet's velocity
      Input:
         this: a Planet object
      Output:
         return: this Planet's velocity
      Ex.
      Planet p = new Planet(100.0, 200.0, 0.0, 0.0, 200.0)
      Vector2D vel = p.getVel()
      vel.toString() -> "(0.0, 200.0"
      */
      return this.vel;
   }
   public Vector2D displacement(Planet that){
      /*Return the displacement from this Planet to that Planet
      Input:
         this: a Planet object
         that: another Planet object
      Output:
         return: a Vector2D representing the displacement from
         this to that
      Ex.
      Planet p1 = new Planet(100.0, 200.0, 0.0, 0.0, 200.0)
      Planet p2 = new Planet(50.0, 0.0, 150.0, 150.0, 0.0)
      p1.getPos() -> (200.0, 0.0)
      p2.getPos() -> (0.0, 150.0)
      p1.displacement(p2) -> (-200.0, 150.0)
      p2.displacement(p1) -> (200.0, -150.0)
      */
      return that.pos.subtract(this.pos);
      
   }
   public double distance(Planet that){
      /*Return the distance from this Planet to that Planet
      Input:
         this: a Planet object
         that: another Planet object
      Output:
         return: a double representing the distance from this to that
      Ex.
      Planet p1 = new Planet(100.0, 200.0, 0.0, 0.0, 200.0)
      Planet p2 = new Planet(50.0, 0.0, 150.0, 150.0, 0.0)
      p1.getPos() -> (200.0, 0.0)
      p2.getPos() -> (0.0, 150.0)
      p1.distance(p2) -> 250.0
      p2.distance(p1) -> 250.0
      */
      return this.displacement(that).abs();
   }
   public double gravityMag(Planet that){
      /*Return the magnitude of the force of gravity between
      this Planet and that Planet
      Input:
         this: a Planet object
         that: another Planet object
      Output:
         return: the magnitude of the force of gravity
         between this planet and that planet
      Ex.
      Planet p1 = new Planet(100.0, 200.0, 0.0, 0.0, 200.0)
      Planet p2 = new Planet(50.0, 0.0, 150.0, 150.0, 0.0)
      p1.gravityMag(p2) -> 5.339264E-12
      p2.gravityMag(p1) -> 5.339264E-12
      
      */
      //multiply G * mass1 * mass2  DIVIDE distance sq
      
      return (G*this.mass*that.mass)/Math.pow(this.distance(that),2);
   }
   public Vector2D gravityVec(Planet that){
      /*Return a 2D vector representing the force of gravity
      from that Planet on this Planet
      Input:
         this: a Planet object
         that: another Planet object  
      Output:
         return: a Vector2D representing the force of gravity
         from that on this
      Ex.
      Planet p1 = new Planet(100.0, 200.0, 0.0, 0.0, 200.0)
      Planet p2 = new Planet(50.0, 0.0, 150.0, 150.0, 0.0)
      p1.gravityVec(p2) -> (-4.2714112E-12, 3.2035584E-12)
      p2.gravityVec(p1) -> (4.2714112E-12, -3.2035584E-12)
      */
 
      return this.displacement(that).unit().multiply(this.gravityMag(that));
   }
   public Vector2D netForce(Planet[] those){
      /*Calculate the net force acting on this Planet from those
      Planets
      Input:
         this: a Planet object
         those: an array of other Planets
      Output:
         return: a Vector2D representing the net force acting on
         this Planet from those Planets
      Ex.
      Planet p1 = new Planet(100.0, 200.0, 0.0, 0.0, 200.0)
      Planet p2 = new Planet(50.0, 0.0, 100.0, 100.0, 0.0)
      Planet p3 = new Planet(75.0, 150.0, 150.0, -150.0, -150.0)
      Planet[] those = new Planet[2]
      those[0] = p2
      those[1] = p3
      p1.gravityVec(p2) -> (-5.96947862E-12, 2.98473931E-12)
      p1.gravityVec(p3) -> (-6.33158822E-12, 1.89947646E-11)
      p1.netForce(those) ->(-1.23010668E-11, 2.19795039E-11)
      */
      Vector2D netF = new Vector2D (0,0);
      int i = 0;
      while(i<those.length){
         netF = netF.add(this.gravityVec(those[i]));
         i=i+1;
      }
      return netF;

   }
}