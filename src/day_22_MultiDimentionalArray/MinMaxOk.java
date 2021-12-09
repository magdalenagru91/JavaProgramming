package day_22_MultiDimentionalArray;

public class MinMaxOk {
    public static void main(String[] args) {


        //index of the elements:   0 1 2       0 1 2 3      0  1  2  3  4
        int[][] arr2D = {{1, 2, 3}, {3, 2, 6, 7}, {8, 9, 10, 11, 12}};
        //  index number:              0         1             2


        int[] numbers = {3, 2, 6, 7};

        for (int i = 0; i < arr2D.length; i++) {

            int min = arr2D[i][0];
            int max = arr2D[i][0];

            for (int each : arr2D[i]) {
                if (each < min) {
                    min = each;
                }

                if (each>max) {
                    max = each;
                }

            }
           // System.out.println("Minimum: " + min + " Maximum: " + max);
            System.out.println("Minimum:" + i +" is " + min + " Maximum:" + i +" is " + max);
        }
    }
}