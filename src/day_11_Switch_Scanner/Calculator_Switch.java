package day_11_Switch_Scanner;

public class Calculator_Switch {

    public static void main(String[] args) {

        double n1 = 200,
                n2 = 10;

        char operator = '&';

        double result = 0;

        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';

        if (valid) {

            switch (operator) {

                case '+':
                    result = (n1 + n2);
                    break;

                case '-':
                    result = (n1-n2);
                    break;

                case '*':
                    result = (n1 * n2);
                    break;

                default:
                    result = (n1 / n2);


            }

        } else {
            System.err.println("Invalid operator: " + operator);                // ERROR PRINT OUT "SERR"
        }
        System.out.println(result);
    }
}
