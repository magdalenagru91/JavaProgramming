package day_09_IfStatements;

public class LeapYear2 {

    public static void main(String[] args) {

        int year = 2001;
        boolean leapYear = year%4==0;

        if (leapYear) {
            System.out.println("Year " + year + " is a leap year.");
        } else  {
            System.out.println("Year " + year + " is not a leap year.");
        }
    }
}
