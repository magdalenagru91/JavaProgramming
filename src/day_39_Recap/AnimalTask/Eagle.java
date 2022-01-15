package day_39_Recap.AnimalTask;

public class Eagle extends WildAnimal{

    public Eagle(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println("Eagle " + getName() + " is hunting");
    }

    public void fly(){
        System.out.println("Eagle " + getName() + " is flying");
    }
}
