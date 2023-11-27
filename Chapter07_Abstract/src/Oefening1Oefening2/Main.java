package Oefening1Oefening2;

public class Main {

    public static void main(String[] args) {
        //creeeren een object van de subclass
        SubClass subObj=new SubClass();

        subObj.normalMethod(); //roep de constructor van de abst class , het is niet abstract ()

        subObj.aMethod(); // roep abstract method
    }
}

