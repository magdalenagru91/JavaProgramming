package day_26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class RemoveElements2 {

    public static int[] removeElementSecondApproach(int[] array, int index){

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i != index){
                ArraysUtility.addElement(result,array[i]);      //array[i] is the element we want to add, in fori it is array[i] in for each it is each
        }
        }
        return result;
    }
}
