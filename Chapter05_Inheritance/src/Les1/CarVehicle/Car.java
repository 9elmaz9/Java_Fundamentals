package Les1.CarVehicle;

//subklas
public class Car  extends Vehicle {
//car class field
    private String brandName = "Audi";

    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    //vehicle class methode
    public  void honk(){
        System.out.println("Tuut tuut!");
    }
    public  void  sound(){

        //roept de honk()method van de Vehicle
        super.honk();
    }


    //constractor zonder parametrs

    public Car(){
        //roert de super constructor aan
        super();// altid in eerse line !!!!!!!!!! this en super() kunnen niet samen gebruiken in een constractor
        //Eigen implementatie van de Car constructor
        System.out.println("Car class constructor");
    }
}
