package day_39_Recap.DeviceTask;

public class Samsung extends Phone{


    public Samsung(String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Samsung", model, price, hasBattery, hasPowerButton);
    }

    public void reset(){
        System.out.println(getBrand() + " " + getModel() + " is being resetted");
    }
}
