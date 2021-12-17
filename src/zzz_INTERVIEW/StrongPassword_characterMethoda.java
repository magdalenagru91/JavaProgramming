package zzz_INTERVIEW;

public class StrongPassword_characterMethoda {
    public static void main(String[] args) {


    /*
     Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
     */


        String password = "12as56AA";

        int upperLetter = 0;
        int lowerLetter = 0;
        int specialChar = 0;
        int digit = 0;




        if (password.length()>=8 && !(password.contains(" "))) {


                for (int i = 0; i < password.length(); i++) {
                    char ch = password.charAt(i);
                    if (Character.isUpperCase(ch)) {
                       upperLetter++;
                    }
                    if (Character.isLowerCase(ch)) {
                       lowerLetter++;
                    }
                    if (!(Character.isLetterOrDigit(ch))) {
                        specialChar++;
                    }
                    if (Character.isDigit(ch)) {
                        digit++;
                    }
                }


                if (upperLetter >= 1 && lowerLetter >= 1 && specialChar >= 1 && digit >= 1) {
                    System.out.println("your password is strong");
                } else {
                    System.out.println("password not strong enough, choose another one.");
                }
            }

        }


    }
