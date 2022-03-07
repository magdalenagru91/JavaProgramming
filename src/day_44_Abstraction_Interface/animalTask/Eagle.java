package day_44_Abstraction_Interface.animalTask;

public class Eagle extends Animal implements WildAnimal, Flyable{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating eagle food");
    }

    public void hunt(){
        System.out.println(getName() + " the eagle is hunting snake");
    }

    public void fly(){
        System.out.println(getName() + " the eagle is flying 50km/h");
    }
}
