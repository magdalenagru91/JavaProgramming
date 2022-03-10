package day_53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces1 {

    public static void main(String[] args) {

        System.out.println("----------------PREDICATE-----------------");

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
        System.out.println("list with everything= " + list);
        //list.removeIf(isEven);
        list.removeIf(p -> p%2 == 0);
        System.out.println("list with no even= " + list);




        System.out.println("---------------------------------");

        List<String> names = new ArrayList<>(Arrays.asList("Level", "ana", "Python"));
        names.removeIf(isPalindrome);
        System.out.println("names = " + names);





        System.out.println("-----------------CONSUMER----------------");

        Consumer<String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                System.out.println(ch);
            }
        };

        printEach.accept("Magda");


        System.out.println("---------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,34,5,6,7,8,9));

        list2.forEach(p -> System.out.println(p));

        System.out.println("---------------------------------");

        list2.forEach( p -> {if (p%2 == 0){System.out.println(p);}});

        System.out.println("---------------------------------");

        list2.forEach( p -> {if (p%2 != 0) {System.out.println(p);}});


        System.out.println("---------------------------------");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah", "Magda Gruszka"));

        employees.forEach( s ->
            System.out.println(s.charAt(0) + "." + s.charAt(s.lastIndexOf(" ") + 1 ) ));



        System.out.println("-----------------FUNCTION----------------");

        //a is int[] = T; body goes to List<Integer> = R
        Function<int[], List<Integer>> convertToList = (a) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> l = convertToList.apply(arr);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("l = " + l);



        System.out.println("---------------------------------");

        Function<List<Integer>, int[]> convertToArray = (a) -> {
            int [] result = new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                result[i] = a.get(i);
            }
            return result;
        };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int[] result2 = convertToArray.apply(numbers);
        System.out.println("Arrays.asList(result2) = " + Arrays.toString(result2));
        System.out.println("convertToArray.apply(numbers) = " + Arrays.toString(convertToArray.apply(numbers)));










    }

    }

