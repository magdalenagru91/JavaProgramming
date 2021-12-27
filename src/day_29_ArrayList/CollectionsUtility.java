package day_29_ArrayList;

import day_27_WrapperClasses.SameNumOfUpperAndLower;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));



        //SORT

        Collections.sort(list);

        System.out.println(list);




        System.out.println("--------------------------------");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));

        System.out.println(list2);



        //REVERSE

        Collections.reverse(list2);

        System.out.println(list2);




        System.out.println("--------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));



        //SWAP

        Collections.swap(list3,1,4);            //array list you want to use, first index, second index

        System.out.println(list3);





        System.out.println("--------------------------------");

        int max = Collections.max(list3);
        int min = Collections.min(list3);

        System.out.println("max: " + max + " min: " + min);





        System.out.println("--------------------------------");

        ArrayList<Integer>list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));





        //REPLACE

        Collections.replaceAll(list4,10,1000);

        System.out.println(list4);




        System.out.println("--------------------------------");

        int frequency = Collections.frequency(list4,1000);
        System.out.println(frequency);




        System.out.println("--------------------------------");

        ArrayList<String> words = new ArrayList<>();



        words.addAll(Arrays.asList("Java", "Java", "Python", "Python", "Ruby", "C#"));


        //FREQUENCY

        int countJava = Collections.frequency(words,"Java");
        int countPython = Collections.frequency(words, "Python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);


    }
}
