package zzz_INTERVIEW;

public class AllCharAppearedTwice_loop {
    public static void main(String[] args) {
        /*
        Write a program that can display all the characters that appeared twice in the string.
         */

        String str = "aabbc";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char each = str.charAt(j);
            int frequency = 0;



        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == each) {
                frequency++;
            }
        }
        if (frequency>1 && frequency<3){
            result+=each;
        }
        }
        System.out.println(result);
    }
}
