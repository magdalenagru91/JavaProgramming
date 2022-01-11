package day_33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        //the objects have their own memory


        Student student1 = new Student("Ahmet");

        Student student2 = new Student("Aygun", 'F');

        Student student3 = new Student("Nigara", 11);

        Student student4 = new Student("Mert", 12, 'M');

        Student student5 = new Student("Cihad", 'M', 25);

        Student student6 = new Student("Suhaib", 'M', 27, 15);

        Student student7 = new Student("Ali", 'M', 42, 37, 'A');


        System.out.println(student1==student2); // -> false, cause we used NEW - it is in a different place of the heap memory



        Student [] students = { student1, student2, student3, student4, student5, student6, student7};

        System.out.println(Arrays.toString(students));
    }
}
