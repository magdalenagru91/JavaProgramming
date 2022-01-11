package day_33_Statics;

public class Iphone_LunchTask {

    /*
    IPhone Task:
		1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
     */

    public String model, color, size;
    public double price;

    public static String brand, OS, madeIn;

    public Iphone_LunchTask(String model, String color, String size, double price) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }


    public String faceTimeNumber(long phoneNumber){
        return ("facetime with " + phoneNumber);
    }

    public String faceTimeEmail(String email){
        return ("facetime with " + email);
    }

    public String call(long phoneNumber){
        return (phoneNumber + " is calling");
    }

    public String text(long phoneNumber){
        return (phoneNumber + " is texting");
    }

    public String toString() {
        return "Iphone_LunchTask{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
