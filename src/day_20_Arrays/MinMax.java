package day_20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        /*
        write a program that asks user to enter a number 10 times:
        1.store all user entered numbers in the array
        2.find max num
        3.find min num
         */

        Scanner scan = new Scanner(System.in);


        int [] numbers = new int[10];


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();        //each user entered input will be assigned to the indexes of the array numbers

        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }

            if (numbers[i]<min) {
                min=numbers[i];
            }

        }


        System.out.println(Arrays.toString(numbers));
        System.out.println(max);
        System.out.println(min);

        scan.close();

    }

}
