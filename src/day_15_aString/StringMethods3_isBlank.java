package day_15_aString;

public class StringMethods3_isBlank {

    public static void main(String[] args) {

        String str = " ";

        boolean r1 = str.isBlank();             //it will return TRUE cause it has blank

        System.out.println(r1);

        String str2 = "Cydeo      ";
        System.out.println(str2.isBlank());     //FALSE it is not blank totally

    }
}
