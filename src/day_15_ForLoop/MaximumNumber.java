package day_15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int max =-2147483648;       //condition will be true during the first try


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number:");
            int number = s.nextInt();

            if (number>max) {
                max=number;

            }
        }
        System.out.println("Max number is: " + max);
    }
}
