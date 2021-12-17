package day_27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    /*
    RecplaceAll Task:
        2.1 Create a method named replace that passes three parameters: integer array, integer oldElement, integer newElement. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


        2.2 Create the same functions for double arrays, char arrays, and String arrays
     */

    public static void main(String[] args) {

        int[] array = {1,3,2,3,4,1};
        int[] arr1 = replaceAll(array,1, 9);
        System.out.println(Arrays.toString(arr1));

        arr1 = replaceAll(array,9,20);
        System.out.println(Arrays.toString(arr1));



        String[] array1 = {"mag", "gru", "lol", "mag"};
        String[] arr2 = replaceAll(array1,"mag","ziom");
        System.out.println(Arrays.toString(arr2));

    }



    //replaces all the matching old int values of the array with the new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i]==oldValue){                //each of indexes that has the value we look for will be replaces, in for-each it would replace only one value
                array[i]=newValue;
            }
        }
        return array;
        }



    //replaces all the matching old double values of the array with the new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i]==oldValue){                //each of indexes that has the value we look for will be replaces, in for-each it would replace only one value
                array[i]=newValue;
            }
        }
        return array;
    }


    //replaces all the matching old char values of the array with the new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i]==oldValue){                //each of indexes that has the value we look for will be replaces, in for-each it would replace only one value
                array[i]=newValue;
            }
        }
        return array;
    }



    //replaces all the matching old int values of the array with the new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(oldValue)){                //each of indexes that has the value we look for will be replaces, in for-each it would replace only one value
                array[i]=newValue;
            }
        }
        return array;
    }
}
