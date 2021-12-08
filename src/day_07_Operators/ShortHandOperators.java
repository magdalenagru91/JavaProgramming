package day_07_Operators;

public class ShortHandOperators {


    public static void main(String[] args) {

        int x= 100;

        System.out.println(x);

        // x = x + 200;

        x += 300;

        System.out.println(x);

        double num1 = 2.5;

        num1 += 5.5;

        System.out.println(num1);


        double availableBalance = 1000.50;

        //deposit 300$

        availableBalance +=300;

        System.out.println(availableBalance);





        System.out.println("-------------------------------------");

        availableBalance -= 500;
        System.out.println(availableBalance);




        System.out.println("-------------------------------------");

        double salary = 50000.50;

        System.out.println("salary= " + salary);

        salary *= 2;

        System.out.println(salary);




        System.out.println("-------------------------------------");

        double num3 = 100;

        //%

        num3 %= 3;

        System.out.println("num3 = " + num3);





        System.out.println("-------------------------------------");


        int amount = 333; //cents

        int quarters = amount/25;


        int dollar = amount/100;

        int cents = amount%100;

        System.out.println(dollar + " and "+ cents);




        System.out.println("-------------------------------------");

        int y = 300;

        y%=16;

        System.out.println(y);



        System.out.println("-------------------------------------");

        int balance = 3500;

        //insurance fee - $153

        int month = balance/12;

        balance %=153;

        System.out.println("monthly: " + month + " leftover: " + balance);


        System.out.println("----------------------------------");


        int p = 5;

        int g = p++;


        System.out.println(p);
        System.out.println(g);






    }
}
