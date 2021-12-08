package day_15_aString;

public class FormatFullName {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter first and last names,
        and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
         */

        String firstName = "cyDEo";
        String lastName = "SCHOOL";

        firstName = firstName.toUpperCase().substring(0, 1) + firstName.substring(1).toLowerCase();

        System.out.println(firstName);

        String firstName1 = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();
                                    //"C"                                           "ydeo" ==>Cydeo


        // if you add "" you will convert this to string and charAt would work with to UpperCase!!!


        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();


        System.out.println("Full name: " + firstName1 + " " + lastName);
    }
}
