package day_43_Abstraction.employeeTask;

import day_37_Inheritance.Test.Test;

import java.util.jar.JarOutputStream;

public class EmployeeObjects {

    public static void main(String[] args) {


        //you cannot create an object from the abstract class!!!
        // Person person = new Person("Josh", 36, 'M');


        Tester tester = new Tester("Ali", 30, 'M', 30,"SDET", 145000);
        Developer developer = new Developer("Magda", 25, 'F', 13, "Dev", 200000);
        Teacher teacher = new Teacher("Erhan", 35, 'M', 5, "Geography teacher", 75000);
        Driver driver = new Driver("Luca", 40, 'F', 78, "Truck driver", 80000);


        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("---------------------------");

        developer.work();
        developer.sleep();
        //developer.bugReport();
        developer.eat();
        developer.unitTest();


        System.out.println("---------------------------");

        teacher.work();
        teacher.sleep();
        teacher.eat();  //eat has only 1 implementation - it is not overriden



    }
}
