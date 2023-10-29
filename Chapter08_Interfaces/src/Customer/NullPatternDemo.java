package Customer;

public class NullPatternDemo {

    public static void main(String[] args) {

//Gebruik nu de CustomerFactory klasse om ofwel RealCustomer objecten of
//NullCustomer objecten te creëeren op basis van de naam die je meegeeft

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rachel");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Phoebe");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Chandler");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Joey");
        AbstractCustomer customer5 = CustomerFactory.getCustomer("Ross");
        AbstractCustomer customer6 = CustomerFactory.getCustomer("Monica");
        AbstractCustomer customer7 = CustomerFactory.getCustomer("Mike");


//Output tonen
        System.out.println("Customers:");
        System.out.println("Customer 1 :" + customer1.getName());
        System.out.println("Customer 2 :" + customer2.getName());
        System.out.println("Customer 3 :" + customer3.getName());
        System.out.println("Customer 4 :" + customer4.getName());
        System.out.println("Customer 5 :" + customer5.getName());
        System.out.println("Customer 6 :" + customer6.getName());
        System.out.println("Customer 7 :" + customer7.getName());


    }
}
