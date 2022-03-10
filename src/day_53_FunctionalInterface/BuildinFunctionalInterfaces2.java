package day_53_FunctionalInterface;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class BuildinFunctionalInterfaces2 {

    public static void main(String[] args) {

        System.out.println("-------------------------BIPREDICATE------------------------");

        BiPredicate<String, String> anagram = (a,b) -> {
            String[] arr = a.split("");
            String[] arr2 = b.split("");

            Arrays.sort(arr);
            Arrays.sort(arr2);

            return Arrays.equals(arr,arr2);
        };


        BiPredicate<Integer[], Integer[]> anagramInteger = (a,b) -> {
            Arrays.sort(a);
            Arrays.sort(b);

            return Arrays.equals(a,b);
        };
        Integer[] r = {1,2,3};
        Integer[] g = {3,2,1};
        System.out.println("anagramInteger.test(r,g) = " + anagramInteger.test(r, g));



        System.out.println("-------------------------BICONSUMER------------------------");

        //create a function that can print the given string for given number of

        BiConsumer<String, Integer> printMultipleTimes = (s,n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        };
        printMultipleTimes.accept("Magda", 5);




        System.out.println("-----------------------------------------");

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abd", "SM");
        scrumTeam1.put("Nikita", "Developer");
        scrumTeam1.put("Alina", "Developer");
        scrumTeam1.put("Mert", "PO");
        scrumTeam1.put("Lee", "SDET");

        for (Map.Entry<String, String> entry : scrumTeam1.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("------------------------------------------");

        scrumTeam1.forEach( (k,v) -> System.out.println(k + " : " + v) );


        System.out.println("------------------------------------------");

        //create a function that takes 2 integers and returns max integer

        BiFunction<Integer,Integer,Integer> maxNum = (a,b) -> {
            return a>b?a:b;
        };
        int max = maxNum.apply(10,20);
        System.out.println("max = " + max);
        System.out.println(maxNum.apply(100, 200));


        System.out.println("------------------------------------------");

        //create a function that can merge two integer arrays into list

        BiFunction<int[],int[], List<Integer>> mergeIntArrayIntoList = (a,b) -> {
            List<Integer> result = new ArrayList<>();

            for (int each : a) {
                result.add(each);
            }
            for (int each : b) {
                result.add(each);
            }

            return result;
        };

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        System.out.println(mergeIntArrayIntoList.apply(arr1, arr2));



        System.out.println("------------------------------------------");
        //create a function that takes a list of String and a list of Integer
        //names = {"Josh", "Daniel}
        //score = {100,110}

        //map==> {Josh=100, Daniel=110}

        BiFunction<List<String>,List<Integer>,Map<String,Integer>> merge2 = (j,k) -> {

            Map<String,Integer> map = new HashMap<>();
            for (int i = 0; i < j.size(); i++) {
                map.put(j.get(i), k.get(i));
            }
            return  map;
        };

        List<String> names = new ArrayList<>(Arrays.asList("Magda", "Helena", "Wojtek"));
        List<Integer> scores = new ArrayList<>(Arrays.asList(85,67,99));

        System.out.println(merge2.apply(names, scores));
        Map<String,Integer> students = merge2.apply(names,scores);
        System.out.println(students);

    }
}
