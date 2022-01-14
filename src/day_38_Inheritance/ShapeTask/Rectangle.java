package day_38_Inheritance.ShapeTask;

public class Rectangle extends Shape{


/*
Rectangle
    l
    w

    toString(): name, l, w, area, perimeter
 */


    public double l;
    public double w;

    public Rectangle(double l, double w) {
        super("Rectangle");
        this.l = l;
        this.w = w;
    }


    @Override
    public double area() {
        return l*w;
    }

    @Override
    public double perimeter() {
        return 2*(l+w);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", l=" + l +
                ", w=" + w +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
