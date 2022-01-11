package day_31_CustomMethPractice;

public class Person {

    public String name;
    public char gender;
    public int age;

    public Person(String name, char gender, int age){    //this is DEFAULT CONSTRUCTOR
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }


}
