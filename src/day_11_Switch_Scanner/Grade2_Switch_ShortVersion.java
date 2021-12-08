package day_11_Switch_Scanner;

public class Grade2_Switch_ShortVersion {

    public static void main(String[] args) {

        /*
        if the grade is A or B or C or D => "PASSED"
        if not => failed
         */

        char grade ='g';
        String result = " ";

        switch (grade) {

            case 'A': case 'B' : case 'C' : case 'D' :
                result=("PASSED!");
                break;

            case 'F':
                result=("FAILED!");
                break;

            default:
                result=("failed");


        } System.out.println(result);
    }
}
