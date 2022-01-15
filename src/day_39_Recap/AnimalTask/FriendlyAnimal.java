package day_39_Recap.AnimalTask;

public class FriendlyAnimal extends Animal{

    private boolean isWild;
    private boolean isFriendly;
    private boolean isPlayable;


    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        setWild(isWild);
        setFriendly(isFriendly);
        setPlayable(isPlayable);
    }


    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }


    public void play(){
        System.out.println(getBreed() + " " + getName() + " is playing");
    }
    public void pet(){
        System.out.println(getBreed() + " " + getName() + " is petting");
    }

    @Override
    public String toString() {
        return "FriendlyAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }


    /*
    2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
     */
}
