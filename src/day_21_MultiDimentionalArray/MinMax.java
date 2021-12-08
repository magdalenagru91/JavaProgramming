package day_21_MultiDimentionalArray;

public class MinMax {
    public static void main(String[] args) {
        /*
        Write a program that can find the minimum and maximum numbers from a two dimensional array
         */

        //index of the elements:   0 1 2       0 1 2 3      0  1  2  3  4
                int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        //  index number:              0         1             2

int max = arr2D[0][0];

        for (int[] each : arr2D) {

            for (int elements : each) {
                if (elements>max){
                    max=elements;
                }

            }System.out.println(max);

        }

        int min = arr2D[0][0];

        for (int[] each : arr2D) {

            for (int elements : each) {
                if (elements<min){
                    min=elements;
                }
            }
            System.out.println(min);

        }
    }
}
