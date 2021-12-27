package day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4_1217_megringTwoArrays {

    /*
    write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */

    public static void main(String[] args) {


        ArrayList<Character> arr1 = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();

        arr1.addAll(Arrays.asList('A', 'B', 'C'));
        arr2.addAll(Arrays.asList('D', 'E', 'F', 'G'));

        ArrayList<Character> list = new ArrayList<>();

        for (Character each : arr1) {
            list.add(each);

        }

        for (Character each : arr2) {
            list.add(each);
        }

        System.out.println(list);



    }
}