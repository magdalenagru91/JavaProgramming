package day_53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces1 {

    public static void main(String[] args) {

        //check if string is palindrome

        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };

        System.out.println("isPalindrome.test(\"kayak\") = " + isPalindrome.test("kayak"));
        System.out.println("isPalindrome.test(\"magda\") = " + isPalindrome.test("magda"));


        System.out.println("---------------------------------");

        //check if number is even

        Predicate<Integer> isEven = p -> p%2==0;


        System.out.println("---------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7,1,2,3));
        list.removeIf(isEven);
        System.out.println("list = " + list);


        System.out.println("---------------------------------");

        List<String> names = new ArrayList<>(Arrays.asList("Level", "ana", "Python"));
        names.removeIf(isPalindrome);
        System.out.println("names = " + names);


    }
}
