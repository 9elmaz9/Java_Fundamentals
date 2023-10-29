package Customer;
//Maak de abstracte klasse AbstractCustomer
public abstract class AbstractCustomer {

    //Deze heeft als eigenschap een protected String name
    protected String name;

    //En de volgende 2 abstracte methoden:

    //public methode isNil met als returntype boolean
    public abstract boolean isNil();

    //public methode getName met als returntype String
    public  abstract String getName();
}
