package zzz_INTERVIEW;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList2 {
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();

        str.addAll(Arrays.asList("Magda", "Wojtek", "Ula"));

        ArrayList<String> reverse = new ArrayList<>();

        ArrayList<String> reverse2 = new ArrayList<>();

        String str1 ="";

        for (int i = str.size() - 1; i >= 0; i--) {
            reverse.add(str.get(i));
        }
        System.out.println(reverse);

        for (String each : reverse) {
            for (int i = each.length() - 1; i >= 0; i--) {
               char ch = each.charAt(i);
               str1 += ch;
            }
            str1+=", ";

        }


        reverse2.addAll(Arrays.asList(str1.split(", ")));
        System.out.println(reverse2);


        }

        }
