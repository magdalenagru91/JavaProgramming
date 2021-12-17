package day_25_CustomMethods_Overloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String str = "Java Programming Language";

        StringUtility.printEachChar(str);




        System.out.println("-----------------");

        String s1 = "Wooden Spoon";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);




        System.out.println("-----------------");

        String s2 = "level";
        boolean palindrome = StringUtility.isPalindrome(s2);
        System.out.println(palindrome);



        System.out.println("-----------------------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count=0;

        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);



        System.out.println("-----------------");
        boolean trueFalse = StringUtility.anagram("abc", "bca");
        System.out.println(trueFalse);


        System.out.println("-----------------");
        String noDuplicates = StringUtility.removeDuplicates("aaabbc");
        System.out.println(noDuplicates);





    }

}
