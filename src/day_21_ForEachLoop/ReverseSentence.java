package day_21_ForEachLoop;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        /*
        Write a program that can reverse a sentence
            Ex:
                sentence = "Today is a good day to learn Java";

            output:
                Java learn to day good a is Today
         */

        String sentence = "Today is a good day to learn Java";

        String [] word = sentence.split(" ");

        System.out.println(Arrays.toString(word));

        String reversedSentence = "";


        for (int i = word.length - 1; i >= 0; i--) {

            reversedSentence+=word[i]+" ";

        }
        System.out.println(reversedSentence);

    }
}
