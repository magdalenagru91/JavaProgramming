package day_24_CustomMethods;

public class MinNumArray {

    /*
    create a method that can return the minimum number from an array of integers
     */

    public static void main(String[] args) {
        int minNum= MinNumberArray(new int[] {1,2,3,0});
        System.out.println(minNum);
    }

    public static int MinNumberArray(int[] yourArray){

        int min = yourArray[0];

        for (int each : yourArray) {
            if (each<min){
                min=each;
            }
        }
        return min;
    }
}
