package day_18_NestedLoop;

public class Square {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("*********************");

        }

        System.out.println("------------------------------------");

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
