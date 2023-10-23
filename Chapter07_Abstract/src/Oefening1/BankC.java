package Oefening1;

public class BankC extends Bank{

    private int balance ; // eigenschap

    public BankC(){
        this.balance=2000;
    }

    @Override  //implementation of the abstract method
    int getBalance() {
        return 2000;
    }
}
