package day_44_Abstraction_Interface.carTask;

public class Honda extends Car{

    public Honda(String model, int year, double price, String color) {
        super("Honda", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " Honda starting");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " Honda driving");
    }
}
