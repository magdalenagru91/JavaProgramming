package day_15_aString;

public class StringMethods3_equalsIgnoreCase {

    public static void main(String[] args) {

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));           //false - case sensitive

        System.out.println(s1.equalsIgnoreCase(s2)); //true - EQUALSIGNORECASE!!!

    }
}
