package day_37_Inheritance.scrumTask;

public class Tester extends Employee{   //tester is a child of employee, tester IS A employee, and tester IS A person


    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }


    public void createTicket(){
        System.out.println(jobTitle + " " + name + " is creating a ticket");
    }
}
