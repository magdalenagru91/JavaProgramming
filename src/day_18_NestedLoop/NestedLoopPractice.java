package day_18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your age:");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)) {     //while the age is invalid - exits when you provide valid age
                System.err.println("Invalid Entry, please reenter your age");
                age = scan.nextInt();
            }

            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            while ( !(a.equals("yes") || a.equals("no"))) {  //while the answer is invalid - exits when you provide valid answer
                System.out.println("Invalid, reenter. Would you like to continue?");
                a = scan.next().toLowerCase();
            }

            if (a.equals("no")){
                break;
            }

        }
        scan.close();
    }
}
