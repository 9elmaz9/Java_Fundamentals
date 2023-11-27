package Oefening;

public class Main {
    public static void main(String[] args) {

        Pair <Integer,Integer> myInt= new Pair(1,3);
        System.out.println("Integer :" +myInt.toString());

        Pair<String,Character> myText;
        myText = new Pair<String, Character>("Hello",'!');
        System.out.println("Text :" + myText.toString());
    }
}

