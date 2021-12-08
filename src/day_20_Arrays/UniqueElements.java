package day_20_Arrays;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        /*

         */

        String[] words = {"Java", "C#", "Python", "Python"};


        for (int j = 0; j < words.length; j++) {

            String elements = words[j]; //checks different words
            int frequency = 0;


            for (int i = 0; i < words.length; i++) {    //finds the frequency of element from array
                if (words[i].equals(elements)) {
                    frequency++;
                }
            }
            if (frequency==1) {
                System.out.println(elements);
            }
        }
    }

    }

