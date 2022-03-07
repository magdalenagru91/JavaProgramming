package day_44_Abstraction_Interface.deviceTask;

public class Desktop extends Computer{

    public Desktop(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Desktop", model, price, color, size, hasBattery, hasPowerButton);
    }

    public void turnOn(){
        System.out.println(getBrand()+ " " + getModel() + " is turning on with a desktop beep");
    }

    public void turnOff(){
        System.out.println(getBrand()+ " " + getModel() + " is turning off with a desktop beep");
    }

    public void reset(){
        System.out.println(getBrand()+ " " + getModel() + " is resetting");
    }

}
