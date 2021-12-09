package day_23_CustomMethods;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CustomMethodsWithParameters {

    //create a function that can check if a number is odd number or even number


    public static void main(String[] args) {

        System.out.println("Test 1-odd or even:");
        oddOrEven(5);                   //this method demands additional info to complete the task: enter the number
        System.out.println("End of test");


        System.out.println("Test 2-age of person:");
        ageOfPerson(1995);                  //this method demands additional info to complete the task: enter the number
        System.out.println("End of test");


        System.out.println("Test 3-numbers from x to y:");
        printNumbers(10, 0);               //this method demands additional info to complete the task: enter the number
        System.out.println("End of test");

    }

    //check if the number is odd or even
    public static void oddOrEven(int number) {


        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }


    //create a function that can display the age of person
    public static void ageOfPerson(int birthYear) {

        int age = 2021 - birthYear;

        System.out.println("Your age is: " + age);
    }


    //create a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y) {

        if (x < y) {

            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        }
        if (x > y) {
            for (int i = x; i >= y; i--) {
                System.out.println(i);
            }
        }
    }
}
