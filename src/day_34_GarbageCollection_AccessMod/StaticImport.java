package day_34_GarbageCollection_AccessMod;

import static day_34_GarbageCollection_AccessMod.Circle.pi;

public class StaticImport {

    public static void main(String[] args) {

        System.out.println(pi);//if you import you do not need to call something through the class name like below:
        System.out.println(Circle.pi);

    }
}
