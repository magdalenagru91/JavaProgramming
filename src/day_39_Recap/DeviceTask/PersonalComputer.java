package day_39_Recap.DeviceTask;

public class PersonalComputer extends Computer{

    public PersonalComputer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void password(){
        System.out.println(getBrand() + " " + getModel() + " personal computer asks for a password");
    }
}
