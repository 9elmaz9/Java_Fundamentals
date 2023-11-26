package BoundedTypes;


public class Main {
    public static void main(String[] args) {

// bounded types =  you can create the obоect of a generic class to have data of specific derived types ex.Number
//ограниченные типы = вы можете создать объект универсального класса,чтобы иметь данные определенных производных типов,например Number.


        MyGenericClass<Integer, Integer> myInt = new MyGenericClass(1, 9);
        MyGenericClass<Double, Double> myDouble = new MyGenericClass(3.14, 1.01);


       // MyGenericClass<Character, Character> myChar = new MyGenericClass('@', '%');
        // MyGenericClass<String, Character> myString = new MyGenericClass("Hello", '!');

        // ArrayList<String> myFriend = new ArrayList<>();

        //HashMap<Integer,String> users = new HashMap<>();


        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
       // System.out.println(myChar.getValue()); не работает если : public class MyGenericClass<Thing extends Number, Thing2 extends  Number> {
        //System.out.println(myString.getValue());
    }
}

