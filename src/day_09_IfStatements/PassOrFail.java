package day_09_IfStatements;

public class PassOrFail {

    public static void main(String[] args) {

        int score1 = 60;

        if(score1 >= 90 && score1 <= 100) {
            System.out.println("Excellent");
        }else if(score1 >= 80 && score1 <= 89){
            System.out.println("Great");
        }else if(score1 >= 70 && score1 <= 79) {
            System.out.println("Good");
        }else if(score1 >= 60 && score1 <= 69) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

            System.out.println("_____________________________");

            int score2 = 90;
            char grade;

            if(score2 >= 90 && score2 <= 100) {
                grade = 'A';
            }else if(score2 >= 80 && score2 <= 89){
                grade = 'B';
            }else if(score2 >= 70 && score2 <= 79) {
                grade = 'C';
            }else if(score2 >= 60 && score2 <= 69) {
                grade = 'D';
            } else {
                grade = 'E';}
            System.out.println("grade = " + grade);


        }

    }


