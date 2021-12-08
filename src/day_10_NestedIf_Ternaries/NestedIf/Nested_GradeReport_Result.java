package day_10_NestedIf_Ternaries.NestedIf;

public class Nested_GradeReport_Result {

    public static void main(String[] args) {

        /*
        90~100: excellent
        80~89: great
        70~79: good
        60~69: passed
        0~59: failed
         */

        int grade = 95;

        String result = " "; //temporary

        if (grade>=0 && grade<=100) {
            if (grade>=90) {
                result=("excellent");
            }else if (grade>=80) {
               result=("great");
            }else if (grade>=70) {
                result=("good");
            }else if (grade>=60) {
                result=("passed");
            }else {
                result=("failed");
            }

        }else {
            result=("Invalid score.");
        }

        System.out.println(result);

    }
}
