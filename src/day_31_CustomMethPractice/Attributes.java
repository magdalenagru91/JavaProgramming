package day_31_CustomMethPractice;

public class Attributes {
/*
BankAccount Task:
        Attributes:
                1. accountHolder, 2. accountNumber, 3. balance

        Actions:
            1. setInfo(): sets the accountHolder and accountNumber attributes
            2. toString()
                3. checkBalance():displays the available balance
                2. deposit(): increases the balance by the given amount
        3. withdraw(): decreases the balance by the given amount
 */
    public String accountHolder;
    public long accountNumber;
    public double balance;


    public void setInfo(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String toString() {
        return "Attributes{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: " + balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Depositing amount can not be zero or negative.");
            return; //exits the method
        }
            balance += amount;
        }


    public void withdraw(double amount){
        if (amount>balance){    //if withdrawing amount is greater than the available balance
            System.out.println("Insufficient balance.");
            return; //exits the function
        }

        if (amount<=0){     //if the withdrawing amount is negative or 0
            System.out.println("Withrawing amount can not be zero or negative.");
            return;
        }
            balance-=amount;
        }

    }



