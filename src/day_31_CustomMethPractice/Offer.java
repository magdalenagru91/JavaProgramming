package day_31_CustomMethPractice;

public class Offer {

    /*
    Offer Task:
    1. Create a custom class named Offer
            BankAccount:
                    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

            Actions:
                setInfo(): sets all the instance variables
                toString(): returns the full info of the Offer Object
     */


    //INSTANCE VARIABLES:

    public String location, companyName, jobTitle;
    public double salary;
    public boolean hasBenefit, hasPTO, isWFH, isFullTime;


// INSTANCE VARIABLES ASSIGNED TO LOCAL VARIABLES

    public void setInfo(String location, String companyName, String jobTitle, int salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    //you are able to print it thanks to that, it converts this to String
    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
