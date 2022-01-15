package day_39_Recap.AnimalTask;

public class Crocodile extends WildAnimal{


    public Crocodile(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println("Crocodile " + getName() + " is hunting");
    }
}
