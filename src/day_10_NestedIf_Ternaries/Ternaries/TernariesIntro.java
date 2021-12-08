package day_10_NestedIf_Ternaries.Ternaries;

public class TernariesIntro {

    public static void main(String[] args) {

        int n =101;

        if (n%2==0) {
            System.out.println("Even number");
        }else  {
            System.out.println("Odd number");
        }


        System.out.println("-----------------------------------");

        String result1 = (n%2==0)? "Even" : "Odd";
        System.out.println(result1);



        System.out.println("-----------------------------------");

        int age = 20;

        /*

        if(age>= 21) {
            System.out.println("Eligible"); //String
        } else {
            System.out.println("Not eligible"); //String
        }
        */


        String eligible = (age>=21)? "Eligible1":"Not eligible1";
        System.out.println(eligible);
    }
}
