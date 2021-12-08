package day_08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age>=18 && citizen == "USA";

        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("-------------------------------");

        String name2="Josh";
        int creditScore = 720;
        int age2 = 22;
        int income = 140000;
        boolean isEligible2= creditScore>=720 && age2>21 && income >= 60000;

        System.out.println(name2 + " is eligible for loan: " + isEligible2);



        System.out.println("-------------------------------");


        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3>=18 && (gender == 'M' || gender == 'F');

        System.out.println(name3 + " is eligible for service: " + isEligible3);


        System.out.println("-------------------------------");


        String name6= "James";

        String countryOfBirth = "USA";
        boolean marriedtoUSCitizen6 = false;

        boolean isEligible6 = countryOfBirth == "USA" || marriedtoUSCitizen6 == true;

        System.out.println(name6 + " is eligible for US citizenship: " + isEligible6);


        System.out.println("-------------------------------");


    }

}
