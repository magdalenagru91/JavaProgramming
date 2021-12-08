package day_12_Scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");

        double radius = input.nextDouble();         // scan.nextDouble() - method calling, if you will reuse it add "double radius"

        System.out.println("The perimeter of your circle is " + 2 * 3.14 * radius);
        System.out.println("The area of your circle is " + 3.14 * (radius*radius));


    }
}
