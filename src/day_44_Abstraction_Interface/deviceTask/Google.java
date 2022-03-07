package day_44_Abstraction_Interface.deviceTask;

public class Google extends Phone implements Downloadable,AndroidApps{


    public Google(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Google", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " turns on with the google ring sound");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " turns off with the google ring sound");
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading from " + AppStoreName);
    }
}
