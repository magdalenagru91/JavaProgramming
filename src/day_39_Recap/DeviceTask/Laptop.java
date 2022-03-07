package day_39_Recap.DeviceTask;

public class Laptop extends Computer{



    public Laptop(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void charge(){
        System.out.println(getBrand() + " " + getModel() + " laptop is charging");
    }
}

