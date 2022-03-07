package day_39_Recap.StudentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        CydeoStudent cydeoStudent = new CydeoStudent("Magda g", 25, 'F', "26", "SDET", "Cydeo", 'C', 25, 10, "Java");
        cydeoStudent.eat();


        Student student = new Student("Duygu", 30, 'F', "15", "Math", "Cydeo", 'A');
        student.eat();
        student.study();

        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Magda g", 30, 'F', "18", "language", "Univ", 'B');
        undergraduateStudent.drink();
        undergraduateStudent.study();
        undergraduateStudent.eat();

        GraduateStudent graduateStudent = new GraduateStudent("Rob", 25, 'M', "K5", "biology", "Highschool", 'A');
        graduateStudent.sleep();
        graduateStudent.study();
        graduateStudent.party();


        ArrayList<Student> students = new ArrayList<>();

        students.addAll(Arrays.asList(undergraduateStudent,graduateStudent,cydeoStudent,student));

        for (Student each : students) {
            if (each.getGrade() == 'A'){
                System.out.println(each.getName() + " has " + each.getGrade());
            }
        }




        }
    }

