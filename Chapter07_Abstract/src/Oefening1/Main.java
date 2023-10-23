package Oefening1;

import Les1.Dog;

public class Main {
    public static void main(String[] args) {

        //create object of each bank
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();


        System.out.println("Balance in your BankA account : $ " + bankA.getBalance());  //  for visible results we use the method =  .getBalance() : bez nego bydet error
        System.out.println("Balance in your BankB account : $ " + bankB.getBalance());
        System.out.println("Balance in your BankC account : $ " + bankC.getBalance());




        //Bank[] banks= { new BankA(), new BankB(), new BankC()};
        //for(Bank bank : bank){
           // System.out.println("Bank :" + bank.getBalance());
        }
    }



