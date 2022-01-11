package day_36_Inheritance.employeeTask;

public class Tester extends Employee{
    /*
    2.2 Create the sub class of Employee named Tester:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				testing()
				creatingTicket()
				toString()
     */


    public void testing(){
        System.out.println(name + " " + jobTitle + " is testing");
    }
    public void creatingTicket(){
        System.out.println(name + " " + jobTitle + " is creating Ticket");
    }
}
