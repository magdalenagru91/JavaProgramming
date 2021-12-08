package day_09_IfStatements;

public class MaxNumber {

    public static void main(String[] args) {


        int num1 = 300;
        int num2 = 200;

        boolean num1isMax = num1>num2;

        if (num1isMax) {
            System.out.println(num1 + " is the maximum number, it is bigger than " + num2);
        } else {
            System.out.println(num2 + " is the maximum number, it is bigger than " + num1);
        }



    }
}