package day_17_ForLopp_While;

import java.util.Scanner;

public class Marriage {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String answer = s.next();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("yay");
        } else if (answer.equalsIgnoreCase("no")){
            System.out.println("bye...");
        }
        while ( !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.out.println("Invalid. Reenter the answer:");
            answer = s.next();
        }
        s.close();
    }
}
