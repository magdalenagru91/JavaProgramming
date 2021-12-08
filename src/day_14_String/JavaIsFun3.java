package day_14_String;

public class JavaIsFun3 {       //I think that SUBSTRING METHOD does not work with LASTINDEXOF!!!

    public static void main(String[] args) {

        String str1 = "Java is fun, Java is cool, I love Java";

        int s1 = str1.lastIndexOf("J");
        int s2 = str1.lastIndexOf(",");
        String portion2 = str1.substring(s1,s2);
        System.out.println(portion2);
    }
}
