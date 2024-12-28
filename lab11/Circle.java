public class Circle extends Shape {
    private double radius;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double setRadius(double radius) {
        this.radius = radius;
        return radius;
    }

    public double calculateArea (){

      double area = Math.PI * Math.pow(radius,2);

      return area;
    }

    public double calculateCircumference(){

      double circumference = 2* Math.PI * radius;

      return circumference;
    }

}