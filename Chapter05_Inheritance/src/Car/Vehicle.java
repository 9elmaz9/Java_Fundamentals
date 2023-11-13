package Car;

public class Vehicle {

    private String typeOfVehicle;

    //This will be executed second
    public Vehicle() {
        this("Car");
        System.out.println("Vehicle class no-args constructor");
    }

    //public  void.honk(){
      //  super.honk();
       // System.out.println("Tuut tuut!");
   // }
    //public  void sound(){
      //  super.honk();
    //}

    //This xill be executed first
    public Vehicle(String typeOfVehicle) {
        //this("Car);
        this.typeOfVehicle = typeOfVehicle;
        System.out.println("Constructor Vehicle met parameters");
    }
}

