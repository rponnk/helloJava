package com.rockkim;

public class Account {
    private String accoutNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //constructors

    //setting defaults
    public Account() {
        this("889655422", 10.0, "Jane Doe", "jane@doe.com", "(123)-456-7859");
        System.out.println("default constructor called");
    }
    public Account(String accoutNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accoutNumber = accoutNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
        System.out.println("Your new balance is " + this.balance);
    }

    public void withdraw(double withdraw) {
        if(this.balance - withdraw < 0) {
            System.out.println("Insuffiecent funds");
        } else {
            this.balance -= withdraw;
            System.out.println("You have withdrawn " + withdraw + " your current balance is " + this.balance);
        }
    }

    public String getAccoutNumber() {
        return accoutNumber;
    }

    public void setAccoutNumber(String accoutNumber) {
        this.accoutNumber = accoutNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
