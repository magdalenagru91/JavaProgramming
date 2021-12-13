package day_24_CustomMethods;

import java.util.Arrays;

public class ReturnaReversedArray {

    /*
    create a method that return the reversed array
     */

    public static void main(String[] args) {
        int[] result = returnReversed(new int[] {1,2,3});
        System.out.println(Arrays.toString(result));
    }


    public static int[] returnReversed (int[] yourArray){

        int[] reversed = new int[yourArray.length];

        int[] newArray = new int[yourArray.length];

            for (int i = yourArray.length - 1, j=0; i >= 0; i--, j++) {
                reversed[j]+=yourArray[i];
            }
            return reversed;

            }
        }
