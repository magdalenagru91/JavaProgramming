package day_20_Arrays;

import java.util.Arrays;
import java.lang.reflect.Array;

public class AppearedTwice {
    public static void main(String[] args) {

        char[] chars = {'A', 'A', 'B', 'C', 'C', 'C', 'C', 'C'};


        for (int j = 0; j < chars.length; j++) {
            char ch = chars[j];
            int frequency = 0;


            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ch) {
                    frequency++;
                }

            }
            if (frequency==2) {
                System.out.println(ch);
            }


        }
    }
}
