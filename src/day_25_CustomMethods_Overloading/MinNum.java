package day_25_CustomMethods_Overloading;

public class MinNum {

    public static void main(String[] args) {

        int yourMin1 = minNum(new int[] {0,1,2,3});
        System.out.println(yourMin1);

        double yourMin2 = minNum(new double[] {0,1.2,2.6,3.3});
        System.out.println(yourMin2);

        long yourMin3 = minNum(new long[] {10000L,2656565L,378787L});
        System.out.println(yourMin3);

        short yourMin4 = minNum(new short[] {1,2,3});
        System.out.println(yourMin4);

        float yourMin5 = minNum(new float[] {155.5F,2F,3.2F});
        System.out.println(yourMin5);

        byte yourMin6 = minNum(new byte[] {-5,1,2,3});
        System.out.println(yourMin6);
    }



    public static int minNum (int[] yourArray){

        int min = yourArray[0];

        for (int each : yourArray) {
            if (each<min){
                min = each;
            }

        }
        return min;
    }


    public static double minNum (double[] yourArray){

        double min = yourArray[0];

        for (double each : yourArray) {
            if (each<min){
                min = each;
            }

        }
        return min;
    }


    public static long minNum (long[] yourArray){

        long min = yourArray[0];

        for (long each : yourArray) {
            if (each<min){
                min = each;
            }

        }
        return min;
    }


    public static short minNum (short[] yourArray){

        short min = yourArray[0];

        for (short each : yourArray) {
            if (each<min){
                min = each;
            }

        }
        return min;
    }


    public static float minNum (float[] yourArray){

        float min = yourArray[0];

        for (float each : yourArray) {
            if (each<min){
                min = each;
            }

        }
        return min;
    }


    public static byte minNum (byte[] yourArray){

        byte min = yourArray[0];

        for (byte each : yourArray) {
            if (each<min){
                min = each;
            }

        }
        return min;
    }
}
