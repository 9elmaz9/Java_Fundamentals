package Les1.CarVehicle;

import Les1.CarVehicle.Car;

//Main APP
public class CarApp {

    public static void main(String[] args) {

        //Creeert myCar object
        Car myCar = new Car();

        //Drukt de waarde af van type of vegicle van Vehicle class en brandname van Car class
        System.out.println("This vrhicle is an :" + myCar.getTypeOfVehicle() + "\nThe brand is :" + myCar.getBrandName());

        //Roept sound() methode op van car class. Dit roept de methode honk() van Vehicle class.
        myCar.sound();

        //Hier word honk()methode van Car class opgeroepen
        myCar.honk();
    }


    //creert myCar object
    Car myCar=new Car();
}

