package zzz_INTERVIEW;

public class IndexNumFirstDupl_loop {
    public static void main(String[] args) {
        /*
        Write a program that cna return the index number of the first duplicated character from a string
         */

        String str = "abcc";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char each = str.charAt(j);
            int ind = str.indexOf(str.charAt(j));       //index number
            int frequency = 0;


            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == each) {
                    frequency++;
                }

            }
            if (frequency > 1 && frequency < 3) {
               result+=ind;
                System.out.println(result);

               break;

            }

        }
    }
}