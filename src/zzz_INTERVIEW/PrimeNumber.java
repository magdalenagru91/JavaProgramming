package zzz_INTERVIEW;

public class PrimeNumber {

    public static void main(String[] args) {

        int num = 7;
        boolean prime = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                prime = true;
                break;
            }
        }

        if (!prime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
    }



