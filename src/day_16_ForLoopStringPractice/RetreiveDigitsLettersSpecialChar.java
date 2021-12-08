package day_16_ForLoopStringPractice;

public class RetreiveDigitsLettersSpecialChar {

    public static void main(String[] args) {
        /*
        write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
         */

        String str = "Cydeo12345School! @#$%WoodenSpoon";

        String digits = "";
        String letters = "";
        String specialCharacters = "";

        for (int i = 0; i < str.length(); i++) {        //i: index numbers of str (0~last index)

            char ch = str.charAt(i);        // ch: each character that we have in str

            if (ch >= '0' && ch <= '9') {   //if the character is between 0 and 9
                digits += ch;
            } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {  //if the character is between a to z or A to Z
                letters += ch;
            } else {                        //if the character is neither digit not letter, so its special
                if (ch != ' ') {            //if the special char is not a space
                    specialCharacters += ch;
                }
            }

            }
            System.out.println("digits: " + digits);
            System.out.println("letters: " + letters);
            System.out.println("special char: " + specialCharacters);
        }
    }
