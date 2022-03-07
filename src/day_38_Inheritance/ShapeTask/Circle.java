package day_38_Inheritance.ShapeTask;

public class Circle extends Shape{



    public double r;
    public static double pi = 3.14;

    public Circle(double r) {
        super("Circle");
        this.r = r;
    }

    @Override
    public double area() {
        return pi*r*r;
    }

    @Override
    public double perimeter() {
        return 2*pi*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", r=" + r +
                ", pi=" + pi +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }

    /*
    Circle
    r
    pi

    toString(): name, r, pi, area, perimeter
     */
}
