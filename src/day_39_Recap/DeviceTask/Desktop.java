package day_39_Recap.DeviceTask;

public class Desktop extends Computer{


    public Desktop(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void reset(){
        System.out.println(getBrand() + " " + getModel() + " is resetting your desktop");
    }
}
