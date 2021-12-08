package day_04_Variables;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        // hourly rate, weekly hours

        System.out.println("Enter your hourly rate:");
        Scanner input = new Scanner(System.in);
        int hourlyRate = input.nextInt();

        int weeklyHours = 40;

        int salary = hourlyRate*weeklyHours*52;
        System.out.println("Your yearly salary is: " + salary);
        System.out.println("Your schedule is: " + weeklyHours + " hours a week.");

    }
}
