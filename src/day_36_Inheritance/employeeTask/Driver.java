package day_36_Inheritance.employeeTask;

public class Driver extends Employee{
    /*
    2.5 Create the sub class of Employee named Driver:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				drivering()
				toString()
     */

    public void driving(){
        System.out.println(name + " " + jobTitle + " is driving");
    }


}
