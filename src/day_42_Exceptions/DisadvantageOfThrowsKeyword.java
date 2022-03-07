package day_42_Exceptions;

public class DisadvantageOfThrowsKeyword {

    /*
    advantage - quick - less code, if you dont call this method ever again it is a good solution
    disadvantage - if you need to call this method again; when you call the method that contains
    THROWS keyword in a different class - it doesnt work any more
     */


        //THIS WILL NOT WORK:
        public static void main(String[] args) {

        System.out.println("Hello");

        // sleep(2.5);

        System.out.println("Hello world");




        System.out.println("------------------------------------------");

        //THIS WILL WORK
        System.out.println("Hello");

        MorningWorkOut2.sleep(2.5);

        System.out.println("Hello world");
    }



    public static void sleep(double seconds) throws InterruptedException {

        Thread.sleep((long) (seconds*1000));
    }

}
