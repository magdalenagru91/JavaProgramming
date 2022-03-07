package day_42_Exceptions;

import day_31_CustomMethPractice.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {

    public static void main(String[] args) {

        //throw new NoSuchElementException("There is no such element as break"); - it is unchecked


        //System.out.println("lalal");
        //after the throw keyword you cannot put anything else, it is not readible


        //throw new Rectangle(2,5); you shouldnt use it for anything that is not THREOWABLE,
                                    // (that is not under this biggest class from the scheme
                                    //from "EXCEPTIONS" in my notes)



        //throw new InterruptedException(); - cannot work at all cause it is a checked exception



  }
}
