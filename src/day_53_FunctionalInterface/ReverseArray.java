package day_53_FunctionalInterface;

import java.util.Arrays;
import java.util.function.Function;

public class ReverseArray {

    public static void main(String[] args) {

        /*
        Create a function that can reverse an array and returns it
         */

        Function<int[],int[]> reverseArray = (a) -> {
            int[] b = new int[a.length];
            for (int i = a.length-1, j=0; i>=0 ; i--, j++) {
                b[j] += a[i];
            }
            return b;
        };

        int[] arr = {5,6,7};
        System.out.println(Arrays.toString(reverseArray.apply(arr)));
    }
}
