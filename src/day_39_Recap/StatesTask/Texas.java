package day_39_Recap.StatesTask;

public class Texas extends States{

    private boolean Cactus;

    public Texas(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax, boolean cactus) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
        setCactus(Cactus);
    }

    public boolean isCactus() {
        return Cactus;
    }

    public void setCactus(boolean cactus) {
        Cactus = cactus;
    }
}
