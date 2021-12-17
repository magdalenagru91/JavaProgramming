package day_25_CustomMethods_Overloading;

public class MaxNum {

    /*
    1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array
     */

    public static void main(String[] args) {
        int yourMax1 = maxNum(new int[] {1,24,3});
        System.out.println(yourMax1);


        double yourMax2 = maxNum(new double[] {1.1,24.0,3.5});
        System.out.println(yourMax2);


        long yourMax3 = maxNum(new long[] {10000L,24555L,3666666L});
        System.out.println(yourMax3);


        short yourMax4 = maxNum(new short[] {1,24,3});
        System.out.println(yourMax4);


        float yourMax5 = maxNum(new float[] {1F,24F,3F});
        System.out.println(yourMax5);


        byte yourMax6 = maxNum(new byte[] {1,24,3});
        System.out.println(yourMax6);

    }

    public static int maxNum (int[] yourArray){

        int max = yourArray[0];

        for (int each : yourArray) {
            if (each>max){
               max = each;
            }

        }
        return max;
    }



    public static double maxNum (double[] yourArray){

        double max = yourArray[0];

        for (double each : yourArray) {
            if (each>max){
                max = each;
            }

        }
        return max;
    }



    public static long maxNum (long[] yourArray){

        long max = yourArray[0];

        for (long each : yourArray) {
            if (each>max){
                max = each;
            }

        }
        return max;
    }



    public static short maxNum (short[] yourArray){

        short max = yourArray[0];

        for (short each : yourArray) {
            if (each>max){
                max = each;
            }

        }
        return max;
    }


    public static float maxNum (float[] yourArray){

        float max = yourArray[0];

        for (float each : yourArray) {
            if (each>max){
                max = each;
            }

        }
        return max;
    }


    public static byte maxNum (byte[] yourArray){

        byte max = yourArray[0];

        for (byte each : yourArray) {
            if (each>max){
                max = each;
            }

        }
        return max;
    }
}
