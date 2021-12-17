package day_25_CustomMethods_Overloading;

import java.util.Arrays;

public class ReverseArray {
    /*
    1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
     */
    public static void main(String[] args) {
        int[] newArray1 = reverseArray(new int[] {1,2,3});
        System.out.println(Arrays.toString(newArray1));


        double[] newArray2 = reverseArray(new double[] {1.1,2.2,3.3});
        System.out.println(Arrays.toString(newArray2));


        char[] newArray3 = reverseArray(new char[] {'a','b','c'});
        System.out.println(Arrays.toString(newArray3));


        String[] newArray4 = reverseArray(new String[] {"Mag","Er","Woj"});
        System.out.println(Arrays.toString(newArray4));
    }
    
    

    public static int[] reverseArray(int[] yourArray){

        int[] newArray = new int[yourArray.length];

        for (int i = yourArray.length-1,j=0; i >=0 ; i--,j++) {
            newArray[j]=yourArray[i];
        }
        return newArray;
    }


    public static double[] reverseArray(double[] yourArray){

        double[] newArray = new double[yourArray.length];

        for (int i = yourArray.length-1,j=0; i >=0 ; i--,j++) {
            newArray[j]=yourArray[i];
        }
        return newArray;
    }



    public static char[] reverseArray(char[] yourArray){

        char[] newArray = new char[yourArray.length];

        for (int i = yourArray.length-1,j=0; i >=0 ; i--,j++) {
            newArray[j]=yourArray[i];
        }
        return newArray;
    }



    public static String[] reverseArray(String[] yourArray){

        String[] newArray = new String[yourArray.length];

        for (int i = yourArray.length-1,j=0; i >=0 ; i--,j++) {
            newArray[j]=yourArray[i];
        }
        return newArray;
    }
}
