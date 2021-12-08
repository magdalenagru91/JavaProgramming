package day_14_String;

public class StringMethods1_IndexOf {         //finds the number of your character from the LEFT

    public static void main(String[] args) {

        String str1 = "Cydeo School";
        int n1 = str1.indexOf("h");

        int n2 = str1.indexOf("ool");

        System.out.println(n1);
        System.out.println(n2);


        String str3 = "Java Programming language";
        int n3 = str3.indexOf("am");
        System.out.println(n3);

        int n4 = str3.indexOf("gu");
        System.out.println(n4);


    }
}
