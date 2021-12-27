package day_27_WrapperClasses;

public class SameNumOfUpperAndLower {

    /*
    Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
     */

    public static void main(String[] args) {

        String str = "JAVA java";
        int countUpper = 0;
        int countLower = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='A' && str.charAt(i)<='Z'){
                countUpper++;
            } else if (str.charAt(i)>='a' && str.charAt(i)<='z'){
                countLower++;
            }
        }
        boolean equals = (countLower==countUpper);

        System.out.println(equals);
    }
}
