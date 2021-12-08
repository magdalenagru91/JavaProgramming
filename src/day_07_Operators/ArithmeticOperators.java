package day_07_Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 3;

        int division = num1/num2;
        int reminder = num1%num2;

        System.out.println(num1/num2);  //10 divided by 3 here is 3
        System.out.println(num1%num2);  //10 divided by 3 reminder is 1

        System.out.println(num1 + " divided by " + num2 + " is equal to " + division + " with a reminder of " + reminder );


        System.out.println("-----------------------------");

        int gram = 4;

        int FinalGram = gram%20;
        System.out.println(FinalGram);

    }


}
