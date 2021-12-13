package day01_javaIntro;

import day_24_CustomMethods.ReturnMethodIntro;
import day_24_CustomMethods.ReturnMethodsPractice4_RemoveDuplicates;

public class Tets {

    public static void main(String[] args) {
        String str = "aaaaaaaaabbbbbbbbbbb";

        str = ReturnMethodsPractice4_RemoveDuplicates.removeDuplicates(str);
        System.out.println(str);



        String name = "Java Programming";

        String reversedName = ReturnMethodIntro.reverse(name);
        System.out.println(reversedName);
    }
}
