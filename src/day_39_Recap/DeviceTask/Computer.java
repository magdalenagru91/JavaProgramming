package day_39_Recap.DeviceTask;

public class Computer extends Device{

    public Computer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void reboot(){
        System.out.println(getBrand() + " " + getModel() + " is rebooting");
    }

    /*
    . Create a subclass of Device named Computer:

				Add the extra methods if needed
     */


}
