package day_16_ForLoopStringPractice;


import java.util.Scanner;

public class UniqueCharacter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {

            char ch = str.charAt(i);        //it is representing each char of str

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {       //if the first and last char of the char are the same then the char is unique

                result += ch;
            }
        }
        System.out.println(result);
    }
}
