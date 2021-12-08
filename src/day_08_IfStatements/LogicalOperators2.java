package day_08_IfStatements;

public class LogicalOperators2 {

    public static void main(String[] args) {

        String name = "James";

        String countryOfBirth = "USA";
        boolean marriedtoUSCitizen = false;

        boolean isEligible = countryOfBirth == "USA" || marriedtoUSCitizen == true;

        System.out.println(name + " is eligible for US citizenship: " + isEligible);



        System.out.println("-------------------------------");

        String name1 = "Brianna";

        double gpa = 2.5;
        int familiIncome = 40000;

        boolean isEligible1 = gpa >= 3.5 || familiIncome <= 60000;

        System.out.println(name1 + " is eligible for scholarship: " + isEligible1);



        System.out.println("-------------------------------");

        boolean result2 = true;

        System.out.println(result2);

        boolean result3 = !result2;

        System.out.println(result3);



        System.out.println("-------------------------------");

        int score = 50;
        boolean passed = score>= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);




    }
}
