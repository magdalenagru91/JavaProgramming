package day_24_CustomMethods.Breakfast;

public class HowManyDaysInMonth {

    /*
    Create a method that can print how many days a month has

    Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
     */

    public static void main(String[] args) {
        DaysInMonth(1);
    }

    public static void DaysInMonth(int number) {
        String name = "";
        if (number >= 1 && number <= 12) {
            if (number == 4 || number == 6 || number == 9 || number == 11) {
                System.out.println("This month has 30");
            } else if (number == 2) {
                System.out.println("This month has 28 days");
            } else {
                System.out.println("This month has 31 days");
            }
        } else {
            System.out.println("Invalid number");
        }
    }
}