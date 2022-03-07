package day_41_Exceptions_Errors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {

    public static void main(String[] args) {


        System.out.println("-----------------------------------");

        System.out.println("Test3 started");


        try {
            System.out.println("Cydeo".substring(2, 0));     //unchecked exception

        } catch (RuntimeException a) {           //you can use RuntimeException instead of the particular one
                                                    // if you are not sure which one to use
            a.getMessage();
        }


        System.out.println("-----------------------------------");

        System.out.println("Hello");


        try {
            Thread.sleep(3000);   //checked exception; this code will be handled by try block
        } catch (InterruptedException e) {      //this gets executed if exception is caught during the run time
            e.printStackTrace();
        }
        System.out.println("Cydeo");




        System.out.println("-----------------------------------");

        try {
            FileInputStream file = new FileInputStream("File path");    //checked exception
        } catch (FileNotFoundException b) {
            b.printStackTrace();
        }
    }
}
