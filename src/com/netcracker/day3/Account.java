package com.netcracker.day3;

public class Account {
    private int accountNumber;
    private String name;
    private double balance;
//TIP:
    //Apply setter and getter only if the value will change in the future
//default constructor
    public Account(){

    }
    public Account(double initialBalance){
        balance = initialBalance;
    }
    //setters and getters
    public void setname(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    int getAccountNumber(){
        return accountNumber;
    }

    //methods

    public double deposite(double amount){
        this.balance += amount;
        return balance;
    }

    public double withdraw(double amount){
        if(amount < balance )
            this.balance -= amount;
        return balance;
    }
}
