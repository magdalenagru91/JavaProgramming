package day_38_Inheritance.ShapeTask;

public class Square extends Shape {

    /*
    Square
    s

    toString(): name, s, area, perimeter
     */

    public Square(double s) {
        super("Square");
        this.s = s;
    }

    public double s;

    @Override
    public double area() {
        return s * s;
    }

    @Override
    public double perimeter() {
        return 4 * s;
    }

    @Override
    public String toString() {
        return "Circle" +
                "name='" + name + '\'' +
                        ", s= " + s +
                        ", area=" + area() +
                        ", perimeter=" + perimeter() +
                        '}';

    }

    }




