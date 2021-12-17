package day_26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {

    /*
    Create a class named RemoveElements:


            2.2 Create a method that passes two parameters: a double array and an integer index.
            the method removes the element at the given index of the array and returns the new array


            2.3 Create a method that passes two parameters: a char array and an integer index.
            the method removes the element at the given index of the array and returns the new array

            2.4 Create a method that passes two parameters: a String array and an integer index.
            the method removes the element at the given index of the array and returns the new array
     */



    /*
    2.1 Create a method that passes two parameters: an integer array and an integer index.
            the method removes the element at the given index of the array and returns the new array
                    Ex:
                        int[] arr = {10,20,30,40}
                        remove(arr, 2) ==> {10, 20, 40}
     */

    public static void main(String[] args) {

        int[] result = removeElements(new int[] {1,2,3,3,4}, 1);
        System.out.println(Arrays.toString(result));

    }


    //removes index from int array, returns new array
    public static int[] removeElements(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }


        int[] result = new int[array.length - 1];

        int j = 0; //index of the array result

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];

        }
        return result;
    }
}
