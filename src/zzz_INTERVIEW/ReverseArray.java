package zzz_INTERVIEW;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] reversedArr = new int[arr.length];


        for (int i = arr.length - 1, j=0; j<arr.length; i--, j++) {
            reversedArr[j]+=arr[i];
        }
        System.out.println(Arrays.toString(reversedArr));

    }
}
