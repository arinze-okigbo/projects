public class Student{
   double height;
   int grade;
   boolean boarderstatus;
   String dorm;
   int tired;
   
   public Student(double h, int g, boolean b, String d, int t){
      height = h;
      grade = g;
      boarderstatus = b;
      dorm = d;
      tired = t;
   }
   
    public void moveUpAGrade(){
      grade = grade + 1;
      if(dorm == "Los Padres"){
         dorm = "Upper School";
      }
      
      if(dorm == "Lower School"){
         dorm = "Los Padres";
      }
      
      else{
         dorm = "Upper School";
      
   }
  
  }
   public void growTaller(double addheight){
      height = addheight;
   }
   
   public void sleep(int sleeptime){
      tired = sleeptime;
   }
   
   public void work(){
      tired = tired + 1;
   }



}