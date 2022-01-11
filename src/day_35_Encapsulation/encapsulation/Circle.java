package day_35_Encapsulation.encapsulation;

public class Circle {
    /*
    Create a class named Circle

            privtae variables:
                radius

            public variable:
                pi

             Encapsulate all the private fields

                     1. radius of the circle can not be zero or negative

             Add a constructor that can set the raidus of coircle when circle object is created

             Methods:
                 calcArea()
                 calcPerimeter()
                 toString()
     */

    private double radius;

    public static double pi;

    static {
        pi = 3.14;
    }


    public double getRadius(){
        return radius;
    }


    public void setRadius(){
        if (radius<=0){
            return;
        }
        this.radius = radius;
    }



    public Circle(double radius) {
        this.radius = radius;
    }


    public double calcArea(){
        return 2*pi*radius;
    }

    public double calcPerimeter(){
        return pi*radius*radius;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", parameter=" + calcPerimeter() +
                '}';
    }
}
