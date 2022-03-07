package day_44_Abstraction_Interface.carTask;

public class Audi extends Car implements AutoPark{

    public Audi(String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+ " Audi starting");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " Audi driving");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " Audi autoParking");
    }
}
