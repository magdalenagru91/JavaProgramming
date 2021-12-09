package day_22_MultiDimentionalArray;


public class OddEven2 {
    public static void main(String[] args) {



    /*
        Write a program that can count the total odd and even numbers from a two dimensional array
         */

    // index of the elemts:    0 1 2    0 1 2 3    0 1  2  3  4
    int[][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} };
    //  index number:    0         1             2



    for (int i = 0; i < arr2D.length; i++) {

        String even = "";
        String odd = "";


        for (int elements : arr2D[i]) {
            if (elements%2==0){
                even+=elements+" ";
            } else {
                odd+=elements+" ";
            }

        }


        System.out.println("Even from " + i + " is: " + even + " Odd from " + i + " is: " + odd);

    }
}
}
