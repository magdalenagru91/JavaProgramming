package day_37_Inheritance;

class A{
    public A(int a){
        System.out.println("A");
    }
}

class B extends A{
    public B(){
        super(9);   //child class must have a super keyword, if the constructor in parents class is not default
        System.out.println("B");
    }

}

public class ConstructorPractice {

    public static void main(String [] args){
        B obj = new B();

    }
}
