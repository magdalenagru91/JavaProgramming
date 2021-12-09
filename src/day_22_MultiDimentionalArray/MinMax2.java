package day_22_MultiDimentionalArray;

public class MinMax2 {
    public static void main(String[] args) {

        /*
        Write a program that can find the minimum and maximum numbers from a two dimensional array
         */

        //index of the elements:   0 1 2       0 1 2 3      0  1  2  3  4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        //  index number:              0         1             2

        int max = -2147483648;
        int min = 2147483647;

        for (int[] each : arr2D) {

            for (int element : each) {

                if (element > max) {
                    max = element;
                }

                if (element < min) {
                    min = element;
                }

            }
            System.out.println("Max: " + max + " Min: " + min);
        }
    }
}
