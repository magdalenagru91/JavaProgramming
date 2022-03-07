package day_52_Map;

public class Test2 {

    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach;

        printEach = s -> {
            for (String each : s.split("")) {
                System.out.println(each);
            }
        };

        printEach.test("Wooden Spoon");


        System.out.println("---------------------------");

        MySecondFunctionalInterface<Integer> cube = n -> {

            System.out.println(n*n*n);
        };

        cube.test(3);
    }
}
