package Example4;

public class MainApp {
    public static void main(String[] args) {


        //Upcasting
        Parent parent = new Child();
        parent.name = "Intec Brussel";

        //Afdrukken van de naam van de bovenliggende klassr
        System.out.println(parent.name);
        //De klasemethode parent is een overschreven methode en daroom wordt deze uitgevoerd
        parent.method();



        //Impliciet proberen te downcasten :U krijgt een compileerfout
        //Child child = new Parent();

        //Downcasting Explicity
        Child child = (Child) parent;
        System.out.println(child.name);
        child.method();

    }
}
