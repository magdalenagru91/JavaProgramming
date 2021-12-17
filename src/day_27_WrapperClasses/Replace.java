package day_27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {
        int[] array = {1,2,3,4};

        int[] arr1= replace(array,2,9);
        System.out.println(Arrays.toString(arr1));


        String[] array1 = {"Magda", "Wojtek"};
        String[] arr2 = replace(array1,0,"Eray");
        System.out.println(Arrays.toString(arr2));
    }



//replaces int element in the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement) {
        if (index<0 || index>array.length-1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        } array[index] = newElement;
        return array;
    }



//replaces double element in the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement) {
        if (index<0 || index>array.length-1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        } array[index] = newElement;
        return array;
    }




//replaces char element in the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement) {
        if (index<0 || index>array.length-1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        } array[index] = newElement;
        return array;
    }




//replaces String element in the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement) {
        if (index<0 || index>array.length-1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        } array[index] = newElement;
        return array;
    }
}
