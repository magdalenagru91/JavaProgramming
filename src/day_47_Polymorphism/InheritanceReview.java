package day_47_Polymorphism;

public class InheritanceReview {

    //calling this constructor is implicit cause it is default; child classes call it but dont inherit it:
    public InheritanceReview(){                             //this is default constructor
        System.out.println("Parent class constructor");
    }                                                       //constructor won't be inherited

    int a;  //if this variable is common for all the classes it can be in the parent class

    void method1(){
    }


}

class A extends InheritanceReview{

}

class B extends InheritanceReview{


}

class C extends InheritanceReview{


}
