package day_24_CustomMethods;

import java.util.Arrays;

public class MergeTwoArrays {

    /*
    create a method that can merge two arrays and return
 the new array
     */

    public static void main(String[] args) {


        int[] twoArrays = MergedArrays(new int[] {1,2,3}, new int[] {4,5,6});
        System.out.println(Arrays.toString(twoArrays));
    }

    public static int[] MergedArrays(int[] yourArray1, int[] yourArray2){

        int[] merged = new int[yourArray1.length+yourArray2.length];

        int k =0;

        for (int each1 : yourArray1) {          //to every element of your new array MERGED you add element(each) from your old array (yourArray1 and yourArray2)
            merged[k++]+=each1;
        }

        for (int each2 : yourArray2) {
            merged[k++]+=each2;
        }

        return merged;

    }
}
