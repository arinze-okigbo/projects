public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(int x, int y, double height, double base) {
        super(x, y);
        this.height = height;
        this.base = base;

    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public double setHeight(double height) {
        this.height = height;
        return height;
    }

    public double setBase(double base) {
        this.base = base;
        return base;
    }

    public double calculateArea (){

      double area = (base/2)*height;

      return area;
    }

    public double calculateCircumference(){

      double circumference = base + base+ base;

      return circumference;
    }

}