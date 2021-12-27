package day_27_WrapperClasses;

import java.util.Locale;

public class DigitLetter {

    /*
    Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
     */

    public static void main(String[] args) {

        String str = "Wooden Spoon!";

        String letters = "";
        int digits = 0;
        String special = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)<='Z' && str.charAt(i)>='A'){
                letters+=str.charAt(i);
            } else if (str.charAt(i) <= 'z' && str.charAt(i) >='a'){
                letters+=str.charAt(i);
            } else if (str.charAt(i) >= 0 && str.charAt(i) <= 9){
                digits+=str.charAt(i);
            } else {
                special+=str.charAt(i);
            }
        }

        System.out.println("letters: " + letters);
        System.out.println("digits: " + digits);
        System.out.println("special: " + special);

    }
}
