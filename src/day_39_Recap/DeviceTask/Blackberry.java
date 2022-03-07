package day_39_Recap.DeviceTask;

public class Blackberry extends Phone{

    public Blackberry(String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Blackberry", model, price, hasBattery, hasPowerButton);
    }

    public void black(){
        System.out.println(getBrand() + " " + getModel() + " is showing Blackberry options");
    }
}
