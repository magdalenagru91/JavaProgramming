package zzz_INTERVIEW;

public class HighestFrequency {
    public static void main(String[] args) {

        /*
        1.nested loop - what is the highest number of frequency- find it
        2.another loop to check how many characters frequency is equal to that number
        two different loops
         */



        String str = "aabcccdddde";

        int max = 0;
        String result ="";


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (each == ch) {
                frequency++;
            }
        }

        if (result.contains(ch+"")) {
            continue;
        }

            if (frequency>max){
                max=frequency;
                result=ch+"";
            }

        }

            System.out.println(result);
        }


        }





