package day_12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //System.out.println("Enter true/false: ");
        //boolean result = input.nextBoolean();

        System.out.println("Enter your name: ");

        String name = input.next(); // reads input until a space

        System.out.println("name: " + name );

        input.close();

    }
}
