package Les1.CarVehicle;

//super class
public class Vehicle {
    //Vehicle class field
    private String typeOfVehicle = "Car";

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    //Vehicle class methode
    public void honk() {
        System.out.println("Toet toet!");

        System.out.println("Vehicle class constructor");
    }

}


