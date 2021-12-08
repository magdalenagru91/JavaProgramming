package day_10_NestedIf_Ternaries;

public class TernariesWithNested_Grades {

    public static void main(String[] args) {

        int score = 40;


        if (score>=0 && score<=100) {


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
        }else  {
            System.out.println("Invalid score");
        }



        System.out.println("-------------------------------------");



        String result = (score>=0 && score<=100)? (score >= 90)? "Excellent" : (score>= 80)? "Great" : (score >= 70)?
                "Good" : (score >= 60)? "Passed" : "Failed" : "Invalid score";

        System.out.println(result);




    }
}

