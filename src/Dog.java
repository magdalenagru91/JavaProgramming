import java.util.ArrayList;
import java.util.Arrays;

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


     /*
   BankAccount: - instance because when I have different objects I want to store different everything
   name, age, gender, breed, size, color

   Actions:
   eat(), play(), bark()...
    */
}

class DogObjects{
    public static void main(String[] args) {

        day_30_CustomClass.Dog dog1 = new day_30_CustomClass.Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";


        day_30_CustomClass.Dog dog2 = new day_30_CustomClass.Dog();
        dog2.name = "ACE";
        dog2.breed = "husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "white";


        day_30_CustomClass.Dog dog3 = new day_30_CustomClass.Dog();
        dog3.setInfo("Henryk", "chuaua", 4, 'M', "Little", "grey");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);


        dog1.eat();
        dog2.bark();


        day_30_CustomClass.Dog dog4 = new day_30_CustomClass.Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra large", "Yellow");
        day_30_CustomClass.Dog dog5 = new day_30_CustomClass.Dog();
        dog5.setInfo("Sully", "PitBull", 6 ,'M', "Large", "Black");

        day_30_CustomClass.Dog[] dogs = {dog1,dog2,dog3,dog4,dog5};


        ArrayList<day_30_CustomClass.Dog> femaleDogs = new ArrayList<>();

        for (day_30_CustomClass.Dog each : dogs) {
            if (each.gender=='F'){
                femaleDogs.add(each);
            }
        }
        System.out.println(femaleDogs);




        ArrayList<day_30_CustomClass.Dog> maleDogs = new ArrayList<>();

        maleDogs.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));

        maleDogs.removeIf( p -> p.gender=='F');

        System.out.println(maleDogs);


    }
}
