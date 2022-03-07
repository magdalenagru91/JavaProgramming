package zzz_INTERVIEW;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Magda";

        String reversedStr ="";

        for (int i = str.length()-1; i >=0 ; i--) {
            char ch = str.charAt(i);

            reversedStr+=ch;

        }
        System.out.println(reversedStr);
    }
}
