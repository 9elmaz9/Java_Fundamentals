package Oefening2;

public class Car implements Vehicle { // class car inmp Motor, motor class extend switch

    private boolean isCarOn;
    private boolean areDoorsOpen;
    //private boolean[] doorsState; // sostoyanie dverey -niet nodig

    public Car() { //consructor for initialisation autostate
        isCarOn = false;
        areDoorsOpen = false;
    }

    @Override // implement de toggleSwitch() van de Switch  intersf
    public void toggleSwitch() {//переключатель
        isCarOn = !isCarOn; // Zorg voor een controle dat je enkel gas kan geven als de wagen aan staat ,
        // een toggleSwitch ()
        System.out.println(" The car is " + (isCarOn ? " on " : " off "));

    }

    public void gas() { // implem de gas() from votor () & , now vehicle
        if (isCarOn && !areDoorsOpen) {
            //boolean == closeDoor();// als on - true is
            System.out.println(" The car is rides!"); // on
        } else { // als no
            System.out.println("Can't gas , the car is off or doors are open!"); // can't gas , off


        }
    }

    @Override // als door closed
    public void closeDoor(int doors) {
        //doorsState[doors] = false;
        // System.out.println("Door" + doors + "is closed");
        System.out.println("Door" + doors + "is closed");
        areDoorsOpen = false;


    }

    @Override // als door open  () from vehicle
    public void openDoor(int doors) { // OPEN DOOOR
        if (isCarOn) {
            //doorsState[doors] = true;
            // System.out.println("Door" + doors + " is open");
            //} else {
            //System.out.println("Can't open door the car is off ");
            System.out.println("Door" + doors + " is open");
            areDoorsOpen = true;

        }
    }
}



