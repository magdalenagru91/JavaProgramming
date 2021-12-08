package zzz_INTERVIEW;

public class FrequencyOfCharacters_loops {
    public static void main(String[] args) {

        /*
        write a program that can find the frequency of the characters from a string
         */

        String str = "aabdcccd";
        //int count = 0;
        // char ch = str.charAt(0);    //'a'
        String result = "";         //a2b1c3d1

        for (char j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);      //each character of the string
            int count = 0;


            for (int i = 0; i < str.length(); i++) {        //to find the frequency of each character
                char each = str.charAt(i);                  //each character of str
                if (ch == each) {
                    count++;
                }

            }
           if (result.contains(""+ch)) {
               continue;
           }
           result+= ch;
           result+=count;
        }

        System.out.println(result);


    }
}
