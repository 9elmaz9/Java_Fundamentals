package Oefening2;

public class Main {
    public static void main(String[] args) {

        //creeren new  CAr obj
        Car myCar = new Car();

        //  test de auto va een en geef gas , zet de auto ann
        myCar.toggleSwitch(); // on auto
        myCar.openDoor(1); // open door

        myCar.gas();// gasss ,but 1 door is open, it doesn't work

        //close the door
        myCar.closeDoor(1);

        myCar.gas(); // work

        myCar.toggleSwitch(); // off the car



    }

}
