package day_07_Operators;

import java.util.Scanner;

public class kg {

    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter grams:");
        int inputGrams = userInput.nextInt();


        int ton;
        int kilo;
        int gram;


        int finalTons  = inputGrams/1000000;
        int finalKilos = inputGrams%1000000/1000;
        int finalGrams = inputGrams%1000;

        System.out.println(finalTons + " tons, " + finalKilos + " kilos, and " + finalGrams + " grams");
    }
}
