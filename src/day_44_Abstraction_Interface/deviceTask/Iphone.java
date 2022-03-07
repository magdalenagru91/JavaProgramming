package day_44_Abstraction_Interface.deviceTask;

public class Iphone extends Phone implements Downloadable, AppleApps{

    public Iphone(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Iphone", model, price, color, size, hasBattery, hasPowerButton);
    }



    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " turnes on with the ring sound");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " turnes off with the ring sound");
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading the app from " + AppStoreName);
    }
}
