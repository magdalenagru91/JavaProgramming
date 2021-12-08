package day_08_IfStatements;

import java.util.IllegalFormatCodePointException;

public class GradeReport {
    public static void main(String[] args) {



    /*
    score:

    90-100 ==> Excellent
    80-89 ==> Great
    70-79 ==> Good
    60-69 ==> Passed
    0-59 ==> Failed
     */

        int score = 80;
        boolean a = score >= 90;
        boolean b = score >= 80 && score <= 89;             // boolean b = score >= 80 && !a;
        boolean c = score >= 70 && score <= 79;             // boolean c = score >= 70 && !a && !b;
        boolean d = score >= 60 && score <= 69;             // boolean d = score>=60 && !a && !b && !c;
        boolean e = score >= 0 && score <= 59;              // boolean e = !a && !b && !c && !d;


        if (a) {
            System.out.println(score + " A EXCELLENT");

        }

        if (b) {
            System.out.println(score + " B GREAT");

        }

        if (c) {
            System.out.println(score + " C GOOD");

        }

        if (d) {
            System.out.println(score + " D PASSED");

        }

        if (e) {
            System.out.println(score + " E FAILED");
        }
    }
}
