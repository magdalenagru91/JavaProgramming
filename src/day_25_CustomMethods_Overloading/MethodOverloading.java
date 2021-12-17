package day_25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {
        sumOfNumbers(10,20,30,40);

        sumOfNumbers(1.2,3.10);

        sumOfNumbers(1.1,2.2,3.3);


        System.out.println("-------------------------");

        //sum of 10 and 20
        int sum1 = sumOfNumbers(10,20);
        System.out.println(sum1);

        //sum of 10,20,30
        int sum2 = sumOfNumbers(10,20,30);
        System.out.println(sum2);

        //sum of 10,20,30,40
        int sum3 = sumOfNumbers(10,20,30,40);
        System.out.println(sum3);

        //sum of 18.2 and 30.7
        double sum4 = sumOfNumbers(18.2,30,7);
        System.out.println(sum4);

        //sum of 5.5,4.5,6.5
        double sum5 = sumOfNumbers(5.5,4.5,6.5);
        System.out.println(sum5);

        //sum of 4.5,3.5,6.5
        double sum6 = sumOfNumbers(4.5,3.5,2.5,6.5);
        System.out.println(sum6);





        System.out.println("-------------------------");



        int[] element1 = addElement(new int[] {1,2,3}, 4);
        System.out.println(Arrays.toString(element1));

        double[] element2 = addElement(new double[] {1.1,2.2}, 3.3);
        System.out.println(Arrays.toString(element2));

        String[] element3 = addElement(new String[] {"magda", "wojtek"}, "stachu");
        System.out.println(Arrays.toString(element3));

        char[] element4 = addElement(new char[] {'a','b'},'c');
        System.out.println(Arrays.toString(element4));
    }




    public static int sumOfNumbers(int num1, int num2){
        return num1+num2;
    }
    public static double sumOfNumbers(double num1, double num2){
        return num1+num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3){

        return num1+num2+num3;
    }

    public static double sumOfNumbers(double num1, double num2, double num3){
        //return num1+num2+num3;

        return sumOfNumbers(num1,num2)+ num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {

        return num1+num2+num3+num4;

    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4){
        //return num1+num2+num3+num4;

        return sumOfNumbers(num1,num2,num3) + num4;
    }




    /*
    1. create a return method called addInteger that can add an Inteeger
    after the  last index of an integer array
    */
    public static int[] addElement (int[] array, int element){

        int[] result = new int[array.length+1];

        int i =0;

        for (int each : array) {
            result[i++]=each;
        }

        result[i]+=element;

        return result;


    }



    /*
    2. create a return method called addDouble that can add a double after the last index of a double array
     */
    public static double[] addElement (double[] array, double element){

        double[] result = new double[array.length+1];

        int i =0;

        for (double each : array) {
            result[i++]=each;
        }

        result[i]+=element;

        return result;


    }


    /*
    3. create a return method called addString that can add a String after the last index of a String array
     */
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



    /*
    4. create a return method called addChar that can add a char after last index of a char array
     */
    public static char[] addElement (char[] array, char element){

        char[] result = new char[array.length+1];

        int i = 0;

        for (char each : array) {
            result[i++]=each;
        }

        result[i]+=element;

        return result;
    }




}
