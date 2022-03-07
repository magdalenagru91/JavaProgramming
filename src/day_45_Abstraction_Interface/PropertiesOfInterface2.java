package day_45_Abstraction_Interface;

public interface PropertiesOfInterface2 {
    int a = 100;
    static int b = 200;
/*
    public PropertiesOfInterface(int a){
        this.a=a;
    }


    static{
        b=100;
    }


    public void method1(){
        System.out.println(a+ "instance method");
    }
     */

    public static void method2STATIC(){                   //one copy
        System.out.println(b + " Static method");
    }

    public abstract void method3ABSTRACT();

    public default void method4DEFAULT(){                  //multiple copies
        System.out.println("Default method");
    }
}


class Test implements PropertiesOfInterface2{

    public String name;

    @Override
    public void method3ABSTRACT() {
        System.out.println("abstract");
    }

    @Override
    public void method4DEFAULT() {
        System.out.println("default method overriden");
    }

    public static void main(String[] args) {

        Test test = new Test();

        test.method3ABSTRACT();
        test.method4DEFAULT();

        PropertiesOfInterface2.method2STATIC();




    }
}

