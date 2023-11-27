package be.intecbrussel.Les5;

public class WrapperClasExample1 {
    public static void main(String[] args) {
//toString() methode
//▪ Een andere nuttige methode is de toString() methode.
//▪ Deze methode kunnen we gebruiken om wrapper objecten te converteren naar Strings.
//▪ Als we dit hebben gedaan kunnen we weer de methodes van de String klassen gebruiken op wat oorspronkelijk een int was.

        Integer myInt = 2500;//myInt - eto object
        String myString = myInt.toString();

        System.out.println(myString);
        System.out.println("This is a string with a lengt of:!" + myString.length());

    }
}
