package day_51_Map;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";


        String [] arr = str.split("");

        //Set<String> chars = new LinkedHashSet<>(Arrays.asList(arr));

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr),each);
            result.put(each,frequency);
        }

        System.out.println("result = " + result);






        /*
        write a program that can return the frequency of chars
        note: must use map

        ex: str = "bbcccaaaaa"

        output:
        {b=2, c=3, a=5}
         */

    }
}
