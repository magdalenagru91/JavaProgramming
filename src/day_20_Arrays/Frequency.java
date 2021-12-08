package day_20_Arrays;

import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {

        /*
        1.nested loop - what is the highest number of frequency- find it
        2.another loop to check how many characters frequency is equal to that number
        two different loops
         */

        char[] numbers = {'A', 'A', 'B'};
        String result = "";


        for (int j = 0; j < numbers.length; j++) {
            //char ch = numbers[j];
            int frequency = 0;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == numbers[j]) {
                    frequency++;
                }
            }
            if (result.contains(numbers[j]+"")) {
                continue;
            }

            result+=numbers[j];
            result+=frequency;
        }
         System.out.println(result);
    }
}