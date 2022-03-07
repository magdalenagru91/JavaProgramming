package day_39_Recap.StudentTask;

public class GraduateStudent extends Student{


    public GraduateStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        System.out.println("Graduate student " + getName() + " with student id: " + getStudentId() + " does not have to study");
    }

    public void party(){
        System.out.println("Graduate student " + getName() + " with student id: " + getStudentId() + " is partying");
    }
}
