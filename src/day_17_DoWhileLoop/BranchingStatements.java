package day_17_DoWhileLoop;

import java.util.Scanner;

public class BranchingStatements {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
            if (i == 'F') {
                break;
            }
        }

        System.out.println();
        System.out.println("----------------------------------");

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            int num = s.nextInt();
            if (num < 0) {
                break;

            }
        }
    }
}
