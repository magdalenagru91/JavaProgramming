package day_39_Recap.StatesTask;

public class Virginia extends States{

    private String location;

    public Virginia(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax, String location) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
        setLocation(location);
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (location== null || location.isEmpty()){
            System.err.println("Invalid location: " + location);
            System.exit(1);
        }
        this.location = location;
    }
}
