package day_17_DoWhileLoop;

public class LoopPractices {

    public static void main(String[] args) {

        for (int i = 1; i <=10; i++) {
            System.out.print(i);
        }



        System.out.println("\n----------------------------");
        int j = 1;
        while (j<=10) {
            System.out.print(j);
            j++;
        }



        System.out.println("\n----------------------------");

        int k = 1;
        System.out.print(k);
        do {
           k++;
            System.out.print(k);
        } while (k<10);

    }
}
