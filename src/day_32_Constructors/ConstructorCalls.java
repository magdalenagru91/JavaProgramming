package day_32_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){
        //this(); -> impossible = the constructor cannot call itself

        System.out.println("Default constructor");
    }

    public ConstructorCalls(int a){      //overloading - parameter has to be different
        this(); //it has to be here, first step
        System.out.println("Constructor with int argument");
        //this(); wont work consturctor has to be on the first step
    }

    public ConstructorCalls(String str){
        this(10);
        //this(10); you can only call one constructor, here or default or int constructor
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();

        System.out.println("----------------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);

        System.out.println("----------------------------------");

        ConstructorCalls obj3 = new ConstructorCalls("Java");

    }


}
