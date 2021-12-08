package day_17_DoWhileLoop;

public class OddAndEvenNumbers {
    public static void main(String[] args) {

        System.out.println("'--------------------------------------------");
        //print all even numbers 1~10

        for (int i = 1; i<=10; i++) {
            if (i%2!=0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("'--------------------------------------------");
        //print all odd numbers 1~10 (skip even)

        for (int i = 1; i<=10; i++) {
            if (i%2==0) {
                continue;
            }
            System.out.println(i);
        }


    }
    }

