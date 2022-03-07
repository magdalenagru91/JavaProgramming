package day_44_Abstraction_Interface.animalTask;

public class Cat extends Animal implements Playable{


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void meow(){
        System.out.println(getName() + " is meowing");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating cat food");
    }

    public void play(){
        System.out.println(getName() + " the cat likes playing");
    }
}
