package practice;

public class QUIZ2 {

    public static void main(String[] args) {

        System.out.println("---------------1-------------");
        int score=0;

        if (score ==0) {
            score += 50;
        }
        if (score !=0) {
            score += 50;
        }
        System.out.println(score);



        System.out.println("---------------1-------------");

        int Q = 10;
        int Y = 10;
        int O = Q++;

        System.out.println(Y++ + " " + Q++ + " " +  O + " " + Y);

        //10 11 10 11

        System.out.println("---------------1-------------");

        int E = 10;
        int T = E++;

        System.out.println(T++ + " " + E + " " + T);

        //10 11 11


        System.out.println("---------------1-------------");

        int u = 9;

        if (u++ == 10) {
            System.out.println("Hello world" + u);
        }else {
            System.out.println("Hello Universe " + u);
        }









        System.out.println("---------------2-------------");

        int x = 1;
        int y = 0;

        if (x++ > ++y) {
            System.out.print("Hello ");
        } else {
            System.out.print("Welcome");
        }
        System.out.println(" Log " + x + " : " + y);

        // Welcome Log 2 : 1



        System.out.println("---------------3--------------");

        int num1=9;
        if(++num1<10) {
            System.out.println(num1+"Hello World!");
        } else {
            System.out.println(num1+"Hello Universe!");
        }

        // 10Hello Universe!



        System.out.println("---------------4--------------");

        boolean resultA=9>=9 || 10<=10,
                resultB = 'A' >= 128 && 'B' < 128;

        if (resultA) {
            if (resultB) {
                System.out.println(resultA);
            } else {
                System.out.println(resultB);
            }
        }

        //false



        System.out.println("---------------5--------------");

        boolean X = true;

        if (X==false) {
            System.out.println("One");
        } else if (X == false !=true) {
            System.out.println("Two");
        } else if (X==true) {
            System.out.println("Three");
        } else if (X == !false) {
            System.out.println("Four");
        }

        //Two



        System.out.println("---------------6--------------");

        int n1 = 'B';

        if (n1>128 || n1<=129) {
            System.out.println('B');
        } else {
            System.out.println('A');
        }




        System.out.println("---------------7---------------");

        System.out.println("Which code fragment causes a compilation error?");

        float flt = 100f;

        float flt2 = 100;

        double y1 = 200;
        float flt3 = (float)y1;    //this one

        int y2 = 100;
        float flt4 = y2;



        System.out.println("---------------8--------------");

        System.out.println("In Multi-branch statement, we can have as many if blocks as we want. - false");

        

        System.out.println("---------------9-------------");

        System.out.println("In Multi-branch statement, we can have as many else blocks as we want. - false");


        System.out.println("---------------------------------------------------------");
        float f =1.2f;




        System.out.println("----------------------------");

        String[][] listing = new String[][] {{"book","elo"},{"book"}};
        System.out.println(listing.length);
        System.out.println((listing[0].length));

    }
}
