package day_21_ForEachLoop;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] str = sentence.split(" ");

        System.out.println(Arrays.toString(str));

        String reverse = "";


        for (int i = str[1].length() - 1; i >= 0; i--) {        //here we are reversing only 1st string of the array,thats why str[1]
            reverse += str[1].charAt(i);
        }
        System.out.println(reverse);


        //sentence=sentence.replaceFirst(str[1],reverse);   //one way to do it or:

        str[1] = reverse;
        System.out.println(Arrays.toString(str));


        for (String word : str) {
            System.out.print(word + " ");

        }

    }
}




