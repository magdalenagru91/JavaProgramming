package day_39_Recap.StudentTask;

public class Student extends Person{

    private String studentId, fieldOfStudy, schoolName;
    private char grade;


    public Student(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setGrade(grade);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy.isEmpty() || fieldOfStudy==null){
            System.err.println("Invalid field of study: " + fieldOfStudy);
            System.exit(1);
        }

        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade=='A' || grade=='B' || grade=='C' || grade=='D' || grade=='F')){
            System.err.println("Invalid grade: " + grade);
            System.exit(1);
        }

        this.grade = grade;
    }



    public void study(){
        System.out.println(getName() + " " + getStudentId() + " is studying");
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", student ID=" + studentId +
                ", field of study=" + fieldOfStudy +
                ", grade=" + grade +
                ", schoold name=" + schoolName +
                '}';
    }
}

/*
2. Create a subclass of Person named Student:
				Extra variables:
						studentId, fieldOfStudy, grade, schoolName

				Encapsulate all the fields

				Add a constructor that can set all the fields

							Condition:
									1. filedOfStudy and schoolName should not be set to null
									2. filedOfStudy and schoolName should not be empty
									3. grade must be valid (A, B, C, D, F)


				Extra methods:
					study()
					toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included

 */