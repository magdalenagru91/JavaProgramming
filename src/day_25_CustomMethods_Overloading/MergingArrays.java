package day_25_CustomMethods_Overloading;

import java.util.Arrays;

public class MergingArrays {

    /*
    1. create a method that can merge two integer arrays.  		merger(int[] arr1, int[] arr2)

	2. create a method that can merge two double arrays.  		merge(double[] arr1, double[] arr2)

	3. create a method that can merge two char arrays.   		merge(char[] arr1, char[] arr2)

	4. create a method that can merge two String arrays.  		merge(String[] arr1, String[] arr2)

			merge()
     */

    public static void main(String[] args) {
        int[] newArray = merge(new int[] {1,2,3}, new int[] {4,5,6});
        System.out.println(Arrays.toString(newArray));


        double[] newArray2 = merge(new double[] {1.1,2.2}, new double[] {3.3,4.4});
        System.out.println(Arrays.toString(newArray2));


        char[] newArray3 = merge(new char[] {'a','b'}, new char[] {'c'});
        System.out.println(Arrays.toString(newArray3));


        String[] newArray4 = merge(new String[] {"Magda", "Eray"}, new String[] {"Wojtek"});
        System.out.println(Arrays.toString(newArray4));

    }




    public static int[] merge(int[] arr1, int[] arr2){

        int[] array = new int[arr1.length+arr2.length];
        int i=0;

        for (int each : arr1) {
            array[i++]=each;
        }

        for (int each : arr2) {
            array[i++]=each;
        }
        return array;
    }


    public static double[] merge(double[] arr1, double[] arr2){

        double[] array = new double[arr1.length+arr2.length];
        int i=0;

        for (double each : arr1) {
            array[i++]=each;
        }

        for (double each : arr2) {
            array[i++]=each;
        }
        return array;
    }


    public static char[] merge(char[] arr1, char[] arr2){

        char[] array = new char[arr1.length+arr2.length];
        int i=0;

        for (char each : arr1) {
            array[i++]=each;
        }

        for (char each : arr2) {
            array[i++]=each;
        }
        return array;
    }


    public static String[] merge(String[] arr1, String[] arr2){

        String[] array = new String[arr1.length+arr2.length];
        int i=0;

        for (String each : arr1) {
            array[i++]=each;
        }

        for (String each : arr2) {
            array[i++]=each;
        }
        return array;
    }
}
