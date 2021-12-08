package day_20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        //array to be able to contain 26 chars

        char[] alphabet = new char[26];

        alphabet[0]='Z'; // 90
        alphabet[1]='Y'; // 89
        alphabet[2]='X'; // 88

        char ch = 'Z';
        for (int i = 0; i < alphabet.length; i++, ch--) {
            alphabet[i]=ch; // every time the number of index has to change - it is i, and char has to change - it is ch

        }

        System.out.println(Arrays.toString(alphabet));  //prints the whole array
        System.out.println(alphabet[0]);    //prints the element of array
    }
}
