package day_17_DoWhileLoop;

public class BranchingStatements2_ContinueStatement {

    public static void main(String[] args) {

        for (char i ='A'; i<='E'; i++) {

            if (i == 'C') {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("'--------------------------------------------");
        //print all even numbers 1~10

        for (int i = 1; i<=10; i++) {
            if (i%2!=0) {
                continue;       //SKIPS!!!
            }
            System.out.println(i);
        }

        System.out.println("'--------------------------------------------");
        //print all odd numbers 1~10 (skip even)

        for (int i = 1; i<=10; i++) {
            if (i%2==0) {
                continue;       //SKIPS!!!
            }
            System.out.println(i);
        }


    }
}
