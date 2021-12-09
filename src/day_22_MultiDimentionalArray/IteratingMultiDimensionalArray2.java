package day_22_MultiDimentionalArray;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {


        /*
        1. I take each array by outer loop

        2. I take each element by inner loop, it is important to add arr2D[i] in "for (int j = 0; j < arr2D[i].length; j++)",
        so it checks the length of that particular array, not the whole arr2D array, but the first 1D array in the big 2D array,
        cause it is the small array that we want to reverse within the big array

        3. It has to have something in common to put it together - int the inner loop you want to print the 1D array with its elements reversed:
        System.out.print(arr2D[i][j]+" "); - i is the whole 1D array, j is representing each element of this array, cause you print it
        one by one - first first 1D array with its elements reversed, than second 1D array with its elements reversed...

         */

        /*
        9 10 11 12
        4 5 6 7 8
        1 2 3
         */

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

        for (int i = arr2D.length - 1; i >= 0; i--) {       //i: index number of 1D arrays starting from last index to 0 (we have 3 1D arrays)

            //System.out.println(Arrays.toString(arr2D[i]));

            for (int j = 0; j < arr2D[i].length; j++) {     //j: index number of elements of each array starting from 0 to last index
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();

        }


        System.out.println("-----------------------------------------------------------");

        /*
        3 2 1
        8 7 6 5 4
        12 11 10 9
         */


        int[][] arr2D2 = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

        for (int i = 0; i < arr2D2.length; i++) {                   //i: index number of 1D arrays starting from index 0 to last index

            //System.out.println(Arrays.toString(arr2D[i]));

            for (int j = arr2D2[i].length - 1; j >= 0; j--) {       //j: each element starting from last index

                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }



        System.out.println("-----------------------------------------------------------");

        /*
        13 12 11 10 9
        8 7 6 5 4
        3 2 1
         */
        int[][] arr2D3 = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

        for (int i = arr2D3.length - 1; i >= 0; i--) {

            //System.out.println(Arrays.toString(arr2D3[i]));

            for (int j = arr2D3[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D3[i][j]+" ");

            }
            System.out.println();
        }

        }




        }


