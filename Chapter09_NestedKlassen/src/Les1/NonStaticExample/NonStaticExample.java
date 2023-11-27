package Les1.NonStaticExample;

public class NonStaticExample {

    private int a = 10;

    public class Inner { //Dese klasse is niet statisch  - iiner klasse
        int a = 1;

        public void run() { // deze is onze method  van in  onze author klasse
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(NonStaticExample.this.a); //dus deze lijn werkt  // 10
        }
    }

    public void run() { // van de author klasse  , var allien van author  klass
        System.out.println(a); // 10
        System.out.println(this.a); // 10
        //Inner i =  new Inner();
        //System.out.println(i.a);
        //System.out.println(Inner.this.a);
    }
}
