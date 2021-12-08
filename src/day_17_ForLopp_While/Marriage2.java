package day_17_ForLopp_While;

import java.util.Locale;
import java.util.Scanner;

public class Marriage2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Will you merry me? Yes/No");

        String a = s.next().toLowerCase();

        while (!(a.equals("yes")) || a.equals("no")) {
            System.out.println("Invalid answer, please reenter:");
            a = s.next().toLowerCase(Locale.ROOT);
        }

        if (a.equals("yes")) {
            System.out.println("Congrats");
        }else {
            System.out.println("Goodbye");
        }
        s.close();


    }
}
