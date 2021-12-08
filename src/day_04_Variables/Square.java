package day_04_Variables;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        System.out.println("Enter what is the side of your square: ");
        Scanner input = new Scanner(System.in);
        int yourNumber = input.nextInt();

        int side = yourNumber;
        int area = side*side;
        int perimiter = 4*side;

        System.out.println("The area of your square is " + area);
        System.out.println("The perimiter of your square is " + perimiter);
    }
}
