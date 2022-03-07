package day_44_Abstraction_Interface.animalTask;

public class Parrot extends Animal implements Playable, Flyable{

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating parrot food");
    }

    public void play(){
        System.out.println(getName() + " the parrot likes to play");
    }


    public void fly(){
        System.out.println(getName() + " the parrot is flying 2km/h");
    }
}
