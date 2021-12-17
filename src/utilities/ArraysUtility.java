package utilities;

import java.util.Arrays;

public class ArraysUtility {



    //1.adds the given element to array, returns a new array
    public static int[] addElement (int[] array, int element){

        int[] result = new int[array.length+1];

        int i =0;

        for (int each : array) {
            result[i++]=each;
        }

        result[i]+=element;

        return result;


    }




    //2.adds the given element to array, returns a new array
    public static double[] addElement (double[] array, double element){

        double[] result = new double[array.length+1];

        int i =0;

        for (double each : array) {
            result[i++]=each;
        }

        result[i]+=element;

        return result;


    }



    //3.adds the given element to array, returns a new array
    public static String[] addElement (String[] array, String element){

        String[] result = new String[array.length+1];

        int i = 0;

        for (String each : array) {
            result[i++]=each;
        }

        result[result.length-1]=element;// element needs to be assigned to the last index
        // result[i] = element;

        return result;
    }



    //4.adds the given element to array, returns a new array
    public static char[] addElement (char[] array, char element){

        char[] result = new char[array.length+1];

        int i = 0;

        for (char each : array) {
            result[i++]=each;
        }

        result[i]+=element;

        return result;
    }



    //5.prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array){

        for (int each : array) {
            System.out.println(each);
        }
    }



    //6.prints each double of an integer array in separate lines
    public static void printEachElement(double[] array){

        for (double each : array) {
            System.out.println(each);
        }
    }



    //7.prints each char of an integer array in separate lines
    public static void printEachElement(char[] array){

        for (char each : array) {
            System.out.println(each);
        }
    }



    //8.prints each String of an integer array in separate lines
    public static void printEachElement(String[] array){

        for (String each : array) {
            System.out.println(each);
        }
    }



    //9.returns the maximum number for integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);

        return numbers[numbers.length-1];

    }



    //10.returns the maximum number for integer array
    public static double max(double[] numbers){
        Arrays.sort(numbers);

        return numbers[numbers.length-1];
    }



    //11.returns the minimum number for integer array
    public static int min(int[] numbers){
        Arrays.sort(numbers);

        return numbers[0];

    }



    //12.returns the minimum number for integer array
    public static double min(double[] numbers){
        Arrays.sort(numbers);

        return numbers[0];
    }



    //13.checks if the given integer is contained in the given array, returns boolean, contains(int[],int)
    public static boolean contains(int[] array, int element){
        boolean result = false;

        for (int each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }



    //14.checks if the given integer is contained in the given array, returns boolean, contains(double[],double)
    public static boolean contains(double[] array, double element){
        boolean result = false;

        for (double each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }


    //15.checks if the given integer is contained in the given array, returns boolean, contains(char[],char)
    public static boolean contains(char[] array, char element){
        boolean result = false;

        for (char each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }


    //16.checks if the given integer is contained in the given array, returns boolean, contains(String[],String)
    public static boolean contains(String[] array, String element){
        boolean result = false;

        for (String each : array) {
            if (each.equals(element)){
                result=true;
            }
        }
        return result;
    }


    //17.reverse the array of int
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];

        for (int i = array.length-1, j=0; i >=0 ; i--,j++) {
            result[j]=array[i];
        }
        return result;
        }



    //18.reverse the array of double
    public static double[] reverse(double[] array){
        double[] result = new double[array.length];

        for (int i = array.length-1, j=0; i >=0 ; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }



    //19.reverse the array of char
    public static char[] reverse(char[] array){
        char[] result = new char[array.length];

        for (int i = array.length-1, j=0; i >=0 ; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }



    //20.reverse the array of String
    public static String[] reverse(String[] array){
        String[] result = new String[array.length];

        for (int i = array.length-1, j=0; i >=0 ; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }



    //21.merge array of int
    public static int[] merge(int[] array1, int[] array2){

        int[] result = {};

        for (int each : array1) {
            result=addElement(result,each);
        }
        for (int each : array2) {
            result=addElement(result,each);
        }

        return result;
    }



    //22.merge array of double
    public static double[] merge(double[] array1,double[] array2){

        double[] result = {};

        for (double each : array1) {
            result=addElement(result,each);
        }
        for (double each : array2) {
            result=addElement(result,each);
        }
        return result;
    }



    //23.merge array of char
    public static char[] merge(char[] array1,char[] array2){

        char[] result = {};

        for (char each : array1) {
            result=addElement(result,each);
        }
        for (char each : array2) {
            result=addElement(result,each);
        }
        return result;
    }



    //24.merge array of String
    public static String[] merge(String[] array1,String[] array2){

        String[] result = {};

        for (String each : array1) {
            result=addElement(result,each);
        }
        for (String each : array2) {
            result=addElement(result,each);
        }
        return result;
    }



    //25.Returns the frequency of the given int element from the given array
    public static int frequencyOfElement(int[] array, int element){

        int frequency = 0;

        for (int each : array) {
            if (each==element){
                frequency++;
            }
        }
        return frequency;
    }



    //26.Returns the frequency of the given double element from the given array
    public static int frequencyOfElement(double[] array, double element){

        int frequency = 0;

        for (double each : array) {
            if (each==element){
                frequency++;
            }
        }
        return frequency;
    }


    //27.Returns the frequency of the given char element from the given array
    public static int frequencyOfElement(char[] array, char element){

        int frequency = 0;

        for (char each : array) {
            if (each==element){
                frequency++;
            }
        }
        return frequency;
    }



    //28.Returns the frequency of the given String element from the given array
    public static int frequencyOfElement(String[] array, String element){

        int frequency = 0;

        for (String each : array) {
            if (each.equals(element)){
                frequency++;
            }
        }
        return frequency;
    }



    //29.returns the unique elements of the arrays as a new array - int
    public static int[] uniqueElements(int[] array){

        int[] result = {};

        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) ==1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }



    //30.returns the unique elements of the arrays as a new array - double
    public static double[] uniqueElements(double[] array){

        double[] result = {};

        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) ==1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }



    //31.returns the unique elements of the arrays as a new array - char
    public static char[] uniqueElements(char[] array){

        char[] result = {};

        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) ==1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }



    //32.returns the unique elements of the arrays as a new array - String
    public static String[] uniqueElements(String[] array){

        String[] result = {};

        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) ==1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }



    //33.removes index from int array, returns new array
    public static int[] removeElementsFirstApproach(int[] array, int index) {

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
    


    //34.removes index from double array, returns new array
    public static double[] removeElementsFirstApproach(double[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        double[] result = new double[array.length - 1];

        int j = 0; //index of the array result

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];

        }
        return result;
    }
    
    

    //35.removes index from char array, returns new array
    public static char[] removeElementsFirstApproach(char[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        char[] result = new char[array.length - 1];

        int j = 0; //index of the array result

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];

        }
        return result;
    }



    //36.removes index from String array, returns new array
    public static String[] removeElementsFirstApproach(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        String[] result = new String[array.length - 1];

        int j = 0; //index of the array result

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];

        }
        return result;
    }


