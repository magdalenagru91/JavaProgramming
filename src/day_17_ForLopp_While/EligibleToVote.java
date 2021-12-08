package day_17_ForLopp_While;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = s.nextInt();

        while ( !(age>=1 && age<=120) ) {
            System.err.println("Invalid entry, please re enter:");
            System.out.println("Enter your age:");
            age = s.nextInt();
        }

        System.out.println("Are you a US citizen? yes/no");
        String answer = s.next();
        while ( !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.err.println("Invalid, reenter:");
            System.out.println("Are you a US citizen? yes/no");
            answer = s.next();
        }


        if (age>=18 && answer.equals("yes")) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
        s.close();
    }
}
