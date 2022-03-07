
package day_41_Exceptions_Errors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBloc_Muhtar {

    public static void main(String[] args) {

        System.out.println("Test1 started");

        try {

            System.out.println(9 / 0);

            System.out.println("Try Block");

        } catch (ArithmeticException e) {

            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occurred");

        }


        System.out.println("Test1 Completed");

        System.out.println("------------------------------");

        System.out.println("Test2 started");

        int[] numbers = {1, 2, 3, 4, 5};

        try {

            System.out.println(numbers[200]);

            System.out.println("Try Block");

        } catch (RuntimeException e) {

            //e.getMessage();

            System.out.println( e.getMessage() );

        }


        System.out.println("Test2 Completed");

        System.out.println("--------------------------------------------------");

        System.out.println("Test3 started");


        try {
            System.out.println("Cydeo".substring(2, 0));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        System.out.println("Test3 started");


        System.out.println("--------------------------------------------------");


        System.out.println("Hello");


        try {
            Thread.sleep(3000);
            System.out.println("Try block");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Catch block");
        }


        System.out.println("Cydeo");


        System.out.println("------------------------------------------");

        try {
            FileInputStream file = new FileInputStream("File path");
            System.out.println("Try block");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Catch block");
        }



    }
}
