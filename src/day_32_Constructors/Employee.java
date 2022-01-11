package day_32_Constructors;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    //my second constructor, if you have multiple constructors - you have multiiple options when u create an object
    public Employee(String name, char gender){
        //this.name = name;
        //Employee(name); //you should call a method constructor instead of writing this.name = name again (it is above already)
                            //there are speacial rule to call one constructor in another constructor: this():
        this(name);
        this.gender = gender;
    }


    public Employee(String name, char gender, String jobTitle){
        //this.name = name;
        //this.gender = gender;
        this(name, gender); //you can pass 2 arguments here
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary){
        this(name,gender,jobTitle);
        this.salary = salary;
    }



    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

