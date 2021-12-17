package day_27_WrapperClasses;

public class WrapperClassIntro {

    public static void main(String[] args) {

        int num1 = 200;         //you need to do AUTOBOXING to convert primitives to OBJECTS

        Integer n1 = num1;  //autoboxing

        int num2 = n1;  //unboxing



        System.out.println("-------------------------");

        Integer integerValue = 100;

        long longValue = integerValue;



        System.out.println("-------------------------");

        int num3 = 200;
        //Long l2 = num3;
        Integer num4 = num3;



        System.out.println("-------------------------");

        Byte b1 = 25;

        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;


        System.out.println("-------------------------");

        int num33 = 200;
        //Long l2 = num3;
        //Double d1 = num3;

        Integer num44 = num3; //autoboxing






        System.out.println("-------------------------");
        Integer z = 900;
        Integer y = z;

    }
}
