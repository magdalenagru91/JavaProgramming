package day_39_Recap.CydeoTask;

public class Cydeo {
    /*
    7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Person

            test all the functions of each objects

            Analyze the relationships between the classes
     */


    public static void main(String[] args) {


        Tester tester = new Tester("John", 28, 'M', 14, "Tester", 100000);

        Developer developer = new Developer("Korkams", 29, 'M', 1, "Java Developer", 200000);

        Teacher teacher = new Teacher("Daniel", 32, 'M', 3, "Math teacher", 50000);

        Student student = new Student("Suhaib", 30, 'M', 8, "SDET");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);


        System.out.println("-----------------------------------");

        developer.setAge(39);

        System.out.println(developer.getAge());
        System.out.println(developer);


        System.out.println("-----------------------------------");

        developer.work();
        tester.work();
        teacher.work();


        System.out.println("-----------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();


        System.out.println("-----------------------------------");

        student.eat();
        student.drink();
        student.sleep();

            }
}