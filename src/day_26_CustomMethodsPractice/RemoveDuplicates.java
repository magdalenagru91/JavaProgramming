package day_26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {


    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4};
        int[] removeDup = removeDuplicates(arr);
        System.out.println(Arrays.toString(removeDup));
    }


    public static int[] removeDuplicates(int[] array){

        int[] result ={};

        for (int each : array) {
            if (ArraysUtility.contains(result,each)){
                continue;}
            result = ArraysUtility.addElement(result,each);

        }
        return result;
    }
}
