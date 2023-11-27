package Oefening1;

public class BankB  extends  Bank{

    private int balance;

    //constructor
    public BankB() {
        this.balance = 1500;
    }

    @Override  //implementation of the abstract method
    int getBalance() {
        return balance;
    }
}
