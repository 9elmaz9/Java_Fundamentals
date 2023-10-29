package Customer;

//Maak de CustomerFactory klasse
public class CustomerFactory {

//Hierin maak je een final array van String objecten en initialiseer deze onmiddellijk met een aantal namen.
//names is een final array van Str.obj met enkele namen
    private static final String[] names = {
            "Rachel",
            "Phoebe",
            "Chandler",
            "Joey",
            "Ross",
            "Monica"
    };


//Maak een static methode getCustomer die als returnwaarde een AbstractCustomer geeft en een parameter String name heeft.
//Создайте статический метод getCustomer, который имеет возвращаемое значение. AbstractCustomer возвращает значение и имеет параметр имени String.
    public static AbstractCustomer getCustomer(String name) { //Statische methode getCustomer
//Je itereert in deze methode over je array van String objecten en kijkt als je op de index een waarde vind die gelijk is aan het argument name dat
//werd meegegeven aan deze methode-  В этом методе вы перебираете массив объектов String и выглядите так:вы нашли значение в индексе,
// равное аргументу name dat был отдан этому методу.

        for (String customerName : names) { // itereer over het array van namen . перебор
// Indien dit het geval is zal je een new RealCustomer teruggeven die als argument de name mee krijg -
// В этом случае вы вернете нового RealCustomer которому присваивается имя в качестве аргумента

            if (customerName.equalsIgnoreCase(name)) {  // controleer of de naam overeenkomt

                return new Realcustomer(name);//ecли есть совпадения возвращаем нового new Realcustomer(name) с заданым именем
            }
        }

//Indien je klaar bent met itereren maar geen match vond geef je een new NullCustomer terug
        return new NullCustomer(); //если совпадение не найженно , возвращаемся в  new NullCustomer
    }
}











