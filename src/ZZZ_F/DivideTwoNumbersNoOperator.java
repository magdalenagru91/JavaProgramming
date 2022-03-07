package ZZZ_F;

public class DivideTwoNumbersNoOperator {

    public static void divisor(int a, int b){
        int count = 0;

        while (a>=b){
            a-=b;
            count++;
        }
        System.out.println("Result of division is: " + count + " with a reminder: " + a);
    }

    public static void main(String[] args) {
        divisor(2,4);
    }
}
