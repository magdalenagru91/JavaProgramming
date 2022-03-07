package day_39_Recap.StudentTask;

public class UndergraduateStudent extends Student{

    public UndergraduateStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        System.out.println("Undergraduate student " + getName() + " " + getStudentId() + " is studying");
    }

    public void test(){
        System.out.println("Undergraduate student " + getName() + " " + getStudentId() + " is taking a test");
    }

    /*
    2. UndergraduateStudent

						Override the study method

						add any additional fields and methods if necessary
     */
}
