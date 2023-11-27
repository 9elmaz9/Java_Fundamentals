package Oefening1;

public class BankA extends Bank {
    private int balance;


    //constructor
    public BankA() {
        this.balance = 1000;
    }

    //implementation of the abstract method
    @Override
    int getBalance() {
        return balance;
    }

}




