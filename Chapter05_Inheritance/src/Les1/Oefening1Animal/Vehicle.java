package Les1.Oefening1Animal;

public class Vehicle {
    //Vehicle class field
    private String typeOfVehicle = "Dieren";

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    //Vehicle class methode
    public void honk() {
        System.out.println("!");

        //System.out.println("Vehicle class constructor");
    }

}

