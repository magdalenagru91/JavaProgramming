package day_27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] array = {1,2,3,3,3,4};
        int[] arr1 = removeDuplicates(array);
        System.out.println(Arrays.toString(arr1));
    }




    public static int[] removeDuplicates(int[] array) {
        int[] result = {};

        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result,each);

            }
        }
        return result;
    }



    public static double[] removeDuplicates(double[] array) {
        double[] result = {};
        int i = 0;

        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result,each);

            }
        }
        return result;
    }



    public static char[] removeDuplicates(char[] array) {
        char[] result = {};
        int i = 0;

        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result,each);

            }
        }
        return result;
    }


    public static String[] removeDuplicates(String[] array) {
        String[] result = {};
        int i = 0;

        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result,each);

            }
        }
        return result;
    }
}
