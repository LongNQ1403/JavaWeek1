package OOP;

/**
 * Shape
 */

abstract class Shape {
    // properties //
    String color;

    // abstract methods //
    abstract double area();

    abstract String printInfor();

    // constructor //
    public Shape(String color) {
        System.out.println("Shape constructor is called");
        this.color = color;
    }

    // non-abstract method //
    public String getColor() {
        return color;
    }
}

/**
 * Circle
 */
class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle constructor is called");
        this.radius = radius;
        // TODO Auto-generated constructor stub
    }

    @Override
    double area() {
        // TODO Auto-generated method stub
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    String printInfor() {
        // TODO Auto-generated method stub
        return "Circle color is " + super.getColor()
                + " and area is : " + area();
    }
}

class Rectangle extends Shape implements MyInterface {

    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        System.out.println("Rectangle constructor is called");
        this.length = length;
        this.width = width;
        // TODO Auto-generated constructor stub
    }

    @Override
    double area() {
        // TODO Auto-generated method stub
        return length * width;
    }

    @Override
    String printInfor() {
        // TODO Auto-generated method stub
        return "Rectangle color is " + super.getColor()
                + "and area is : " + area();
    }

    @Override
    public double calculatePerimeter() {
        // TODO Auto-generated method stub
        return (length + width) * 2;
    }

}

public class Abstraction {

    public static void main(String[] args) {
        Shape shape1 = new Circle("white", 5);
        System.out.println(shape1.printInfor());
        
        Rectangle rectangle = new Rectangle("red", 5, 6);
        System.out.println(rectangle.area());
        System.out.println(rectangle.calculatePerimeter());
    }
}
