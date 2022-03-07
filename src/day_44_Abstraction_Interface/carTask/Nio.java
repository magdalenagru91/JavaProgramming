package day_44_Abstraction_Interface.carTask;

public class Nio extends Car implements AutoPilot, AutoPark {

    public Nio(String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " Nio is auto parking");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " Nio is self driving");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " Nio is starting");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " Nio is driving");
    }
}
