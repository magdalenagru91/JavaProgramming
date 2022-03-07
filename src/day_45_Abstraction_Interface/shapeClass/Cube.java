package day_45_Abstraction_Interface.shapeClass;

public class Cube extends Shape implements Volume{

    private int side;

    public Cube(int side) {
        super("Cube");
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side<0){
            throw new RuntimeException ("Invalid side");
        }
        this.side = side;
    }

    @Override
    public double area() {
        return 6*side*side;
    }

    @Override
    public double perimeter() {
        return 12*side;
    }


    @Override
    public double volume() {
        return side*side*side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                super.toString() +
                "side=" + side +
                '}';
    }
}
