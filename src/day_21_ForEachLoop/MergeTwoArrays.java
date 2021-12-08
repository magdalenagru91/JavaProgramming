package day_21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        /*
        merge 2 arrays
         */

        int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,6};

        int[] arr3 = new int[arr1.length+arr2.length];

        int k = 0;

        for (int each : arr1) {
            arr3[k++]=each;
        }

        for (int each : arr2) {
            arr3[k]=each;
            k++;
        }

        System.out.println(Arrays.toString(arr3));



        System.out.println("------------------------");


        String[] group1 = {"Ali", "Layan", "Aysenur"};
        String[] group2 =  {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};

        String[] students = new String[group1.length+group2.length];

        int i = 0;

        for (String each : group1) {
            students[i++]= each;
        }

        for (String each : group2) {
            students[i++]=each;
        }
        System.out.println(Arrays.toString(students));




        System.out.println("------------------------");

        char[] ch1={'A','B','C'};
        char[] ch2={'D','E','F','G','H'};

        char[] chars = new char[ch1.length+ch2.length];

        int j = 0;

        for (char each : ch1) {
            chars[j++]=each;

        }

        for (char each : ch2) {
            chars[j++]=each;
        }
        System.out.println(Arrays.toString(chars));

    }
}
