package day_15_ForLoop;

public class ForLoopPractice2 {

    public static void main(String[] args) {

        for (char i ='a'; i<='z'; i++) {
            System.out.print(i + " ");
        }


        System.out.print("\n------------------------------\n");

        for (char i ='z'; i>='a';i--){
            System.out.print(i + " ");
        }


        System.out.print("\n------------------------------\n");

        for (char i = 'A'; i<='Z'; i++) {
            System.out.print(i + " ");
        }


        System.out.print("\n------------------------------\n");

        for (int i = 65; i<=90; i++) {
            System.out.print((char)i+" ");
        }
    }
}
