package day_27_WrapperClasses;

import java.util.Arrays;

public class Swap {
    /*
    Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j.
	the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array
     */
    public static void main(String[] args) {
        int[] a= {1,2,3};
        int[] aa = swapElements(a,0,2);
        System.out.println(Arrays.toString(aa));
    }

    public static int[] swapElements(int[] array, int index1, int index2){

        int[] result = new int[array.length];

        for (int i = 0; i < result.length; i++) {
            if (i==index1){
                result[i]=array[index2];
            } else if (i==index2){
                result[i]=array[index1];
            } else {
                result[i]=array[i];
            }
        }
        return result;
    }


    public static int[] swap(int[] ar, int a, int b){
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
        return ar;
    }
}
