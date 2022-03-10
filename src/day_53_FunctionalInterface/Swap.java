package day_53_FunctionalInterface;

import java.util.Arrays;
import java.util.function.Function;

public class Swap {

    public static void main(String[] args) {

                /*
         create a function that can swap the first and last elements of an array
         */

        Function<int[],int[]> swapFirstAndLastElementArray = (a) -> {
            int indexZero = a[0];
            int lastIndex = a[a.length-1];

            a[0] = lastIndex;
            a[a.length-1] = indexZero;

            return a;
        };

        int[] arr1 = {1,2,3,4};
        System.out.println(Arrays.toString(swapFirstAndLastElementArray.apply(arr1)));

    }
}
