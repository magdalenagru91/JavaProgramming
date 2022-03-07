package zzz_INTERVIEW;

import java.util.Scanner;

public class FrequencyOfCharScanner {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your word:");
        String str = s.next();

        String result = "";



        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if (ch1==ch2){
                    count++;
                }
            }
            if (result.contains(""+ch1)){
                continue;
            }
            result+=ch1;
            result+= count;
        }
        System.out.println(result + " ");
    }
}
