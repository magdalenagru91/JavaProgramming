package day_24_CustomMethods.Breakfast;

import java.util.Locale;

public class Initials {
    /*
    1. Create a method that can display the initials of the person
     */

    public static void main(String[] args) {
        Initials("Magda", "Gruszka");
    }

    public static void Initials(String firstName, String lastName) {
        firstName = ""+firstName.toUpperCase(Locale.ROOT).charAt(0);
        lastName = ""+lastName.toUpperCase(Locale.ROOT).charAt(0);
        System.out.println(firstName + " " + lastName);

        /*
        String initial = firstName.charAt(0) + " " + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial=" + initial);
         */
    }



}
