package day_39_Recap.AnimalTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {

    public static void main(String[] args) {

        Bear bear = new Bear("Duygu", "grizzly", 'F', 15, "small", "brown", true, true, true);
        Cat cat = new Cat("Lady", "van", 'F', 5, "big", "white", false, true, true);
        Crocodile crocodile = new Crocodile("Ben", "african", 'M', 6, "big", "green", true, false, false);
        Dog dog = new Dog("Max", "husky", 'M', 16, "medium", "black", false, true, true);
        Dolphin dolphin = new Dolphin("Farangez", "dolphin", 'F', 2, "small", "blue", false, true, true);
        Eagle eagle = new Eagle("Ben", "wild eagle", 'M', 4, "big", "brown", true, true, false);
        Lion lion = new Lion("Magda", "wild lion", 'F', 8, "big", "yellow", true, true, true);
        Parrot parrot = new Parrot("Ana", "african", 'F', 17, "medium", "red", true, true, true);
        Python python = new Python("Adam", "python", 'M', 8, "big", "yellow", true, true, true);
        Tiger tiger = new Tiger("Ron", "tiger", 'M', 20, "big", "orange", true, true, true);


        bear.hunt();
        bear.eat();

        cat.meow();
        cat.drinking();

        crocodile.hunt();
        crocodile.move();

        dog.bark();
        dog.eat();

        dolphin.swim();
        dolphin.sleep();

        eagle.fly();
        eagle.hunt();

        lion.hunt();
        lion.eat();

        parrot.fly();
        parrot.drinking();

        python.hunt();
        python.move();

        tiger.hunt();
        tiger.drinking();


        System.out.println(bear);
        System.out.println(cat);
        System.out.println(crocodile);
        System.out.println(dog);
        System.out.println(dolphin);
        System.out.println(eagle);
        System.out.println(lion);
        System.out.println(parrot);
        System.out.println(python);
        System.out.println(tiger);


        System.out.println("-------------------------------------");

        ArrayList<FriendlyAnimal> friendlyAnimals = new ArrayList<>();

        friendlyAnimals.addAll(Arrays.asList(dog, cat, parrot, dolphin));

        for (FriendlyAnimal animal : friendlyAnimals) {
            System.out.println(animal.getName() + ", is friendly: " + animal.isFriendly());
        }



        System.out.println("-------------------------------------");

        
        ArrayList<WildAnimal> wildAnimals = new ArrayList<>();
        
        wildAnimals.addAll(Arrays.asList(tiger,lion,python,eagle, bear, crocodile));

        for (WildAnimal each : wildAnimals) {
            System.out.println(each.getName() + ", is friendly: " + each.isFriendly());
            
        }






    }
}
