package Example5;

public class MainApp {
    public static void main(String[] args) {
        TestInstanceof object01 = new TestInstanceof();
        //Different TestClass object01=new Different TestClass();

        //Cheking were object01 is a insance of
        //Controleren of object01 een instanceof is van
        System.out.println("Is Object01 a instance of TestInstanceof?:" + (object01 instanceof TestInstanceof)); // true

        System.out.println("Is Object01 a instance of DifferentTestClass?:" + (object01 instanceof DifferentTestClass));// FALSE// different- sub class
        DifferentTestClass object02 = new DifferentTestClass();

        System.out.println("Is Object01 an instance of TestInstanceof?:" + (object02 instanceof TestInstanceof)); //TRUE
        System.out.println("Is Object01 an instance of DifferentTestClass?:" + (object02 instanceof DifferentTestClass)); //TRUE


        //INSTANCEOF MET EEN VARIABELE DAT EEN NULL VALUE HEEFT

        //Als we de operator instanceof gebruiken op een variabele dat een NULL bevat zal deze altijd false retourneren
        TestInstanceof test = null;
        System.out.println("Is test an instanceof:" + (test instanceof Example5.TestInstanceof)); //false

    }
}

