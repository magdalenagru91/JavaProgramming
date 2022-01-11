package day_36_Inheritance.sportTask;

public class Sport {
    /*
    1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfRefere, rules



			methods:
				setInfo()
				play()
				toString()
     */


    public String name;
    public int numberOfPlayers, numberOfRefere;
    public String rules;

    public void setInfo(String name, int numberOfPlayers, int numberOfRefere, String rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfRefere = numberOfRefere;
        this.rules = rules;
    }

    public void play(){
        System.out.println("Playing " + name);
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfRefere=" + numberOfRefere +
                ", rules='" + rules + '\'' +
                '}';
    }
}
