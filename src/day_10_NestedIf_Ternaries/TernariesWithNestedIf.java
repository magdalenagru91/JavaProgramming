package day_10_NestedIf_Ternaries;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

        int score = 85;

        /*

        if (score >= 0 && score <= 100) {       //if score is valid

            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {                                //if score is not valid
            System.out.println("Score not valid.");
        }

        */

        String result = (score >= 0 && score <= 100)? (score >= 60)? "Passed" : "Failed" : "Score not valid.";
        System.out.println(result);
    }
}
