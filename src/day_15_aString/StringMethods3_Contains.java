package day_15_aString;

public class StringMethods3_Contains {

    public static void main(String[] args) {

        String sentence = "My favorite programming language is Java";
        System.out.println(sentence);

        System.out.println(sentence.contains("C#"));
        System.out.println(sentence.contains("Java"));

        System.out.println("-----------------------------------------");

        String sentence1 = "My favorite food is pizza";
        System.out.println(sentence1);

        boolean pizza = sentence1.contains("pizza");
        boolean kebab = sentence1.contains("kebab");

        System.out.println(pizza);
        System.out.println(kebab);


        System.out.println("-----------------------------------------");

        // to ignore CASE SENSITIVITY

        String sentence2 = "My favorite state is NH";
        System.out.println(sentence2);

        System.out.println(sentence2.toLowerCase().contains("nh"));         //lower case is ok

    }
}
