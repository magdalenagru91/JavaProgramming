package day_44_Abstraction_Interface.deviceTask;

public class Laptop extends Computer{

    public Laptop(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Laptop", model, price, color, size, hasBattery, hasPowerButton);
    }

    public void turnOn(){
        System.out.println(getBrand()+ " " + getModel() + " is turning on with a laptop beep");
    }

    public void turnOff(){
        System.out.println(getBrand()+ " " + getModel() + " is turning off with a laptop beep");
    }

    public void reset(){
        System.out.println(getBrand()+ " " + getModel() + " is resetting");
    }

}


