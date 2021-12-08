package day_21_ForEachLoop;

import java.util.Arrays;

public class Initials {
    public static void main(String[] args) {

        String[] name = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles"};


            for (String each : name) {
                String initial = each.charAt(0) + "." + each.charAt(each.indexOf(" ")+1);
                System.out.println(initial);
            }
        }


    }

