package day_10_NestedIf_Ternaries.NestedIf;

public class Nested_Days {

    public static void main(String[] args) {

        int number = 8;

        if (number>=0 && number<=7) {
            if (number==1) {
                System.out.println("Monday");
            }else if (number==2) {
                System.out.println("Tuesday");
            }else if (number==3) {
                System.out.println("Wednesday");
            }else if (number==4) {
                System.out.println("Thursday");
            }else if (number==5) {
                System.out.println("Friday");
            }else if (number==6) {
                System.out.println("Saturday");
            }else {
                System.out.println("Sunday");
            }
        }else {
            System.out.println("Invalid number.");
        }
    }
}
