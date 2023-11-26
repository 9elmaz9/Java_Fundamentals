package MyGenericClass;

import My.MyCharacterClass;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        MyGenericClass<Integer,Integer> myInt = new MyGenericClass(1,9);
        MyGenericClass<Double,Double>myDouble = new MyGenericClass(3.14,1.01);
        MyGenericClass<Character,Character>myChar = new MyGenericClass('@','%');
        MyGenericClass<String,Character> myString = new MyGenericClass("Hello",'!');

       // ArrayList<String> myFriend = new ArrayList<>();

        HashMap<Integer,String> users = new HashMap<>();


        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
    }
}
