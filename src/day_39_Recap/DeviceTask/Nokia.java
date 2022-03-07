package day_39_Recap.DeviceTask;

public class Nokia extends Phone{


    public Nokia(String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Nokia", model, price, hasBattery, hasPowerButton);
    }

    public void selfDefense(){
        System.out.println(getBrand() + " " + getModel()+ " is in self defence mode");
    }
}
