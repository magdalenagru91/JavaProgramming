package day_17_ForLopp_While;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator:");
        char ch = scan.next().charAt(0);

        while (!(ch=='+' || ch == '-')) {   //   if the operator is invalid
            System.err.println("Invalid operator, please reenter");      //     by adding .err. prints out in read - easier to see
            ch = scan.next().charAt(0);
        }

        System.out.println((ch == '+')? num1+num2 : num1-num2);
scan.close();
    }
}
