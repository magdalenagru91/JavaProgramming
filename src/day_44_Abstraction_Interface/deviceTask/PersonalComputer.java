package day_44_Abstraction_Interface.deviceTask;

public class PersonalComputer extends Computer{


    public PersonalComputer(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Personal computer", model, price, color, size, hasBattery, hasPowerButton);
    }

    public void turnOn(){
        System.out.println(getBrand()+ " " + getModel() + " is turning on with a personal beep");
    }

    public void turnOff(){
        System.out.println(getBrand()+ " " + getModel() + " is turning off with a personal beep");
    }

    public void reset(){
        System.out.println(getBrand()+ " " + getModel() + " is resetting");
    }

}
