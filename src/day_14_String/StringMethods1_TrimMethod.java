package day_14_String;

public class StringMethods1_TrimMethod {

    public static void main(String[] args) {


        /*
        returns new string without including the white spaces!!! usually at the beginning and at the end
         */

        String str1 = "        batch         25        ";
        str1 = str1.trim();
        System.out.println(str1);


        String str = " ";
        str.trim();
        boolean A = str.isEmpty();
        System.out.println("str:" + str + "o");
        System.out.println(A);
    }
}
