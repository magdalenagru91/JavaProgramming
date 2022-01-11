package day_34_GarbageCollection_AccessMod;

public class AccessModifiers {

    public static int publicData = 100;
    static int deafaultData = 200;  //access modifier: deafault
    private static int privateData = 300;




    public static void method1(){
        System.out.println("Public");
    }

    static void method2(){
        System.out.println("Default");
    }

    private static void method3(){
        System.out.println("Private");
    }



    public static void main(String [] args){

        System.out.println(publicData);
        System.out.println(deafaultData);
        System.out.println(privateData);
    }
}
