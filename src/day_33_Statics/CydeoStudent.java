package day_33_Statics;

public class CydeoStudent {

    /*
    1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
     */

    public String name;
    public int age, ID, batchNumber, groupNumber;
    public char gender, grade;

    public static String schoolName = "Cydeo";
    public static String programmingLanguage = "Java";

    public CydeoStudent(String name, int age, int ID, int batchNumber, int groupNumber, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;
    }


    public void study(){
        System.out.println(name + " is studying.");
    }

    public void attendClass(){
        System.out.println(name + " is attending a class.");
    }

    public void printSchoolName(){
        System.out.println(schoolName);
    }

    public void printProgLanguage(){
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
