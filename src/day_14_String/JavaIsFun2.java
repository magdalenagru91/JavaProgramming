package day_14_String;

public class JavaIsFun2 {

    public static void main(String[] args) {
        String str1 = "Java is fun, Java is cool, I love Java";

        String portion1 = str1.substring(0,10+1);


        int s1 = str1.indexOf(" J")+1;
        int s2 = str1.lastIndexOf(",");
        String portion2 = str1.substring(s1,s2);


        String portion3 = str1.substring(str1.lastIndexOf("I"));

        /*
        String str1 = "Java is fun, Java is cool, I love Java";
        //             0123456789
        //
        String s1 = str1.substring(0, 10+1) ;  // Java is fun

        int beg = str1.indexOf(" J") + 1;
        int end = str1.lastIndexOf(",");

        String s2 = str1.substring(beg, end );  //Java is cool


        String s3 = str1.substring(  str1.lastIndexOf("I")  );

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
         */

        System.out.println(portion1);
        System.out.println(portion2);
        System.out.println(portion3);
    }
}
