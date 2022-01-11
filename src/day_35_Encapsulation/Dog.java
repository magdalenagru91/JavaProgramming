package day_35_Encapsulation;

public class Dog {

    /*
    Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
     */

    public String breed, size;
    public char gender;
    public int age;
    public String color;
    public static int numberOfLegs;
    public static int numberOfEyes;
    public static int numberOfWings;
    public static boolean isFriendly;


    public Dog(String breed, String size, char gender, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    static {
        numberOfLegs = 4;
        numberOfEyes = 2;
        numberOfWings = 2;
        isFriendly = true;
    }

    public void eat(){
        System.out.println(breed + " is eating");
    }
    public void sleep(){
        System.out.println(breed + " is sleeping");
    }
    public void drink(){
        System.out.println(breed + " is drinking");
    }
    public void play(){
        System.out.println(breed + " is playing");
    }
    public void barking(){
        System.out.println(breed + " is barking");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", number of legs='" + numberOfLegs + '\'' +
                ", number of eyes='" + numberOfEyes + '\'' +
                ", number of wings='" + numberOfWings + '\'' +
                ", is friendly='" + isFriendly + '\'' +
                '}';
    }
}
