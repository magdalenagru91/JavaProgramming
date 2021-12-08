package day_12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your programming language: ");
        String programmingLanguage = input.nextLine();

        System.out.println("Enter your age = " );
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();


        System.out.println("full name: " + fullName);
        System.out.println("programmin: " + programmingLanguage);
        System.out.println("age: "+ age);
        System.out.println("school: " + schoolName);


        input.close();


}

}
