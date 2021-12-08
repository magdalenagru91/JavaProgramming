package day_20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();    //10


        if (length<=0){

            System.err.println("Invalid entry");
            System.exit(0);
        }


        int[] numbers = new int[length];        //our array will contain x numbers as user wanted

        for (int i = 0; i < length; i++) {      //loop will repeat for x times
            System.out.println("Enter a number:");
            numbers[i]=scan.nextInt(); //5      //loop will now input x inputs to the array of the size of x, wciepujemy liczby do arraya
        }
        System.out.println(Arrays.toString(numbers));
        scan.close();
    }
}
