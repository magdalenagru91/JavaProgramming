package day_44_Abstraction_Interface.carTask;

public class BMW extends Car{

    public BMW(String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " BMW starts");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " BMW drives");
    }
}
