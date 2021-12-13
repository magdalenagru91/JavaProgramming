package zzz_INTERVIEW;

public class DuplicatedCharacters_loop {

    public static void main(String[] args) {

        /*
        find the ones that are duplicates
         */


        String str = "aabccdeeef";
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

            if (result.contains(""+ch)){
                continue;
            }
            if (count>1) { //if the frequency is 1 - character is unique
                result+=ch;
            }

        }
        System.out.println(result);

    }
    }

