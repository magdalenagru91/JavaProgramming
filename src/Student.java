import java.util.Arrays;

public class Student {

    /*
    Person Task:
        1. Create a class called Person:
                Attributes:
                    name, gender, age, studentID, grade

                Add a constructor that allows user to create object by setting the name of student

                Add a constructor that allows user to create object by setting the name and gender of the student

                Add a constructor that allows user to create object by setting the name and studentID of the student

                Add a constructor that allows user to create object by setting the name, studentID and grade of the student

                Add a constructor that allows user to create object by setting the name, gender and age of the student

                Add a constructor that allows user to create object by setting the name, gender, age and studentID of the student

                Add a constructor that allows user to create object by setting the name, gender, age, studentID and grade of the student

                Actions:
                    toString()
                    study()
     */

    public String name;
    public char gender;
    public int age;
    public int studentID;   //has to be instance cause it is different from student to student, so not static
    public char grade;      //we dont want all students to have their own grades, not same, so it is instance

    //i an use constructor as a function of setting those instance objects

    //method overloading - method having the same name but different parameters


    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {      //parameters of the methods are LOCAL
        this(name); //it has to be at the first step
        this.gender = gender;
    }

    public Student(String name, int studentID) {
        this(name);
        this.studentID = studentID;
    }

    public Student(String name, int studentID, char grade) {
        this(name, studentID);
        this.grade = grade;
    }

    public Student(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }

    public Student(String name, char gender, int age, int studentID) {
        this(name, gender, age);
        this.studentID = studentID;
    }

    public Student(String name, char gender, int age, int studentID, char grade) {
        this(name, gender, age, studentID);
        this.studentID = studentID;
    }


    public void study() {
        System.out.println(name + " is studying.");
    }


    public String toString() {      //it is instance method
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }


}

    class StudentObjects{

        public static void main(String[] args) {

            //the objects have their own memory


            day_33_Statics.Student student1 = new day_33_Statics.Student("Ahmet");

            day_33_Statics.Student student2 = new day_33_Statics.Student("Aygun", 'F');

            day_33_Statics.Student student3 = new day_33_Statics.Student("Nigara", 11);

            day_33_Statics.Student student4 = new day_33_Statics.Student("Mert", 12, 'M');

            day_33_Statics.Student student5 = new day_33_Statics.Student("Cihad", 'M', 25);

            day_33_Statics.Student student6 = new day_33_Statics.Student("Suhaib", 'M', 27, 15);

            day_33_Statics.Student student7 = new day_33_Statics.Student("Ali", 'M', 42, 37, 'A');


            System.out.println(student1==student2); // -> false, cause we used NEW - it is in a different place of the heap memory



            day_33_Statics.Student[] students = { student1, student2, student3, student4, student5, student6, student7};

            System.out.println(Arrays.toString(students));
        }

    }

