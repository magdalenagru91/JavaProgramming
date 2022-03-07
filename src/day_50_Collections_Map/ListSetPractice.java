package day_50_Collections_Map;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println("set = " + set);

        Integer[]arr = set.toArray(new Integer[0]);

        List <Integer> list = new ArrayList<>(set);

        System.out.println("list = " + list);


        System.out.println("----------------------------");

        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A','B','C','D'));

        System.out.println("chars1 = " + chars);


        ((Stack)chars).pop();
        //((Stack<Character>)chars).pop();

        System.out.println("chars = " + chars);


        //poll() ->FIFO

        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

        System.out.println("names1 = " + names);

        ((LinkedList)names).poll();

        System.out.println("names = " + names);


    }
}
