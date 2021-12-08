package zzz_INTERVIEW;

public class FirstDuplicateFromStrin_loops {
    public static void main(String[] args) {
        /*
         Write a program that can return the first duplicated character from a string
         */

        String str = "kloabcc";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int frequency = 0;


        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (each == ch) {
                frequency++;
            }
        }

        if (frequency>1){
            result+=ch;
            break;
        }


        }System.out.println(result);

    }
}
