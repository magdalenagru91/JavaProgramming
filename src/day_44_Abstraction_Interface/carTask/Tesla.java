package day_44_Abstraction_Interface.carTask;

public class Tesla extends Car implements AutoPark, AutoPilot{

    public Tesla(String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " Tesla is auto parking");

    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " Tesla is self driving");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " Tesla is starting");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " Tesla is driving");
    }
}
