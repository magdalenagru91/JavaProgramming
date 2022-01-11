package day_34_GarbageCollection_AccessMod;

public class Constructor_vs_StaticBlock {

    static {
        System.out.println("Static block");
    }

    //this will not be executed cause we need to create an object
    public Constructor_vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");

        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
    }
}
