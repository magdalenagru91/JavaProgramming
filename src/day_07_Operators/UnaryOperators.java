package day_07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println(num1 < 0);  //false
        System.out.println(num2 < 0);  //true


        int a = 5;
        ++a; //pre increment: increases the value by 1 right away


        System.out.println(a);

        --a; //pre decrement: decreases the va;ue by 1 right away

        System.out.println(a);

        System.out.println("---------------------------------");

        int b = 100;
        System.out.println(++b); //pre increment: increases the value by 1 right away

        int c = 100;

        System.out.println(c++); //post increment: will first show you the current value
        // and later when you print it again it is increased, in the next step, look below:
        System.out.println(c);


        int x = 200;

        System.out.println(--x); //pre increment: increases the value by 1 right away


        int y = 200;

        System.out.println(y--); //post increment: will first show you the current value
        // and later when you print it again it is increased, in the next step, look below:

        System.out.println(y);
        System.out.println(y);


        System.out.println("---------------------------------");

        int z = 45;
        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z);


        System.out.println("---------------------------------");

        int q = 30;

        System.out.println(--q); //pre decrement
        System.out.println(q--);
        System.out.println(q);


        System.out.println("---------------------------------");

        int r = 10;

        System.out.println(r++);

        System.out.println(r);


    }
}
