package Les1.Oefening1Animal;

import Les1.CarVehicle.Vehicle;

public class Hond  extends Vehicle{

        //car class field
        private String brandName = "HOND";

        public String getBrandName() {
            return brandName;
        }
        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }


        //vehicle class methode
        public  void honk(){

            System.out.println("GAF GAF!");
        }
        public  void  sound(){

            //roept de honk()method v
            super.honk();
        }


        //constractor zonder parametrs

        public Hond(){
            //roert de super constructor aan
            super();// altid in eerse line !!!!!!!!!! this en super() kunnen niet samen gebruiken in een constractor
            //Eigen implementatie van de Car constructor
            System.out.println("Car class constructor");
        }
    }


