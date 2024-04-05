package OOP;

// Lớp cha
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Lớp con 1
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Lớp con 2
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Lớp con 3
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Tạo các đối tượng từ các lớp con và gọi phương thức draw
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        Shape shape3 = new Triangle();

        shape1.draw(); // Drawing a circle
        shape2.draw(); // Drawing a rectangle
        shape3.draw(); // Drawing a triangle
    }
}
