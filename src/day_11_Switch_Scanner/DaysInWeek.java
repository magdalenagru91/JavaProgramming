package day_11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 9;

        /*
          if (number == 1) {
            System.out.println("Monday");
        }
         */

        switch (number) { //1,2,3,4,5,6,7/==    switch statement is not designed for CONDITIONAL STATEMENTS, NO BOOLEAN!!!
            case 1:
                System.out.println("Monday");
                break;          //exits the switch after executing the case block

            case 2:
                System.out.println("Tuesday");
                break;          //exits the switch after executing the case block

            case 3:
                System.out.println("Wednesday");
                break;          //exits the switch after executing the case block

            case 4:
                System.out.println("Thursday");
                break;          //exits the switch after executing the case block

            case 5:
                System.out.println("Friday");
                break;         //exits the switch after executing the case block

            case 6:
                System.out.println("Saturday");
                break;          //exits the switch after executing the case block

            case 7:
                System.out.println("Sunday");
                break;          //exits the switch after executing the case block

            default:            //only gets executed if none of the case blocks are matching
                System.out.println("invalid");
                break;          // not mandatory to enter BREAK at the end cause you have curly braces to close it at the end!!!
        }
    }
}
