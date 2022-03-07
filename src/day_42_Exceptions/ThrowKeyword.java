package day_42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age:");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        //or: int age = new Scanner(System.in).nextInt();


        if (age<0){
            /*
            System.err.println("Invalid age: " + age);
            System.exit(1);
            */

            throw new InputMismatchException("Age cannot be negative: " + age);
        }


        if (age>21){
            System.out.println("You are eligible");
        } else {
            throw new RuntimeException("You must be at least 21 years old.");
        }
    }
}