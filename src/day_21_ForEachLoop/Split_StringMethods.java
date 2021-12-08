package day_21_ForEachLoop;

import java.util.Arrays;

public class Split_StringMethods {
    public static void main(String[] args) {

        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" ");   //you split it by any character, here you split it by the space
        System.out.println(Arrays.toString(words));



        System.out.println("---------------------------------");

        String email = "WoodenSpoon@cydeo.com";

        String[] arr = email.split("@");    //you split it by any character, here you split it by the "@"
        System.out.println(Arrays.toString(arr));



        System.out.println("---------------------------------");

        String s = "I love learning java programming language";
        String [] str = s.split(" ");
        System.out.println(Arrays.toString(str));




    }
}
