package day_15_aString;

public class ReplaceXx {

    public static void main(String[] args) {

        /*
        Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
         */

        String str = "xcodeX";


        String  word = str.replace("x","a").replace("X","a");

        System.out.println(word);

    }
}
