package day_14_String;

public class StringMethods2_Replace {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java","Python"); //new string object "Python is fun, I love learning Python"

        System.out.println(str);
        System.out.println(str2);

        String email = "JohnSmith@yahoo.com";
        String email2 = email.replace("yahoo","gmail");

        System.out.println(email);
        System.out.println(email2);

        String sentence = "Java Java Python Python C# C# C++ C ++ Python Python Python Python";
        String replacePython = sentence.replace("Python","");
        String replaceSpace = replacePython.replace("   "," ");

        System.out.println(replaceSpace);


        String s2 = "C# is fun, C# is cool";
        String replaceC1 = s2.replaceFirst("C#", "Java");       //replace first word

        System.out.println(replaceC1);



        String ta ="A";
        ta = ta.concat("B");
        String tb = "C";
        ta = ta +tb;
        ta.replace('C','D');
        ta = ta +tb;
        System.out.println(ta);
    }
}
