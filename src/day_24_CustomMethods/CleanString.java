package day_24_CustomMethods;
import java.util.Scanner;
import java.util.Arrays;

public class CleanString {
    /*
    This method accept two strings (text and badWord) and returns a string.

The method will take out all the occurrences of badWord in the text.

Example:

clean ("one two three","two")

returns "one three"
clean ("one two three","two")

returns "one three"
clean ("foo bar","foo")

returns "bar"
clean ("foo bar","foo")

returns "bar"
clean ("he said bla bla bla","bla")

returns "he said
     */


        public static String clean (String text , String badWord) {

            return text.replace(" " + badWord, "");

        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(clean("he said", "he"));
        }

    }


