package day_20_Arrays;

import java.util.Arrays;

public class Alphabet3 {
    public static void main(String[] args) {

        char [] alphabets = new char[26];   //store chars from Z to A

        /*

        alphabets[0] = 'Z'; //90
        alphabets[1] = 'Y'; //89
        alphabets[2] = 'X'; //88
        */




        char ch = 'Z';
        for (int i = 0; i < alphabets.length; i++, ch--) {
            alphabets[i] = ch;

        }
        System.out.println(Arrays.toString(alphabets));

       // System.out.println(Arrays.toString(alphabets));     // print the whole array
       // System.out.println(alphabets[0]);                   // it is an element of array


    }
}