/*
    //37. removes duplicates from the int array
    public static int[] removeDuplicates(int[] array) {

        int[] result = {};

        for (int each : array) {
            if (ArraysUtility.contains(result, each)) {
                continue;
            }
            result = ArraysUtility.addElement(result, each);

        }
        return result;
    }



    //38. removes duplicates from the double array
    public static double[] removeDuplicates(double[] array) {

    double[] result = {};

    for (double each : array) {
        if (ArraysUtility.contains(result, each)) {
                    continue;
                }
                result = ArraysUtility.addElement(result, each);

            }
            return result;
        }



    //39. removes duplicates from the char array
    public static char[] removeDuplicates(char[] array) {
       char[] result = {};

        for (char each : array) {
            if (ArraysUtility.contains(result, each)) {
                continue;
            }
            result = ArraysUtility.addElement(result, each);

        }
        return result;
            }



    //40. removes duplicates from the String array
    public static String[] removeDuplicates(String[] array){

                    String[] result ={};

                    for (String each : array) {
                        if (ArraysUtility.contains(result,each)){
                            continue;}
                        result = ArraysUtility.addElement(result,each);

                    }
                    return result;
    }

*/

    //41.replaces int element in the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement) {
        if (index<0 || index>array.length-1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        } array[index] = newElement;
        return array;
    }



    //42.replaces double element in the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement) {
        if (index<0 || index>array.length-1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        } array[index] = newElement;
        return array;
    }




    //43.replaces char element in the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement) {
        if (index<0 || index>array.length-1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        } array[index] = newElement;
        return array;
    }




    //44.replaces String element in the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement) {
        if (index<0 || index>array.length-1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        } array[index] = newElement;
        return array;
    }


    //45.replaces all the matching old int values of the array with the new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i]==oldValue){                //each of indexes that has the value we look for will be replaces, in for-each it would replace only one value
                array[i]=newValue;
            }
        }
        return array;
    }



    //46.replaces all the matching old double values of the array with the new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i]==oldValue){                //each of indexes that has the value we look for will be replaces, in for-each it would replace only one value
                array[i]=newValue;
            }
        }
        return array;
    }


    //47.replaces all the matching old char values of the array with the new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i]==oldValue){                //each of indexes that has the value we look for will be replaces, in for-each it would replace only one value
                array[i]=newValue;
            }
        }
        return array;
    }



    //48.replaces all the matching old String values of the array with the new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(oldValue)){                //each of indexes that has the value we look for will be replaces, in for-each it would replace only one value
                array[i]=newValue;
            }
        }
        return array;
    }


    //49.removes int duplicates from the array
    public static int[] removeDuplicates(int[] array) {
        int[] result = {};

        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result,each);

            }
        }
        return result;
    }


    //50.removes double duplicates from the array
    public static double[] removeDuplicates(double[] array) {
        double[] result = {};
        int i = 0;

        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result,each);

            }
        }
        return result;
    }



    //51.removes char duplicates from the array
    public static char[] removeDuplicates(char[] array) {
        char[] result = {};
        int i = 0;

        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result,each);

            }
        }
        return result;
    }



    //52.removes String duplicates from the array
    public static String[] removeDuplicates(String[] array) {
        String[] result = {};
        int i = 0;

        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result,each);

            }
        }
        return result;
    }









    }

