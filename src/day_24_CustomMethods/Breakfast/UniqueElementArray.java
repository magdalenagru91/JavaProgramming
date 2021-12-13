package day_24_CustomMethods.Breakfast;

public class UniqueElementArray {
    /*
    create a method that can display the unique elements of array
     */

    public static void main(String[] args) {
        UniqueElementOfArray(new String[]{"elo", "mama", "mama"});
    }

    public static void UniqueElementOfArray(String[] word) {

        String result = "";

        for (String each : word) {
            int frequency = 0;

            for (String elements : word) {
                if (elements.equalsIgnoreCase(each)) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                result += each;
                //if (result.contains(each)){
                //continue;
            }

        } System.out.println(result);
    }
}
