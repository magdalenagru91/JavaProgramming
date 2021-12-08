package day_12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    /*
        1. Ask used to enter age
        2. Enter full name
         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA: ");
        double GPA = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();




        System.out.println("Your age is: " + age + "\nYour full name is: " + fullName +
                "\nYour GPA is " + GPA + "\nYour school name is: " + schoolName);




    }
}
