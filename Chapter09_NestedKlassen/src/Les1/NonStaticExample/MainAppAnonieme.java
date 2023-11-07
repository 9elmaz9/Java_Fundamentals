package Les1.NonStaticExample;

public class MainAppAnonieme {
    public static void main(String[] args) {

        Anonieme a = new Anonieme() {

            public void run() {
                System.out.println("De run methode van anonieme klasse");
            }

             // public void print() {
             //   System.out.println("print");
             //}
        };
        a.run();
             //  a.print(); // niet werk; ik heb geen print methode() hier
    }
}

