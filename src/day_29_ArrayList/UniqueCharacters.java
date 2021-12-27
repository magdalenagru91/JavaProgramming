package day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        /*
        1.you create a non primitive array (here arr) by splitting the string str with empty ""
        2.you concate it to arrayList (Arrays.asList(arr))
        3.use for each loop to run each element and check the frequency
        4.you do frequency from collection utility class
        5.you add each unique to new string
         */


        String str = "aaabcccdeeefggggggghiiiiiiijkkkkkkl";
        String[] arr = str.split("");

        ArrayList<String> list = new ArrayList<>( Arrays.asList(arr) );

        System.out.println("list = " + list);

        String unique = "";

        for (String each : list) {
            int frequency = Collections.frequency(list,each);
            if (frequency==1){
                unique += each;
            }
        }
        System.out.println(unique);
    }
}
