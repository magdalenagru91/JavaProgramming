package day_21_ForEachLoop;

import java.util.Arrays;

public class ReversedArray {

    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50};

        //{50,40,30,20,10} this should be the final result

        int [] reversed = new int[numbers.length];  //to make sure that the array has enough capacity to contain all the elements of first array

        /*
       reversed[0] = numbers[numbers.length-1];
       reversed[1] = numbers[2];
       reversed[1] = numbers[1];
       reversed[1] = numbers[0];
        */


        for (int i = numbers.length - 1, j=0; i >= 0; i--,j++) {
            reversed[j]+=numbers[i];
        }
        System.out.println(Arrays.toString(reversed));




        }
    }

