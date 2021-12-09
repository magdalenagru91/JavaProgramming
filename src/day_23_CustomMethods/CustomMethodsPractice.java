package day_23_CustomMethods;

public class CustomMethodsPractice {

    public static void main(String[] args) {
        System.out.println("Test start 1:");
        helloWorld5Times();
        System.out.println("Test finished");


        System.out.println("\nTest start 2:");
        helloCydeo5Times();
        System.out.println("Test finished");


        System.out.println("\nTest start 3:");
        EvenNumbers1to10();
        System.out.println("Test finished");
    }

    //create a function that can print hello 5 times ==> helloWorld5Times()

    public static void helloWorld5Times() {

        String word = "Hello World";

        for (int i = 0; i < 5; i++) {
            System.out.println(word);

        }
    }


    //create a function that can print hello Cydeo 5 times ==> helloCydeo5Times()
    public static void helloCydeo5Times() {

        String word2 = "Hello Cydeo!";
        for (int i = 0; i < 5; i++) {
            System.out.println(word2);

        }
    }


    //create a function that can print all even numbers from 1~10 ==> evenNumbers1to10

    public static void EvenNumbers1to10() {


       for (int i = 2; i < 11; i=i+2) {
           System.out.println(i);

        }
/*
        for (int i = 1; i < 11; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
        */


        }
    }


