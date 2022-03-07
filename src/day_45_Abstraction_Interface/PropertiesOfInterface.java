package day_45_Abstraction_Interface;

public abstract class PropertiesOfInterface {

    int a;
    static int b;

    public PropertiesOfInterface(int a){
        this.a=a;
    }

    static{
        b=100;
    }

    public void method1(){
        System.out.println(a + "instance method");
    }

    public static void method2(){
        System.out.println(b + "Static method");
    }

    public abstract void method3();
    }


