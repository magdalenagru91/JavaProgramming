package day_09_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int  n = -5;

        if (n>0) {
            System.out.println("Positive number");
        } else if (n<0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }
    }
}
