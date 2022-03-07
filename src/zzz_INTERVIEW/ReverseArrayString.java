package zzz_INTERVIEW;

import java.util.Arrays;

public class ReverseArrayString {

    public static void main(String[] args) {


        String [] array = {"Magda", "Farangez", "Duygu"};

        String reverse = "";

        for (String each : array) {


            for (int i = each.length()-1; i >=0 ; i--) {
                reverse+=each.charAt(i);

            }
            reverse+=", ";
        }

        String[] reversed = new String[array.length];

        reversed=reverse.split(", ");


        System.out.println(Arrays.toString(reversed));
    }
}
