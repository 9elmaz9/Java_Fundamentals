package Animal.FINAL;

// final variabl can sign 1 time
public class FinalExample {
    public static final double PI=3.14159;

    public static final double PI_MORE_WORDS=3.14159; // for constance ise UPPERCASE  caps

    public static void main(String[] args) {

       // final  Dog myDog = new Dog(); // with FINAL - ones , never  be asign again
       // myDog.eat();
       // myDog = new Dog(); // in  Final Dog myDog = new Dog(); - error

        final Dog myDog;
        myDog=new Dog();
        myDog.eat();
        //Math.PI - exist in JAVA

       // create constans
        //final double pi =3.14159;
        //pi=9; //  final garantie  for someboby can't change this variable
        System.out.println(PI*3);
    }
}
