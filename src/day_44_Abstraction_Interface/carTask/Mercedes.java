package day_44_Abstraction_Interface.carTask;

public class Mercedes extends Car implements AutoPark{

    public Mercedes(String model, int year, double price, String color) {
        super("Mercedes", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " Mercedes autoParkind");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " Mercedes starting");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " Mercedes driving");
    }
}
