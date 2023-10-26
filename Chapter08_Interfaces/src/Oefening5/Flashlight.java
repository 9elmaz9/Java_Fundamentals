package Oefening5;

public class Flashlight {
//interface Battery als datatype
    private Battery1 battery1;

    public Flashlight(Battery1 battery1){
        this.battery1=battery1;
    }

    public void useFlashlight () {

        // using a battery  in a  flashlight
        int power= battery1.deliverPover();
        System.out.println(" Flashlight with in use with power : " + power);
    }
}


    

