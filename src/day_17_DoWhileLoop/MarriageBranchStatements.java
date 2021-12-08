package day_17_DoWhileLoop;

import java.util.Scanner;

public class MarriageBranchStatements {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String answer = s.next();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.out.println("Invalid answer, please reenter:");
            answer = s.next();

            if ((answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                continue;
            }
        }

            if ((answer.equalsIgnoreCase("yes"))) {
                System.out.println("Congrats");
            } else {
                System.out.println("goodbye");
            }
        s.close();
        }


    }
