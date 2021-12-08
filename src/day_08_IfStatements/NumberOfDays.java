package day_08_IfStatements;

public class NumberOfDays {

   /*
Create a class called NumberOfDays, Write a program that can print the number of days in a month

            Ex:
                number = 1;

            output:
                31 Days

            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
 */


    public static void main(String[] args) {
        int number = 1;

        if (number==1 || number==3 || number==5 || number==7 || number==8 || number==10 || number==12) {
            System.out.println("Number of days in this month is 31");
        }

        if (number == 4 || number==6 || number==9 || number==10) {
            System.out.println("Number of days in this month is 30");
        }

        if (number == 2) {
            System.out.println("Number of days in this month is 28");
        }

    }
}
