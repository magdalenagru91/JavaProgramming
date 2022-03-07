package day_42_Exceptions;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws ArithmeticException{

        //there is no need for THROWS keyword here cause compiler does not show you,
        //anytime you have unchecked exception - dont use THROWS

        System.out.println("Test started");

        System.out.println(8/0);

        System.out.println("Test completed");
    }
}
