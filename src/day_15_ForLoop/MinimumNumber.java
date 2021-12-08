package day_15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int min = 2147483647;

        for (int i = 0; i < 5; i++) {

        System.out.println("Enter a number:");
        int number = s.nextInt();

        if (number<min) {
            min=number;
        }
    }
        System.out.println("Minimum number: " + min);
    }
}
