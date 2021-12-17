package day_26_CustomMethodsPractice;

public class FrequencyOfElement {


    /*
    1. Create a class named FrequencyOfElements:
            1.1 Create a method that passes two parameters: an integer array and an Integer element.
            The method returns the frequency of the given integer element from the integer array

            1.2 Create a method that passes two parameters: a double array and a double element.
            The method returns the frequency of the given integer from the array

            1.3 Create a method that passes two parameters: a char array and a char element.
            The method returns the frequency of the given char element from the char array

            1.4 Create a method that passes two parameters: a String array and a String element.
            The method returns the frequency of the given String element from the String array
     */


    public static void main(String[] args) {
        int frequency1 = frequencyOfElement(new int[] {1,2,1,1,3}, 1);
        System.out.println(frequency1);


        double[] arr1 = {1.1,1.1,2.3};
        double frequency2 = frequencyOfElement(arr1,1.1);
        System.out.println(frequency2);


        char[] arr2 = {'a','a','a'};
        double frequency3 = frequencyOfElement(arr2,'a');
        System.out.println(frequency3);


        String[] arr3 = {"ala", "ala"};
        double frequency4 = frequencyOfElement(arr3,"ala");
        System.out.println(frequency4);



    }


    //Returns the frequency of the given int element from the given array
    public static int frequencyOfElement(int[] array, int element){

        int frequency = 0;

        for (int each : array) {
            if (each==element){
                frequency++;
            }
        }
        return frequency;
    }



    //Returns the frequency of the given double element from the given array
    public static int frequencyOfElement(double[] array, double element){

        int frequency = 0;

        for (double each : array) {
            if (each==element){
                frequency++;
            }
        }
        return frequency;
    }


    //Returns the frequency of the given char element from the given array
    public static int frequencyOfElement(char[] array, char element){

        int frequency = 0;

        for (char each : array) {
            if (each==element){
                frequency++;
            }
        }
        return frequency;
    }



    //Returns the frequency of the given String element from the given array
    public static int frequencyOfElement(String[] array, String element){

        int frequency = 0;

        for (String each : array) {
            if (each.equals(element)){
                frequency++;
            }
        }
        return frequency;
    }
}
