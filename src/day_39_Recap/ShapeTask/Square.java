package day_39_Recap.ShapeTask;

public class Square extends Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {

        if (side<=0){
            System.err.println("Invalid side: " + side);
            System.exit(1);
        }
        this.side = side;
    }


    public Square(double side) {
        super("Square");
        setSide(side);          //benefit of calling a setter here is to check the requirements, setter will check the requirements here, thats why not "this..."
    }                           //if there is just this.side and user provides for example -100 it will be wrong
                                //setter will enable to check the condition and make sure that this is correct




    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name=" + getName() +
                ", side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
