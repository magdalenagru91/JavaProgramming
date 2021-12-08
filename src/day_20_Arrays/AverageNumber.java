package day_20_Arrays;

public class AverageNumber {
    public static void main(String[] args) {

        /*
        Print out the average number
         */

        int[] numbers = {10,20,30,40,50,60};

        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];

        }

        double averageNumber = sum/numbers.length;

        System.out.println(sum);
        System.out.println(averageNumber);



    }
}
