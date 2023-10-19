package Les1.Oefening1Animal;

import Les1.CarVehicle.Vehicle;

public class Konijn extends Vehicle {

    //car class field
    private String brandName = "KONIJN";

    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    //vehicle class methode
    public  void honk(){

        System.out.println("MI MI!");
    }
    public  void  sound(){

        //roept de honk()method van de Vehicle
        super.honk();
    }


    //constractor zonder parametrs

    public Konijn(){
        //roert de super constructor aan
        super();// altid in eerse line !!!!!!!!!! this en super() kunnen niet samen gebruiken in een constractor
        //Eigen implementatie van de Car constructor
        System.out.println("Car class constructor");
    }
}



