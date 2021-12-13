package day_25_CustomMethods_Overloading;

public class SumOfNumbers {

    /*
    1. create a method that can find the sum of two numbers
                        method name: sumOf2Numbers

        2. create a method that can find the sum of three numbers
                        method name: sumOf3Numbers

        3. create a method that can find the sum of four numbers
                        method name: sumOf4Numbers
     */


    public static void main(String[] args) {
        int sum2 = sumOf2Numbers(1,2);
        System.out.println(sum2);


        int sum3 = sumOf3Numbers(1,2,3);
        System.out.println(sum3);


        int sum4 = sumOf4Numbers(1,2,3,4);
            System.out.println(sum4);
        }


public static int sumOf2Numbers(int num1, int num2){

    return num1+num2;
}

public static int sumOf3Numbers(int num1, int num2, int num3){

        return num1+num2+num3;
}

public static int sumOf4Numbers(int num1, int num2, int num3, int num4) {

        return num1+num2+num3+num4;

}

}
