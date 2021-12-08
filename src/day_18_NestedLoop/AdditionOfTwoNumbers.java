package day_18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your first number");
            int num1 = scan.nextInt();

            System.out.println("Enter your second number");
            int num2 = scan.nextInt();

            System.out.println("Addition: " + (num1 + num2));

            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase(Locale.ROOT);

            while ( !(a.equals("yes") || a.equals("no")) ) {    // if answer is invalid
                System.err.println("Invalid Entry, please reenter");
                a = scan.next().toLowerCase();

            }

            if (a.equals("no")) {
                break;      // exits the outer loop
        }


    }scan.close();
    }
}
