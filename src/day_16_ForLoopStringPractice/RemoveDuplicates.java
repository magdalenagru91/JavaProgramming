package day_16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {


        String str = "aabbaacc";
        String result = "";

        for (int i = 0; i < str.length(); i++) {     //second i could be i<=str.length()-1, now this i represents all index numbers starting from 0

            String ch = ""+str.charAt(i); // represents each character of str

            if (!result.contains(ch)) {     //if the character is not contained in the result

                result += ch;       //the character will be added to the result
            }

        }
        System.out.println(result);
    }
}