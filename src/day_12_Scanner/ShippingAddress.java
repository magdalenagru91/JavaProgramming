package day_12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your building number: ");
        String buildingNumber = input.next();

        input.nextLine();

        System.out.println("Enter your street name: ");
        String streetName = input.nextLine();

        System.out.println("Enter your city name: ");
        String city = input.nextLine();

        System.out.println("Enter your state: ");
        String state = input.next();

        input.nextLine();

        System.out.println("Enter your zip code: ");
        String zipCode = input.next();


        System.out.println(fullName+ "\n" + buildingNumber + " " +streetName + "\n" + city + "\n"+ state + "\n"+zipCode );


    }
}
