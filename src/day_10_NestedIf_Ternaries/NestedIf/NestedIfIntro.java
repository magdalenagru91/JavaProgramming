package day_10_NestedIf_Ternaries.NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 60;

        if (score >= 0 && score <= 100) {       //if score is valid

            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {                                //if score is not valid
            System.out.println("Score not valid.");
        }
    }
}
