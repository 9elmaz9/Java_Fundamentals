package Oefening4;

public class MainApp {
    public static void main(String[] args) {

        //Upcasting  CHILD TO PARENT
        Vehicle car = new Car();
        Vehicle moto = new Moto();
        Vehicle truck = new Truck();

        //  Accesing method throw DOWNCASTING
        car.start(); // car.drive();
        moto.start(); // moto.snel();
        truck.start(); // truck.groot();


        //Downcasting  PARENT TO CHILD  : VEHICLE TO TRANSPORT

        Car myCar = (Car) car;
        Moto myMoto = (Moto) moto;
        Truck myTruck = (Truck) truck;

        // Accesing method throw DOWNCASTING
        myMoto.snel();
        myTruck.langzaam();
        myCar.drive();


    }

}
