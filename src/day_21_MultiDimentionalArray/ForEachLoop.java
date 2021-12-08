package day_21_MultiDimentionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        // index of the elemts:    0 1 2    0 1 2 3    0 1  2  3  4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        //  index number:    0         1             2


        for (int[] each1DArray : arr2D) {
            //System.out.println(Arrays.toString(each1DArray));     -> displays each 1D array

            for(int eachElement : each1DArray) {            // this displays each element of the particular 1D array
                System.out.println(eachElement);
            }
        }
    }
}
