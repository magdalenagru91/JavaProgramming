package day_39_Recap.DeviceTask;

public class Google extends Phone{

    public Google(String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Google", model, price, hasBattery, hasPowerButton);
    }

    public void gmail(String email){
        System.out.println(getBrand() + " " + getModel() + " is opening gmail");
    }
}
