package day_53_FunctionalInterface;

import java.util.Arrays;
import java.util.function.Function;

public class MaxNumFromArray {

    public static void main(String[] args) {

        /*
        Function Functional interface:
       create a function that can return the maximum number from an int array
         */

        Function<int[],Integer> maxNumber = (a) -> {
            Arrays.sort(a);
            return a[a.length-1];
        };

        int[] arr = {1,2,3};
        System.out.println(maxNumber.apply(arr));
    }
}
