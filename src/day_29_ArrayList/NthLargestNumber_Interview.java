package day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber_Interview {

    /*
    1.you remove the max as many times (here int n) as you want to get nth max using removeIf in the loop fori
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int n = 5;

        for (int i = 1; i < n; i++) {
            list.removeIf(  p -> Collections.max(list) == p);
        }

        int max = Collections.max(list);
        System.out.println(max);
    }
}
