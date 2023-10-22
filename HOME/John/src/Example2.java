public class Example2 {
    public static void main(String[] args) {

        //ptintName("Jonh", 3);
        // String name=ptintName("Jonh",3);
        //String name = ptintName("Jonh", 3);
        //String printName ("Jonh", 3);


        //for ( int i = 0;i<10;i++){  //  10 = loop  how many time we wants
           //System.out.println("These pretzels are making me thirsty");
        //}

        Cat.dingDong();// STATIC , can be used without cat object


        //create individual cat
        Cat myCat =new Cat();
        myCat.name="Fred";
        myCat.age=6;
        myCat.meow(); // only here

        Cat anotherCat=new Cat(); // create oblect for Cat class, as many as want
        anotherCat.name="Stella";
        anotherCat.age=5;

        System.out.println(myCat.age); // 6


    }

    private static String ptintName(String name, int number) {


        if (number == 5) {  // as bumners

            // if(name.equals("Jonh")) uses as condition
            System.out.println("This guy is awesome");
        } else if (name.equals("Larry")) {
            System.out.println("This guy is Ok i guess");
        } else {
            System.out.println("I don't know");
        }
        // System.out.println("My name is " + name);
        return "Mu name is " + name;
    }

}

