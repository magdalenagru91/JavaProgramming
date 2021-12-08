package day_17_ForLopp_While;

import java.util.Scanner;

public class Login2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = s.next();

        System.out.println("Enter your password:");
        String p = s.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")) {        // if the credentials are valid
            System.out.println("Looged in");
        } else {        // if credentials are not valid
            int attempts = 3;

            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts>0) { // while the credentials are invalid
                if (attempts==1) {
                    System.out.println("This is your last attempt");
                }
                System.out.println("Incorrect username or password, please reenter");
                System.out.println("Enter your username:");
                u = s.next();

                System.out.println("Enter your password:");
                p = s.next();

                attempts--;
            }

            if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                System.out.println("Logged in");
            } else {
                System.out.println("Your account is locked");
            }
        }
        s.close();
    }
}
