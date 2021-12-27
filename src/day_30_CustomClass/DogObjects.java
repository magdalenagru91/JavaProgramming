package day_30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";


        Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.breed = "husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "white";


        Dog dog3 = new Dog();
        dog3.setInfo("Henryk", "chuaua", 4, 'M', "Little", "grey");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);


        dog1.eat();
        dog2.bark();


        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra large", "Yellow");
        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "PitBull", 6 ,'M', "Large", "Black");

        Dog[] dogs = {dog1,dog2,dog3,dog4,dog5};


        ArrayList<Dog> femaleDogs = new ArrayList<>();

        for (Dog each : dogs) {
            if (each.gender=='F'){
                femaleDogs.add(each);
            }
        }
        System.out.println(femaleDogs);




        ArrayList<Dog> maleDogs = new ArrayList<>();

        maleDogs.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));

        maleDogs.removeIf( p -> p.gender=='F');

        System.out.println(maleDogs);


        }

    }

