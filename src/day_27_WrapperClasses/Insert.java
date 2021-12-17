package day_27_WrapperClasses;

import utilities.ArraysUtility;

import javax.swing.text.Utilities;
import java.util.Arrays;

public class Insert {


    /*
    1. Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
		the method inserts the given element to the given index of the array and returns the new array

				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array
     */

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = insert(a, 1, 9);
        System.out.println(Arrays.toString(b));


        String[] c = {"elo", "lol"};
        String[] d = insert(c,0,"magda");
        System.out.println(Arrays.toString(d));
    }

//inserts an int element on the indicated index to the array
    public static int[] insert (int[] array, int index, int element){
        int[] result = new int[array.length+1];


        for (int i = 0, j=0; i < result.length; i++) {

            if (i == index) {
                result[i] = element;
            } else {
                result[i] = array[j++];
            }
        }
        return result;
    }



//inserts a double element on the indicated index to the array
    public static double[] insert (double[] array, int index, double element){
        double[] result = new double[array.length+1];


        for (int i = 0, j=0; i < result.length; i++) {

            if (i == index) {
                result[i] = element;
            } else {
                result[i] = array[j++];
            }
        }
        return result;
    }



//inserts a char element on the indicated index to the array
    public static char[] insert (char[] array, int index, char element){
        char[] result = new char[array.length+1];


        for (int i = 0, j=0; i < result.length; i++) {

            if (i == index) {
                result[i] = element;
            } else {
                result[i] = array[j++];
            }
        }
        return result;
    }



//inserts a String element on the indicated index to the array
    public static String[] insert (String[] array, int index, String element){
        String[] result = new String[array.length+1];


        for (int i = 0, j=0; i < result.length; i++) {

            if (i == index) {
                result[i] = element;
            } else {
                result[i] = array[j++];
            }
        }
        return result;
    }

}
