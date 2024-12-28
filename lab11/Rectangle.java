public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(int x, int y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;

    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double setHeight(double height) {
        this.height = height;
        return height;
    }

    public double setWidth(double width) {
        this.width = width;
        return width;
    }

    public double calculateArea (){

      double area = height * width;

      return area;
    }

    public double calculateCircumference(){

      double circumference = height + height + width + width;

      return circumference;
    }

}