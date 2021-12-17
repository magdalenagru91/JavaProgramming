package day_25_CustomMethods_Overloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

        int[] arro = {};
        int[] newArro = ArraysUtility.addElement(arro,3);
        System.out.println(Arrays.toString(newArro));


        System.out.println("-----------------");

        //int[] arr1 = {1,2,3,4,5};
        ArraysUtility.printEachElement(new int[]{1, 2, 3});


        System.out.println("-----------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        ArraysUtility.printEachElement(arr2);


        System.out.println("-----------------");
        char[] arr3 = {'A', 'B', 'C'};
        ArraysUtility.printEachElement(arr3);


        System.out.println("-----------------");
        String[] names = {"David", "Elvira", "Ali", "Igor"};
        ArraysUtility.printEachElement(names);


        System.out.println("-----------------");
        int max = ArraysUtility.max(new int[]{1, 3, 0, 7});
        System.out.println("max " + max);


        System.out.println("-----------------");
        double maxdouble = ArraysUtility.max(new double[] {1.1,3.2,0,7.3});
        System.out.println("max double " + maxdouble);


        System.out.println("-----------------");
        double min = ArraysUtility.min(new int[] {1, 3, 0, 7});
        System.out.println("min " + min);


        System.out.println("-----------------");
        double mindouble = ArraysUtility.min(new double[] {1.1,3.2,0,7.3});
        System.out.println("min double " + mindouble);


        System.out.println("--------B---------");
        boolean contain1 = ArraysUtility.contains(new int[] {1,2,3}, 9);
        System.out.println("contains " + contain1);


        System.out.println("--------B---------");
        boolean contain2 = ArraysUtility.contains(new double[] {1.1,2.3,3.4}, 1.2);
        System.out.println("contains " + contain2);


        System.out.println("--------B---------");
        boolean contain3 = ArraysUtility.contains(new char[] {'a','b'}, 'c');
        System.out.println("contains " + contain3);


        System.out.println("--------B---------");
        boolean contain4 = ArraysUtility.contains(new String[] {"mag", "elo"}, "elo");
        System.out.println("contains " + contain4);


        System.out.println("-----------------");
        int[] reverse1 = ArraysUtility.reverse(new int[] {1,2,3});
        System.out.println(Arrays.toString(reverse1));


        System.out.println("-----------------");
        double[] reverse2 = ArraysUtility.reverse(new double[] {1.1,2.2,3.3});
        System.out.println(Arrays.toString(reverse2));



        System.out.println("-----------------");
        char[] reverse3 = ArraysUtility.reverse(new char[] {'a','b','c'});
        System.out.println(Arrays.toString(reverse3));



        System.out.println("-----------------");
        String[] reverse4 = ArraysUtility.reverse(new String[] {"Magda", "Eray"});
        System.out.println(Arrays.toString(reverse4));


        System.out.println("-----------------");
        int[] merge1 = ArraysUtility.merge(new int[] {1,2,3}, new int[] {4,5,6});
        System.out.println(Arrays.toString(merge1));


        }
}

