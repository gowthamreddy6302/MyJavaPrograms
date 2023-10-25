package InheritancePrograms;

public class Shape {
    double Perimeter = 0.0;
    double Area = 0.0;

    public double getPerimeter() {
        return Perimeter;
    }

    public double getArea() {
        return Area;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * 3.14159265359 * radius;
    }

    @Override
    public double getArea() {
        return 3.14159265359 * radius * radius;
    }

}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Circle obj = new Circle(8.0);
        Rectangle obj1 = new Rectangle(10, 20);
        System.out.println("radius of the circle " + obj.radius);
        System.out.println("Circle Perimeter: " + obj.getPerimeter());
        System.out.println("Circle Area: " + obj.getArea());
        System.out.println("Rectangle width = " + obj1.width);
        System.out.println("Rectangle height = " + obj1.height);
        System.out.println("Rectangle perimeter = " +obj1.getPerimeter());
        System.out.println("Area of rectamgle = " + obj1.getArea());
    }
}
