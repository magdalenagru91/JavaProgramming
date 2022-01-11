import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {

    public static void main(String[] args) {

        //3 testers objects
        day_31_CustomMethPractice.scrumTask.Tester tester1 = new day_31_CustomMethPractice.scrumTask.Tester("Layan", 11, "QA", 110000);
        day_31_CustomMethPractice.scrumTask.Tester tester2 = new day_31_CustomMethPractice.scrumTask.Tester("Ali", 43, "SDET", 142000);
        day_31_CustomMethPractice.scrumTask.Tester tester3 = new day_31_CustomMethPractice.scrumTask.Tester("Alex", 44, "SE", 135000);
        day_31_CustomMethPractice.scrumTask.Tester tester4 = new day_31_CustomMethPractice.scrumTask.Tester("Lala", 23, "SDET", 115000);

        day_31_CustomMethPractice.scrumTask.Tester[] testers = {tester1,tester2, tester3, tester4};

        //4 developers objects
        day_31_CustomMethPractice.scrumTask.Developer developer1 = new day_31_CustomMethPractice.scrumTask.Developer("Olga", 22, "Java Developer", 125000);
        day_31_CustomMethPractice.scrumTask.Developer developer2 = new day_31_CustomMethPractice.scrumTask.Developer("Aygun", 39, "Java Master", 185000);
        day_31_CustomMethPractice.scrumTask.Developer developer3 = new day_31_CustomMethPractice.scrumTask.Developer("Tunc", 28, "Software Developer", 135000);
        day_31_CustomMethPractice.scrumTask.Developer developer4 = new day_31_CustomMethPractice.scrumTask.Developer("Sinem", 13, "Senior Developer", 200000);

        day_31_CustomMethPractice.scrumTask.Developer[] developers = {developer1,developer2,developer3,developer4};


        //1 ScrumTeam Object
        day_31_CustomMethPractice.scrumTask.ScrumTeam scrum = new day_31_CustomMethPractice.scrumTask.ScrumTeam("Nigara", "Huseyin", "Neira", 14);
/*
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        System.out.println(scrum);
  */

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);


        System.out.println("----------------------------------------------------------------");


        //testers we have in our team and their salary:

        for (day_31_CustomMethPractice.scrumTask.Tester eachTester : scrum.testersList){
            System.out.println(eachTester.name + " : " + eachTester.salary);
        }

        for (day_31_CustomMethPractice.scrumTask.Developer eachDeveloper : scrum.developersList) {
            System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
        }


        System.out.println("----------------------------------------------------------------");

        scrum.removeTester(23);
        scrum.removeDeveloper(22);

        System.out.println(scrum);
    }
}


class Tester {

     /*
create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary
	        Add A constructor that can set all the fields
	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()
 */


    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }


    public void smokeTesting(){
        System.out.println(name + " is smoke testing");
    }


    public void creatingTicket(){
        System.out.println(name + " is smoke creating ticket");
    }

}



class Developer {
    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name + " is coding");
    }

    public void unitTesting(){
        System.out.println(name + " is unit testing");
    }

    public void fixingBug(){
        System.out.println(name + " is fixing bug");
    }

}



class ScrumTeam{
     /*
create a class called ScrumTeam
   Attributes:
        String PO, BA, SM;
        ArrayList<Tester> testersList = new ArrayList<>();
        ArrayList<Developer> devopsList = new ArrayList<>();
        int daysOfSprint;
       Add A constructor that can set the fileds PO, BA, and SM
     Actions:
          addTester(Tester tester): adds the given tester to the testers ArrayList
          addTesters(Tester[] testers): adds the given testers to the testers ArrayList
          addDeveloper(Developer developer): adds the given developer to the developers ArrayList
          addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList
          removeTester(long employeeID): removes the given tester from the testers ArrayList
          removeDeveloper(long employeeID): removes the developer from the developers ArrayList
          toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */


    public String PO, BA, SM;
    public ArrayList<day_31_CustomMethPractice.scrumTask.Tester> testersList = new ArrayList<>();
    public ArrayList<day_31_CustomMethPractice.scrumTask.Developer> developersList = new ArrayList<>();
    public int daysOfSpring;


    public ScrumTeam(String PO, String BA, String SM, int daysOfSpring) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSpring = daysOfSpring;
    }

    public void addTester(day_31_CustomMethPractice.scrumTask.Tester tester){        //this should be used only for increasing the sieze, nothing else, so void can be
        testersList.add(tester);
    }

    public void addTesters(day_31_CustomMethPractice.scrumTask.Tester[] testers) {
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(day_31_CustomMethPractice.scrumTask.Developer developer){
        developersList.add(developer);
    }

    public void addDevelopers(day_31_CustomMethPractice.scrumTask.Developer[] developers) {
        developersList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID) {
        testersList.removeIf(p -> p.employeeID == employeeID);      //you have to compare each employeeID with the provided here ID
    }

    public void removeDeveloper(int employeeID) {
        developersList.removeIf(p -> p.employeeID == employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + developersList.size() +
                ", daysOfSpring=" + daysOfSpring +
                '}';
    }

}