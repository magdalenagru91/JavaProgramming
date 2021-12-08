package day_11_Switch_Scanner.BreakfastPractice;

public class ConvertNumbers0_9_toWords_Ternary {


    public static void main(String[] args) {

        /*
        Write a program that can convert numbers 0~9 to words.

    NOTE: MUST use ternary
         */


        int num = 8;

        String result = (num >= 0 && num <= 9) ?
                (num==0)? "zero" :(num == 1) ? "one" : (num == 2) ? "two" : (num == 3) ? "three" : (num == 4) ? "four"
                        : (num == 5) ? "five" : (num == 6) ? "six" : (num == 7) ? "seven"
                        : (num == 8) ? "eight" : "nine"
                : "Invalid number";

        System.out.println(result);


    }
}
