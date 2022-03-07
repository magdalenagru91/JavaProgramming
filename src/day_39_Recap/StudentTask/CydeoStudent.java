package day_39_Recap.StudentTask;

public class CydeoStudent extends Student{

    private int batchNumber, groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.programmingLanguage = programmingLanguage;
    }


    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber<=0){
            System.err.println("Invalid batch number: " + batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber<=0){
            System.err.println("Invalid batch number: " + groupNumber);
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage==null || programmingLanguage.isEmpty()){
            System.err.println("Invalid programming language: " + programmingLanguage);
            System.exit(1);
        }

        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating " + getProgrammingLanguage());
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking " + getProgrammingLanguage());
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping " + getProgrammingLanguage());
    }


    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", student ID=" + getStudentId() +
                ", field of study=" + getFieldOfStudy() +
                ", grade=" + getGrade() +
                ", schoold name=" + getSchoolName() +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }




    /*
    3. CydeoStudent:

						Extra Variables:
							batchNumber, groupNumber, programmingLanguage

						Encapsulate all the fields

						Add a constructor that can set all the fields

								Condition:
									1. batchNumber and groupNumber should not be set to zero or negative
									2. programmingLanguage should not be set to null
									3. programmingLanguage should not empty


						Override the eat, drink and sleep methods (programmingLanguage need to be included)

						Override the toString method:
								name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber,
								groupNumber, programmingLanguage should be included
     */
}
