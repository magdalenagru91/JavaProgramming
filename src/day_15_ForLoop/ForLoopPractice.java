package day_15_ForLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

        //display numbers 15 to 45

        for (int i = 15; i <= 45; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Hello");


        System.out.println("------------------------------");

        for (int i = 100; i >= 50; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n------------------------------lllll");

        for (int a = 1; a <= 55; a++) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        }

        System.out.println("\n------------------------------");

        for (int a = 2; a <= 54; a+=2) {

                System.out.print(a + " ");
             }

        System.out.println("\n------------------------------");


    }
}
