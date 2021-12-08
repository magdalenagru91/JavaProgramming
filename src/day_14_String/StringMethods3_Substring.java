package day_14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {

        String word = "Cydeo School";
        String brand = word.substring(0,4);     // ending index ALWAYS EXCLUDED
        System.out.println(brand);


        String word2 = "Java Programming Language";

        String s1 = word2.substring(0,word2.indexOf("a ")+1); //Java
        System.out.println(s1);
        String s2 = word2.substring(word2.indexOf("P"),word2.indexOf(" L")); //Programming
        System.out.println(s2);
        String s3 = word2.substring(word2.indexOf("L"));; //Language
        System.out.println(s3);


        String word3 = "Python C# Ruby";




    }
}
