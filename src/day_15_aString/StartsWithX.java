package day_15_aString;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        /*
        Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
         */

        System.out.println("Enter a word:");
        String word = new Scanner(System.in).next();    //you can use it when you need only 1 input from the user

        if (word.charAt(0) == 'x') {
            word = word.replaceFirst("x","a");
        }

        System.out.println(word);


    }
}
