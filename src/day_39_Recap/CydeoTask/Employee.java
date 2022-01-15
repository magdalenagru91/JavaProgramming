package day_39_Recap.CydeoTask;

public class Employee extends Person{

    /*
    2. Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()
     */


    private int employeeId;
    private String jobTitle;
    private double salary;



    public Employee(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }



    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {

        if (employeeId<=0){
            System.err.println("Invalid employee ID: " + employeeId);
            System.exit(1);
        }
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (salary<=0){
            System.err.println("Invalid salary: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }



    public void work(){
        System.out.println(getName() + " is working");
    }



    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", employee ID=" + employeeId +
                ", job title=" + jobTitle +
                ", salary=" + salary +
                '}';
    }
}
