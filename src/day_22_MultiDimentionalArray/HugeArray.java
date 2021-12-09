package day_22_MultiDimentionalArray;

public class HugeArray {
    public static void main(String[] args) {
        /*
        Given the array:
            int[][][][][][][][]  arr8D = { {{{{{{{1,2,3,4,5}}}}}}} };


        Use for each loop to print each elements
         */

        int[][][][][][][][]  arr8D = { {{{{{{{1,2,3,4,5}}}}}}} };

        for (int[][][][][][][] arr7D : arr8D) {
            for (int[][][][][][] arr6D : arr7D) {
                for (int[][][][][] arr5D : arr6D) {
                    for (int[][][][] arr4D : arr5D) {
                        for (int[][][] arr3D : arr4D) {
                            for (int[][] arr2D : arr3D) {
                                for (int[] arr1D : arr2D) {
                                    for (int each : arr1D) {
                                        System.out.println(each);

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

    }
}
