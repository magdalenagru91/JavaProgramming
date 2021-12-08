package day_17_ForLopp_While;

import java.util.Scanner;

public class WhileLoopPractice {
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


        for (int i = 0; i < attempt; i++) {
            if (!(userName.equals("Cydeo") && password.equals("Cydeo123"))) {
                System.out.println("Invalid user name or password, try again:");
                userName = s.next();
                password = s.next();
            }

            if (i==attempt) {
                System.out.println("Contact support");


        }



        }
        s.close();

        //while ( !(userName.equals("Cydeo") && password.equals("Cydeo123"))) {
        //    System.out.println("Invalid user name or password, try again:");
        //    userName = s.next();
         //   password = s.next();
        }


    }
