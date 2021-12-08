package day_21_ForEachLoop;

import java.util.Arrays;

public class Anagram_toCharArray {
    public static void main(String[] args) {


        String str1 = "acdb";
        String str2 = "dbca";

        //write a program that can check if the str1 and str2 are build of the same chars


        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1) + " " + Arrays.toString(ch2));

        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println("Anagram:" + anagram);

        }
    }

