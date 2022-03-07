package day_39_Recap.DeviceTask;

public class Iphone extends Phone{


    public Iphone(String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Iphone", model, price, hasBattery, hasPowerButton);
    }

    public void faceTime(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is facetiming " + phoneNum);
    }

}
