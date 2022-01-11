package day_33_Statics;

import java.util.Scanner;

public class Iphone_LunchTaskObjects {

    public static void main(String[] args) {

        Iphone_LunchTask iphone1 = new Iphone_LunchTask("Iphone", "white", "small", 1000);


        Scanner s = new Scanner(System.in);


        System.out.println("Enter the number:");
        long num = s.nextLong();
        System.out.println(iphone1.call(num));

        System.out.println(iphone1.faceTimeEmail("mag@gru.com"));
        //System.out.println(iphone1);


    }
}
