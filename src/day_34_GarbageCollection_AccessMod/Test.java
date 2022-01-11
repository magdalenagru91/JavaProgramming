package day_34_GarbageCollection_AccessMod;

import org.w3c.dom.ls.LSOutput;


import static utilities.MathUtility.sum;

import static day_34_GarbageCollection_AccessMod.Circle.*;

public class Test {

    public static void main(String[] args) {
/*
if you do not use import you have to call it through the class name:
        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);
        */

//you can do it easier if you use import:
        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);


        System.out.println("---------------------------------------");

    //find sum if 10,20

       int r1 = sum(10,20); //you dont have to call it through the class name cause you imported it


    //find sum of 100,200

        int r2 = sum(100,200);
}

}