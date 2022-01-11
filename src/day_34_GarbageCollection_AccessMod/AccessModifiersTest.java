package day_34_GarbageCollection_AccessMod;

public class AccessModifiersTest {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.deafaultData);
        //System.out.println(AccessModifiers.privateData);



        AccessModifiers.method1();
        AccessModifiers.method2();
        //AccessModifiers.method3(); it is private, cannot show it
    }
}
