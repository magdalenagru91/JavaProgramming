package day_22_MultiDimentionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {


        // index of the elemts:    0 1 2    0 1 2 3    0 1  2  3  4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        //  index number:    0         1             2

        for (int i = 0; i < arr2D.length; i++) {   // i: numbers of single dimensional array, this puts each single dim array to the inner loop 1 by 1

        System.out.println(Arrays.toString(arr2D[i]));  //prints each array

            for (int j = 0; j < arr2D[i].length; j++) {     // i: gives you elements of every single dim array; this manipulates every single dim array one by one

                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();       //if you want to print it one under another


    }


    }
}
