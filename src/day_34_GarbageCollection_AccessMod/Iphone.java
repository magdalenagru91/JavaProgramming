package day_34_GarbageCollection_AccessMod;

public class Iphone {

    /*
    Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
     */

    public static String brand;
    public String model;
    public String size;
    public String color;
    public double price;
    public static boolean isSmartPhone;
    public static String madeIn;
    public static String designedIn;
    public static String operatingSystem;


    public Iphone(String model, String size, String color, double price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }


    static{
        brand = "Iphone";
        isSmartPhone = true;
        madeIn = "China";
        designedIn ="USA";
        operatingSystem = "IOS";
    }
    /*
    Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
     */

    public static void printOperatingSystem(){
        System.out.println(operatingSystem);
    }

    public void call(long phoneNumber){
        System.out.println(brand + model + " is calling " + phoneNumber );
    }
    public void text(long phoneNumber){
        System.out.println(brand + model + " is texting " + phoneNumber);
    }
    public void faceTime(long phoneNumber){
        System.out.println(brand + model + " is facetiming " + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand + model + " is facetiming " + email);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", Operating System=" + operatingSystem +
                ", made in=" + madeIn +
                ", designed in" + designedIn +
                ", is a smartphone" + isSmartPhone +
                '}';
    }

}
