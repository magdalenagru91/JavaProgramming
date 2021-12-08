package day_13_String;

public class StringMethods1_lowerCase_upperCase {

    public static void main(String[] args) {


        System.out.println("-----------------------------------to lower case -- to upper case");

        String str = "wooden spoon";        // it is immutable, not changable, you can only store 1 data in 1 variable
        str = str.toUpperCase();            //it will create a new string object "WOODEN SPOON"

        System.out.println(str);


        String s = "JAVA";
        s = s.toLowerCase();

        System.out.println(s);


        //Today is a great day to learn java programmin language.
        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();

        System.out.println(sentence);
    }
}
