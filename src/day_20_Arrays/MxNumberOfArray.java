package day_20_Arrays;

import java.util.Arrays;

public class MxNumberOfArray {

    public static void main(String[] args) {

        int [] numbers= {10,5,4,20,1,0};

        int max = numbers[0];   //just assumption that the first is max

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]>max) {   //if there is element in the array that's greater than the current max number
                max=numbers[i];     //assigning greater number to variable max

        }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(max);

    }
}
