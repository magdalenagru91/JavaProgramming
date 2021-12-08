package zzz_INTERVIEW;

public class FirstUniqueChar_loop {
    /*
    Write a program that can return the index number of the first unique character.
     */

    public static void main(String[] args) {


        String str = "aabbccs";
        String result = "";


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int ind = str.indexOf(str.charAt(j));
            int frequency = 0;



        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (each == ch) {
                frequency++;
            }
        }
        if (frequency==1){
            result+=ch;
            System.out.println(ind);
            break;
        }
        }

    }
}
