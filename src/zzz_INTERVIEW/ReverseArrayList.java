package zzz_INTERVIEW;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {

    public static void main(String[] args) {

        ArrayList<Character> arr = new ArrayList<Character>();

        arr.addAll(Arrays.asList('a', 'b', 'c'));


        ArrayList<Character> reversedArr = new ArrayList<Character>();


        for (int i = arr.size() - 1; i >= 0; i--) {
            reversedArr.add(arr.get(i));
        }
        System.out.println(reversedArr);




    }
}
