package day_44_Abstraction_Interface.animalTask;

public interface Playable {

    static boolean isFriendly = true;   //you have to initialize it here, cause interface cannot have a block!

    /*
    public static void method(){
        System.out.println(isFriendly);     //if this variable was not static -
                                            // it would be impossible to call it in the static method
    }
     */

    abstract void play();       //public and abstract is by default given



}
