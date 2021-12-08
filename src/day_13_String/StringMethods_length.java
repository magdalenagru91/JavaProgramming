package day_13_String;

public class StringMethods_length {

    public static void main(String[] args) {

        String s1 = "Batch 25 is the best batch oh yeah";

        int totalCharacters = s1.length();
        System.out.println("Total number of characters: " + totalCharacters);

        char lastChar = s1.charAt(totalCharacters-1);   //same as s1.charAt(s1.length()-1);
        System.out.println("Last character is " + lastChar);
    }
}
