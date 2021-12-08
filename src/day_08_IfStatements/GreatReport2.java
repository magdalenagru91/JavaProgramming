package day_08_IfStatements;

public class GreatReport2 {

    public static void main(String[] args) {

        int score = 71;


        if (score >= 90) {
            System.out.println("Excellent");
        }
        if (score >= 80 && score < 90) {
            System.out.println("Great");
        }
        if (score >= 70 && score < 80) {
            System.out.println("Good");
        }
        if (score >= 60 && score < 70) {
            System.out.println("Passed");
        }
        if (score <= 59) {
            System.out.println("Failed");
        }
    }
}