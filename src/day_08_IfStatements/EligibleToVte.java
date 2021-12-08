package day_08_IfStatements;

public class EligibleToVte {


    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age > 21 && citizen == "USA";


        if (isEligible) {

            System.out.println(name + " is eligible to vote");
        }

        if (!isEligible) {

            System.out.println(name + "is not eligible to vote");
        }
    }
}
