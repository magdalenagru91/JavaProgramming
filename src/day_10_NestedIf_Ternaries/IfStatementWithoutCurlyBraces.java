package day_10_NestedIf_Ternaries;

public class IfStatementWithoutCurlyBraces {

    public static void main(String[] args) {

        int number = 5;
        String result = " ";

    /* if there is only one statement like the example below-no curly braces:
    if (number == 1)
                result = ("January");

    if there are more statements - ALWAYS CURLY BRACES!
                if (number == 1)
                result = ("January");
                System.out.println("Hello");
     */

            if (number == 1)
                result = ("January");
             else if (number == 2)
                result = ("February");
             else if (number == 3)
                result = ("March");
             else if (number == 4)
                result = "April";
             else if (number == 5)
                result = "May";
             else if (number == 6)
                result = "June";
             else if (number == 7)
                result = "July";
             else if (number == 8)
                result = "August";
             else if (number == 9)
                result = "Spetember";
             else if (number == 10)
                result = "October";
             else if (number == 11)
                result = "November";
             else
                result = "December";


        System.out.println(result);

                  }

    }




