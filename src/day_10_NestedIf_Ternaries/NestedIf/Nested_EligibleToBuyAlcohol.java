package day_10_NestedIf_Ternaries.NestedIf;

public class Nested_EligibleToBuyAlcohol {

    public static void main(String[] args) {

        int age = 21;
        boolean hasId = true;

        if (hasId) {

            if (age >= 21) {
                System.out.println("Eligible to buy alcohol.");
            } else {
                System.out.println("Not eligible to buy alcohol.");
            }
        } else {
            System.out.println("Does not have ID - no alcohol!");
        }
    }
}
