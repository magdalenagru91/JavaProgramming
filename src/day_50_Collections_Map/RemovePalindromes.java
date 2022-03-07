package day_50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Java", "Python", "cydeo", "car", "level", "civic", "radar", "rotor", "reviver", "racecar", "madam"));

       Iterator<String> it = names.iterator();

       while (it.hasNext()){
           String each = it.next();
           String reverse = "";

           for (int i = each.length()-1; i >=0 ; i--) {
               reverse+=each.charAt(i);
           }

           if (each.equalsIgnoreCase(reverse)){
               it.remove();
           }
       }
        System.out.println(names);



        System.out.println("-----------------------------");

        List<String> names2 = new ArrayList<>();

        names2.addAll(Arrays.asList("Java", "Python", "cydeo", "car", "level", "civic", "radar", "rotor", "reviver", "racecar", "madam"));

        Predicate<String> palindrome = str -> { //if multiple statements are needed you need curly braces!!!
            String reverse = "";

            for (int i = str.length()-1; i >=0 ; i--) {
                reverse+=str.charAt(i);
            }
            return reverse.equalsIgnoreCase(str);
        };

        names2.removeIf(palindrome);
        System.out.println(names2);


        /*
        names2.removeIf(p -> {String reverse = "";

            for (int i = p.length()-1; i >=0 ; i--) {
                reverse+=p.charAt(i);
            }
            return reverse.equalsIgnoreCase(p);
        );

         */

    }
}
