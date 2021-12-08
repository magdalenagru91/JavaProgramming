package day_11_Switch_Scanner;

public class NumberOfDays_Switch {


        /*
        28 Days: 2
        30 Days: 4,6,9,11
        31 days: 1,3,5,7,8,10
         */
    public static void main(String[] args) {
        int days=2;
        int year = 200;
        String result = " ";


        if (days>=1 && days<=12) {

            switch (days) {

                case 2:
                    if (year%4==0) {            // OR TERNARY: result = (year%4==0)? "29 days" : "28 days""; break;
                        result=("29 days");
                    } else {
                        result = ("28 days");
                    }
                    break;

                case 4: case 6: case 9: case 11:
                    result=("30 days");
                    break;

                default:
                    result = ("31 days");
            }
            System.out.println(result);

        }else {
            result="Invalid";
        }

    }
}
