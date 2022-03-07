package day_44_Abstraction_Interface.animalTask;

public class Dog extends Animal implements Playable{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats dog pizza");
    }

    public void bark(){
        System.out.println(getName() + "is barking");
    }

    @Override
    public void play() {
        System.out.println(getName() + " the dog likes to play");
    }
}
