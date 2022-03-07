package day_45_Abstraction_Interface.shapeClass;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = getClass().getSimpleName();
    }

    /*
    OR!!!:
    public Shape(String name) {
        this.name = name;
    }
     */

    public String getName() {return name;}

    public abstract double area();     //I made the instance so I have to provide implementation

    public abstract double perimeter();


    @Override
    public String toString() {
        return //getClass().getSimpleName()+ "{" +    //returns what the class name is
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
