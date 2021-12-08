package day_10_NestedIf_Ternaries.Ternaries;

public class TernariesIntroMultipleBranches {

    public static void main(String[] args) {




            /*
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("zero");
        }
        */

        int number = -100;

       String value = (number>0)? "Positive" : (number<0)? "Negative" : "zero";
        System.out.println(value);
    }
}