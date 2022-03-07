package day_47_Polymorphism;

import day_43_Abstraction.employeeTask.*;
import day_44_Abstraction_Interface.animalTask.Animal;
import day_44_Abstraction_Interface.animalTask.Cat;
import day_44_Abstraction_Interface.animalTask.Dog;
import day_45_Abstraction_Interface.browserClass.ChromeDriver;
import day_45_Abstraction_Interface.browserClass.WebDriver;
import day_45_Abstraction_Interface.shapeClass.Circle;
import day_45_Abstraction_Interface.shapeClass.Shape;
import day_45_Abstraction_Interface.shapeClass.Square;

public class ReferenceTypeCastings {

    public static void main(String[] args) {


        Shape shape = (Shape) new Circle(4);    //it is implicitly casted

        //WebDriver driver = (WebDriver) new ChromeDriver();  //it is implicitly casted



        Dog dog2 = new Dog("Max", "Husky", 'M', 3, "small", "white");
        Dog dog3 = dog2;


        Animal animal = new Dog("Max", "Husky", 'M', 3, "small", "white");
        Dog dog4 = new Dog("Lucy", "Husky", 'M', 3, "small", "white");

        //animal.bark();  //you cannot call it

        Dog dog = (Dog)animal;
        dog.bark();
        dog.eat();

        ((Dog)animal).bark();   //grouping function - placing into parenthesis -
                                // making it more important,priority to start with when running code;
                                //so we make sure casting comes first;
                                // if I don’t need to use it several times
                                //if I need to - I create Dog dog = (Dog)animal;


        Shape shape2 = new Square(5);
        System.out.println(((Square) shape2).getSide());


        System.out.println("-------------------------------------");

        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "small", "white");
        //Cat cat = (Cat)animal2;
        //cat.meow();

        ((Cat)animal2).meow();


        System.out.println("-------------------------------------");

        Employee employee = new Tester("Ali",33,'M',45,"SDET",80000);
        ((Tester)employee).bugReport();



        ((Developer)employee).unitTest();   //exception - tester doesnt have a IS A relation with developer


        Driver driver = (Driver) employee;
        Person person = (Person) employee;  //it is upcasting
        Teacher teacher = (Teacher) employee; //employee is a tester object - no IS A relationship


        System.out.println("-------------------------------------");




    }
}
