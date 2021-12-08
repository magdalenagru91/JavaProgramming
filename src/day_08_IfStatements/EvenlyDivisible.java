package day_08_IfStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number =100;

        boolean divisibleByTwo = number%2==0;
        boolean divisibleByThree = number%3==0;
        boolean divisibleByFive = number%5==0;

        System.out.println(number + " is divisible by 2: " + divisibleByTwo);
        System.out.println(number + " is divisible by 3: " + divisibleByThree);
        System.out.println(number + " is divisible by 5: " + divisibleByFive);
    }
}
