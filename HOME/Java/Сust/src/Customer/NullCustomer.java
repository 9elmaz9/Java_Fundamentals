package Customer; //stap3

//Maak de concrete klasse NullCustomer die ook extend van de klasse
//AbstractCustomer
public class NullCustomer extends AbstractCustomer {

//De methode isNil implementeer je door true terug te geven.
    @Override // implementatie van isNil, altijd true voor NullCustomer
    public boolean isNil() {
        return true;
    }

 //Implementeer de getName methode door de String literal “Not Available in
// Customer Database” terug te geven.
    @Override //geeft een specifieke string terug
    public String getName() {
        return "Not Available in Customer Database";


    }

}
