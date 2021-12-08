package day_20_Arrays;

import java.util.Arrays;

public class Alphabet2 {
    public static void main(String[] args) {


        char [] alphabet = new char[26];

        for (char i = 0,j='Z'; i < alphabet.length; i++,j--) {
            alphabet[i]=j;

        }
        System.out.println(Arrays.toString(alphabet));
    }
}
