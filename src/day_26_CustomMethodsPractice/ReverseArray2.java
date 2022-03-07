package day_26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;


public class ReverseArray2 {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int[] newArr = reverse(arr);
        System.out.println(Arrays.toString(newArr));
    }


    public static int[] reverse(int[] array) {
        int[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }
}



