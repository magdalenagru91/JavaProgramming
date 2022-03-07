package ZZZ_F;

public class OddAndEven {
    /*
     1. Numbers - odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
     */


    public static void identify(int number){
        if (number%2==0){
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }

    }

    public static void main(String[] args) {
        identify(5);
        identify(66);
    }
}
