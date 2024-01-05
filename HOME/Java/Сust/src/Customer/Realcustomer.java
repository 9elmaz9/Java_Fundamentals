package Customer;

//Maak de concrete klasse Realcustomer die extend
// van de klasse AbstractCustomerMaak de concrete klasse Realcustomer die extend van de klasse AbstractCustomer
public class Realcustomer extends AbstractCustomer { // concrete klasse RealCustomer

//Deze heeft een constructor die als parameter een String name heeft
    public Realcustomer(String name) { //constructor met parameter nam
        this.name = name;
    }

//Return false bij de implementatie van isNil
    @Override //// worden geïmplementeerd in RealCustomer
    public boolean isNil() {
        return false;
    }

//Geef een zinvolle implementatie aan getName
    @Override // worden geïmplementeerd in RealCustomer
    public String getName() {
        return name;
    }

}
