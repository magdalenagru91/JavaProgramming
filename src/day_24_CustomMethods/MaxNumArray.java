package day_24_CustomMethods;

public class MaxNumArray {

    //create a method that can return the maximum number from an array of integers

    public static void main(String[] args) {

        int yourMax = arr(new int[] {1,2,3,7});
        System.out.println(yourMax);
    }


   public static int arr (int[] yourArray){
        int max = yourArray[0];
       for (int each : yourArray) {
           if (each>max){
               max=each;
           }

       }
       return max;



    }
}
