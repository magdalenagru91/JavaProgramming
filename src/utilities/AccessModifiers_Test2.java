package utilities;

import day_34_GarbageCollection_AccessMod.AccessModifiers;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        //System.out.println(AccessModifiers.deafaultData);//default access modifier is not visible outside the package
        //System.out.println(AccessModifiers.privateData); //private is not visible outside the class


    AccessModifiers.method1();
    //AccessModifiers.method2(); default cannot be outside of its package
    //AccessModifiers.method3(); private



    }



}
