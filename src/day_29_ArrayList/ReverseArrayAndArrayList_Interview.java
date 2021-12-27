package day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayAndArrayList_Interview {

    public static void main(String[] args) {


        /*
        1.you create an empty array (here result) with the same length of your array you wanna reverse
        2.you use fori loop from the last index to 0
        3.you create an additional variable j for index numbers for the empty array result, i is for the old array indexes
        4.you assign old array element to new result array
        5.you print it outside of the loop
         */

        int[] array = {1,2,3,4,5,6};

        //{6,5,4,3,2,1}


        int[] result = new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        System.out.println(Arrays.toString(result));




        System.out.println("----------------interview way for arrays list reverse----------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = list.size()-1; i>=0 ; i--) {
            //int each = list.get(i);             //we need index that's why we create int each here, and we assign
            //reversedList.add(each);             //element one by one from last element to 0
            reversedList.add(list.get(i));        //we add each to the reversed list
        }
        System.out.println(reversedList);




        System.out.println("------------------easy way not for interview-------------------");
        Collections.reverse(list);
        System.out.println(list);
    }
}
