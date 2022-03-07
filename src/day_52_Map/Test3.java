package day_52_Map;

import day_53_FunctionalInterface.MyThirdFunctionalInterface;

public class Test3 {

    public static void main(String[] args) {


        MyThirdFunctionalInterface<Integer> cube;
        cube = n -> {
            System.out.println(n*n*n);
            return n*n*n;
        };

        cube.method(3);


        System.out.println("-----------------------------------");


        MyThirdFunctionalInterface<String> reverseString;
        reverseString = (s) -> {
            String reverse = "";

            for (int i = s.length() - 1; i >= 0; i--) {
                reverse += s.charAt(i);
            }
            System.out.println(reverse);
            return reverse;
        };

        reverseString.method("Eray");

    }
}