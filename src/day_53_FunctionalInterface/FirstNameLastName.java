package day_53_FunctionalInterface;

import java.util.function.BiConsumer;

public class FirstNameLastName {
    public static void main(String[] args) {

        //create a function that takes first and last names and prints the formatted full name
        //"jAvA", "PROGRAMMING" ===> Java Programming
        /*
        BiConsumer Functional Interface:
      create a function that takes first and last names  and prints the formatted full name

        Ex: "jAvA", "PROGRAMMING"  =====> Java Programming
         */

        BiConsumer<String , String > printFullName = (e, f) -> {
            String firstName = e.substring(0,1).toUpperCase() + e.substring(1).toLowerCase();
            String lastName = f.substring(0,1).toUpperCase() + f.substring(1).toLowerCase();

            System.out.println(firstName + " " + lastName);
        };

        printFullName.accept("MAGDa", "grUszKA");


        System.out.println("-------------------------------------------");



    }
}
