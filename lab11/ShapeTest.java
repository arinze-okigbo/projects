import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle Circle = new Circle(0,0,radius);

        System.out.println("Circle: ");
        System.out.println("Radius: " + Circle.getRadius());
        System.out.println("Area: " + Circle.calculateArea());
        System.out.println("Circumference: " + Circle.calculateCircumference());


        System.out.println("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        Rectangle Rectangle = new Rectangle(0,0,height, width);

        System.out.println("Rectangle: ");
        System.out.println("Height: " + Rectangle.getHeight() + ", " + "Width: " + Rectangle.getWidth());
        System.out.println("Area: " + Rectangle.calculateArea());
        System.out.println("Perimeter: " + Rectangle.calculateCircumference());

        

        System.out.println("Enter the height of the triangle: ");
        height = scanner.nextDouble();
        System.out.println("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        Triangle Triangle = new Triangle(0,0,height,base);

        System.out.println("Triangle: ");
        System.out.println("Height: " + Triangle.getHeight() + ", " + "Base: " + Triangle.getBase());
        System.out.println("Area: " + Triangle.calculateArea());
        System.out.println("Perimeter: " + Triangle.calculateCircumference());

        
    }
}

