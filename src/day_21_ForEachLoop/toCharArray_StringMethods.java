package day_21_ForEachLoop;

public class toCharArray_StringMethods {

    public static void main(String[] args) {

        /*
        access to every single char
         */

        String str = "Java";

        for (char each : str.toCharArray()){
            System.out.println(each);
        }


        System.out.println("----------------------------");

        String str2 = "Cydeo";
        char[] chars = str.toCharArray();

        System.out.println(chars);

        for (char each2 : chars) {
            System.out.println(each2);

        }
    }
}
