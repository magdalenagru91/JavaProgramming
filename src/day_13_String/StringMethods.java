package day_13_String;

public class StringMethods {

    public static void main(String[] args) {


        System.out.println("-----------------------------------charAt");


        String word = "Cydeo";

        char thirdChar = word.charAt(2);

        System.out.println("Third char: " + thirdChar);



        System.out.println("-----------------------------------length -- last char");

        String s1 = "Batch 25 is the best batch oh yeah";

        int totalCharacters = s1.length();
        System.out.println("Total number of characters: " + totalCharacters);

        char lastChar = s1.charAt(totalCharacters-1);   //same as s1.charAt(s1.length()-1);
        System.out.println("Last character is " + lastChar);


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



        String y1 = "abc";
        String y2 = new String("abc");
        System.out.println(y1.equals(y2));                  //true
        System.out.println("y1==y2 is:"+ y1.equals(y2));    //true      //jak jest " " - cos tam w "==" i nie ma equals po - false,patrz w1 w2 na dole


        String p1 = "Java";
        String p2 = new String("Java");
        System.out.println(p1.equals(p2));      //true
        System.out.println(p1==p2);             //false


        String w1 = "abc";
        String w2 = "abc";
        System.out.println("w1==w2 is:"+ w1.equals(w2));        //true
        System.out.println("w1==w2 is:"+ w1==w2);               //false
        System.out.println(w1==w2);                             //true


    }
}
