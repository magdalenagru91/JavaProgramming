package day_39_Recap.CydeoTask;

public class Tester extends Employee{

    /*
    3. Create a sub class of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()
     */


    public Tester(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(getJobTitle() + " " + getName() + " is creating a ticket");
    }


    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is testing the app");
    }
}
