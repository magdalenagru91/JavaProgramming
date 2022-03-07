package day_33_Statics;

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
