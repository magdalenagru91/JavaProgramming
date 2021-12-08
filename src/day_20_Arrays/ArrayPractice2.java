package day_20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char [] letters = new char[26];

        for (int i = 0, j='A'; i <letters.length; i++, j++) {       //for 2 data: char and numbers;
                                                                                //i: index numbers 0~last index
                                                                                //j: chars
            /*
            letters[0] = 'A';
            letters[1] = 'B';
            */

            letters[i] = (char)j;

        }
        System.out.println(Arrays.toString(letters));



        System.out.println("--------------------------");



       // for (char i = 0, j='A'; i < letters.length; j<='Z'; i++, j++) {

        //    letters[i] = j;

        //}


            char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch++;

        }

        //OR!!!:

        char ch1 = 'A';
        for (int i = 0; i < letters.length; i++,ch1++) {
            letters[i] = ch1;

        }






    }
}
