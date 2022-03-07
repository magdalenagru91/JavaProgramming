package practice;

import day_40_FinalKeyword.Animal;
import utilities.ArraysUtility;

import javax.swing.text.Utilities;
import java.util.ArrayList;
import java.util.Arrays;

public class a {

public static int minNum(int[]nums){
    Arrays.sort(nums);
    return nums[0];
}

    public static void main(String[] args) {
        int[]arr = {1,2,3};
        int min = a.minNum(arr);


        int [] a = {1,2,3};
        //ArraysUtility.addElement(a, 5);
        System.out.println(Arrays.toString(ArraysUtility.addElement(a, 5)));;
    }

}
