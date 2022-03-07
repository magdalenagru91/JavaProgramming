package utilities;

public class MathUtility {
    /*
    2.1 Create a method that can return the sum of two integers
            2.2 Create a method that can return the sum of two decimal numbers

            2.3 Create a method that can return the subtraction of two integers
            2.4 Create a method that can return the subtraction of two decimals

            2.5 Creat a method that can return the multiplication of two integers
            2.6 Create a method that can return the multiplication of two decimals

            2.7 Create a method that passes two double parameters and return the division reslt

            2.8 Create a method that can check if an integer is even number
            2.9 Create a method that can check if an integer is odd number

            2.10 Create a method that can return the maximum number between two integers
            2.11 Create a method that can return the maximum number between two decimal numbers

            2.12 Create a method that can return the minimum number between two integers
            2.13 Create a method that can return the minimum number between two decimal numbers

            2.14 Create a method that can return the square of an integer
                    Ex: square(2) ==> 4
            2.15 Create a method that can return the square of a double

            2.16 Create a method that can return the cube of an integer
            2.17 Create a method that can return the cube of a double
     */

    /*
    2.1 Create a method that can return the sum of two integers
            2.2 Create a method that can return the sum of two decimal numbers
     */

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }


    //example: public static int sum(int number1, int number2, int number3) {return number1+number2+number3;}



    /*
    2.2 Create a method that can return the sum of two decimal numbers
     */

    public static double sum(double number1, double number2) {
        return number1 + number2;
    }



    /*
    2.3 Create a method that can return the subtraction of two integers
    */

    public static int substruct(int number1, int number2) {
        return number1 - number2;
    }

    /*
        2.4 Create a method that can return the subtraction of two decimals
     */
    public static double substruct(double number1, double number2) {
        return number1 - number2;
    }


    /*
    2.5 Creat a method that can return the multiplication of two integers
    */
    public static int multiplication(int number1, int number2) {
        return number1 - number2;
    }

    /*
    2.6 Create a method that can return the multiplication of two decimals
     */
    public static double multiplication(double number1, double number2) {
        return number1 - number2;
    }

    /*
    2.7 Create a method that passes two double parameters and return the division reslt
     */
    public static double division (double number1, double number2){
        return number1/number2;
    }



    /*
    2.8 Create a method that can check if an integer is even number
    */
    public static String evenNumber(int number) {
        String result = "";
        if (number % 2 == 0) {
            result=number + " is an even number";
        } else {
            result=number + " is not an even number";
        }
        return result;
    }


    /*
    2.9 Create a method that can check if an integer is odd number
     */
    public static String oddNumber(int number) {
        String result = "";
        if (number % 2 != 0) {
            result = number + " is an odd number";
        } else {
            result = number + " is not an odd number";
        }
        return result;
    }


     /*
    2.10 Create a method that can return the maximum number between two integers
    */
    public static int maxNumber(int number1, int number2) {
        int max = -2147483648;
        if (number1>number2){
            max=number1;
        } else {
            max=number2;
        }
        return max;
    }


    /*
    2.11 Create a method that can return the maximum number between two decimal numbers
    */

    public static double maxNumber (double number1, double number2) {
        double max = -2147483648;
        if (number1>number2){
            max=number1;
        } else {
            max=number2;
        }
        return max;
    }

    /*
     2.12 Create a method that can return the minimum number between two integers
     */
    public static int minNumber(int number1, int number2) {
        int min = 2147483647;
        if (number1<number2){
            min=number1;
        } else {
            min=number2;
        }
        return min;
    }

    /*
     2.13 Create a method that can return the minimum number between two decimal numbers
     */

    public static double minNumber(double number1, double number2) {
        double min = 2147483647;
        if (number1<number2){
            min=number1;
        } else {
            min=number2;
        }
        return min;
    }


    /*
     2.14 Create a method that can return the square of an integer
     Ex: square(2) ==> 4

     */


    public static int square(int number){
        return number*number;
    }

    /*
    2.15 Create a method that can return the square of a double
     */

    public static double square(double number){
        return number*number;
    }


    /*
    2.16 Create a method that can return the cube of an integer
    */
    public static int cube(int number){
        return number*number*number;
    }


    /*
    2.17 Create a method that can return the cube of a double
    */
    public static double cube(double number){
        return number*number*number;
    }






    }

