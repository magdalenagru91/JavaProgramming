package day_36_Inheritance.encapsulation;

public class Student {

    /*
    1. Create a class named Student:
            private variables:
                name, age, gender, grade, schoolName

            Encapsulate all the fileds (at leat encapsulate two fields manually)
                    requirments:
                        1. age should not be set less than 5 or greater than 90
                        2. gender should not be set to any chanarcter other than: 'M' and 'F'
                        3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

            Add a constructor that can set all teh fields when the object is created
                        (requirments of fileds in the above must be applied)


            Methods:
                study()
                toString()
     */


    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public static boolean isStudent = true; //static - same for all the objects
    public static boolean isHuman = true;


    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);      //plus of doing this here, instead of doing regular constructor, is that we check if only valid data will be checked
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }


    public String getName(){        //instance, cause if i have static i will not be able to use instance variables
    return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){   //new name is in the parenthesis; also we will not need the value thats why void
        //new data should be assigned to the setter
        this.name = name;
    }

    public void setAge(int age){    //new age is in the parenthesis
        if (age<5 || age> 90) {
            return;         //return exits the method; can be used in any methods, but in void method cannot return any value, it exits
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if ( !(gender == 'F' || gender == 'M')){
            return;
        }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {

        if ( !(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') ){
            return;
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(name + " is studying.");
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
