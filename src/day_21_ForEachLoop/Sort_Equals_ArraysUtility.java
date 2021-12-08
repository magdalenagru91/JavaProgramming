package day_21_ForEachLoop;

import java.util.Arrays;

public class Sort_Equals_ArraysUtility {

    public static void main(String[] args) {

        int [] nums = {95,100,55,65,85,78};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("Min score: " + nums[0]);
        System.out.println("Max score: " + nums[nums.length-1]);


        System.out.println("---------------------");

        int [] arr1 = {1,3,2};
        int [] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);


        System.out.println("---------------------");

        char [] ch1 = {'a', 'c', 'b'};
        char [] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        Boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println(anagram);


    }
}
