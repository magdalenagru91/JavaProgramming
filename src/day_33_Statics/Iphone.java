package day_33_Statics;

public class Iphone {

    public static String brand = "Apple";       //same brand

    public String model;

    public double price = 1000;

    public static String operatingSystem = "iOS";       //same operating system

    public String color;

    public String size;

    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean hasCamara = true;

    public static boolean hasFacetime = true;

    public static void printOperatingSystem(){
        System.out.println(operatingSystem);
    }




    public static void printModelAndPrice(){    //static cannot share model and price cause it is instance
        //System.out.println(model + " " + price);
    }

    public void method1(){
        System.out.println(model + " " + price);
        System.out.println(operatingSystem);
    }






}
