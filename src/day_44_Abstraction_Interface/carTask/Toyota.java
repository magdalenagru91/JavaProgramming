package day_44_Abstraction_Interface.carTask;

public class Toyota extends Car{

    public Toyota(String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " Toyota starts");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " Toyota drives");

    }
}
