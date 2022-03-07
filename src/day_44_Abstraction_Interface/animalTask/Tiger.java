package day_44_Abstraction_Interface.animalTask;

public class Tiger extends Animal implements WildAnimal{

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating tigers food");
    }

    public void hunt(){
        System.out.println(getName() + " the tiger is hunting a deer");
    }
}
