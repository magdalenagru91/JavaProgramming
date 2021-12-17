package zzz_INTERVIEW;

public class StrongPassword3 {
    public static void main(String[] args) {


        String password = "cLdeao1990@";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecial = 0;


        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)){
                countUpperCase++;
            }else if(Character.isLowerCase(each)){
                countLowerCase++;
            }else if (Character.isDigit(each)){
                countDigits++;
            }else {
                countSpecial++;
            }
        }

       boolean hasUpperCase = countUpperCase>0 ;
       boolean hasLowerCase = countUpperCase>0 ;
       boolean hasDigit = countDigits >0 ;
       boolean hasSpecialChar = countSpecial>0;

boolean strongPassword = password.length()>=8 && !password.contains(" ") && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;


System.out.println(strongPassword);
        }
    }
