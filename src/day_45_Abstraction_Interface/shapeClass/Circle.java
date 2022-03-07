package day_45_Abstraction_Interface.shapeClass;

public class Circle extends Shape{

    private double radius;
    public final static double pi = 3.14;

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }


    public double getRadius(){
        return radius;}

    public void setRadius(double radius){
        if (radius<0){
            throw new RuntimeException("Invalid radius" + getRadius());
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+
                "radius=" + radius +
                '}';
    }
}
