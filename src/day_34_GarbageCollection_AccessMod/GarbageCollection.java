package day_34_GarbageCollection_AccessMod;

import day_32_Constructors.Car;
import day_33_Statics.Dog;
import day_33_Statics.Iphone;
import day_33_Statics.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class GarbageCollection {

    public static void main(String[] args) {
/*
        String str = null;  //null is not an object of the string, it will not take extra memory from the string,
                            // default value of non primitive, object does not exist, is not created

        System.out.println(str.toUpperCase());

*/


        String str = "Wooden Spoon";    //after line 13 "Wooden spoon" will be eligible for garbage collection and destroyed by garbage collector
        str = null;

        System.out.println(str);



        Car car1 = new Car("Toyota");
        car1 = null;

        System.out.println(car1);


        System.out.println("-----------------------------------");

        String language = "Python";     //this is in garbage now
        language = "Java";

        System.out.println(language);

        Dog dog1 = new Dog();
        dog1.name = "elo";  //this is in garbage now

        dog1.name = "Lucy";



        System.out.println("-----------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();       //if it is not unreferenced it is not eligible to be destroyed

        list1.add(100);

        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);
        System.out.println(list2);


        System.out.println("-----------------------------------");

        Student student1 = new Student("Tahir", 'M', 30, 14, 'B');
        student1.grade = 'A';
        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);



        System.out.println("-----------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;
        l2.add("Python");

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);


//finished at 3:17, check it out from after the 1 h break



    }
}
