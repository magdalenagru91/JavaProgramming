package day_39_Recap.StatesTask;

public class Florida extends States{

    private boolean alligator;


    public Florida(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax, boolean alligator) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
        setAlligator(alligator);
    }

    public boolean isAlligator() {
        return alligator;
    }

    public void setAlligator(boolean alligator) {
        this.alligator = alligator;
    }
}
