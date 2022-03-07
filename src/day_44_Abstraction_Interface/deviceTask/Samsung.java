package day_44_Abstraction_Interface.deviceTask;

public class Samsung extends Phone implements Downloadable,AndroidApps{

    public Samsung(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Samsung", model, price, color, size, hasBattery, hasPowerButton);
    }


    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getBrand() + " is turning on with hello message");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getBrand() + " is turning off with hello message");
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getBrand() + " is downloading from " + AppStoreName);
    }
}
