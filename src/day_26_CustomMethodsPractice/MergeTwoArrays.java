package day_26_CustomMethodsPractice;

import java.util.Arrays;

public class MergeTwoArrays {


    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int[] result = merge(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length+arr2.length];

        int i = 0;

        for (int each : arr1) {
            result[i++]=each;
        }

        for (int each : arr2) {
            result[i++]=each;
        }
        return result;
    }
}
