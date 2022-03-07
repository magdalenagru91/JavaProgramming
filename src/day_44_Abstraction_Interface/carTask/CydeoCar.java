package day_44_Abstraction_Interface.carTask;

public class CydeoCar extends Car implements AutoPark,AutoPilot,Flyable{

    public CydeoCar(String model, int year, double price, String color) {
        super("CydeoCar", model, year, price, color);
    }


    @Override
    public void autoPark() {
        System.out.println(getMake() + " CydeoCar is auto parking");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " CydeoCar is self driving");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " CydeoCar is starting");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " CydeoCar is driving");
    }

    @Override
    public void fly() {
        System.out.println(getMake() + " CydeoCar is flying");
    }
}
