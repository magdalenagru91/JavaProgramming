package day_17_ForLopp_While;

import java.util.Scanner;

public class LogIn_not_correct {
    public static void main(String[] args) {

        //String username= "Cydeo"
        //password: "Cydeo123"


        Scanner s = new Scanner(System.in);
        System.out.println("Enter your username and password:");
        String userName = s.next();
        String password = s.next();


        int attempt = 3;

        if (userName.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("You logged in");
        }


        //while (!(userName.equals("Cydeo") && password.equals("Cydeo123"))) {

            for (int i = 1; i <= attempt; i++) {
                if (!(userName.equals("Cydeo") && password.equals("Cydeo123"))) {
                    System.out.println("Invalid user name or password, try again:");
                    userName = s.next();
                    password = s.next();
                    if (i == attempt) {
                        System.out.println("Contact the support");
                    } else {
                        System.out.println();

                    }
                }
            }
            s.close();
        }


    }


        //while ( !(userName.equals("Cydeo") && password.equals("Cydeo123"))) {
        //    System.out.println("Invalid user name or password, try again:");
        //    userName = s.next();
        //   password = s.next();






