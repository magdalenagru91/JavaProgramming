package day_33_Statics;

public class testIphone {

    public static void main(String[] args) {

        System.out.println( Iphone.brand );     //plus of the static - you dont need to create and object, you just call from the class name

        Iphone iphone1 = new Iphone();
        iphone1.color = "white";

        System.out.println(iphone1.color);


    }
}
