package day_30_CustomClass;

public class Dog {

    //you dont need main method for custom classes, they are ment for creating objects, they are not ment for running the class

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    //if you make it static means there is only one copy created for all the objects, all dogs will eat and all will bark
    public void eat() {
        System.out.println(name + " is eating");
    }


    public void bark() {
        System.out.println(name + " is barking");
    }


    //you need toString method not to get the hash code when you print it

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    //to make it easier for a user and have it all in one sentence
    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
    }

    /*
    public String toString(){
        return "Name: " + name;
    }
    */

}

   /*
   Attributes: - instance because when I have different objects I want to store different everything
   name, age, gender, breed, size, color

   Actions:
   eat(), play(), bark()...
    */




