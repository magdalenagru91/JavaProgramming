package day_18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {

            System.out.println("Enter a number:");
            int number = scan.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is even number");
            } else {
                System.out.println(number + " is odd number");
            }

            System.out.println("Would you like to enter another number?");
            String a = scan.next().toLowerCase();

            while ( !(a.equals("yes") || a.equals("no")) ) {
                System.err.println("Please reenter, would you like to enter another number?");
                a = scan.next().toLowerCase(Locale.ROOT);
                if (a.equals("yes") ||a.equals("no")) {
                    break;
                }
            }

            if (a.equals("no")) {
                break;
            }

        }

        scan.close();


    }
}
