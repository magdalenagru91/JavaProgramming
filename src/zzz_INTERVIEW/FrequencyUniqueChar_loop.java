package zzz_INTERVIEW;

public class FrequencyUniqueChar_loop {

    /*      DAY 16 HELP!!!
    Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique
     */

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";


        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);    //it picks up each of the characters, not only a, all of them
            int count = 0;              //represents the frequency of the variable ch


            for (int i = 0; i < str.length(); i++) {    //compares the character that outer loop picked, with each character of inner loop


                char each = str.charAt(i);      //each character of str
                if (ch == each) {               //ch is compared to each character in your string!!! this is the connection to outer loop
                    count++;
                }
            }
            if (count==1) { //if the frequency is 1 - character is unique
                result+=ch;
            }

        }
        System.out.println(result);

    }
}
