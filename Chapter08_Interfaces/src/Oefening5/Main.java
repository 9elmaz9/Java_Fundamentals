package Oefening5;

public class Main {
    public static void main(String[] args) {

        // creating battery instances =экземпляры батареи

        Battery1 duracelDoubleA = new DuracelDoubleA1();
        duracelDoubleA.deliverPover();

        Battery1 duracelTripleA = new DuracelTripleA1();
        duracelTripleA.deliverPover();

        Battery1 vartaDoubleA =new VartaDoubleA1();
        vartaDoubleA.deliverPover();


         // Making  flashlight
        Flashlight flashlightWithDuracrl = new Flashlight(duracelDoubleA);
        Flashlight flashlightWithVarta= new Flashlight(vartaDoubleA);


        //  useFlashlight call deliver.pover   includes from inside
        //Turning on a flashlight using batteries , demonstration operation
        flashlightWithDuracrl.useFlashlight();
        flashlightWithVarta.useFlashlight();



        //System.out.println("DuracelDouble1 battery is "+duracelDoubleA.deliverPover());
        //System.out.println("DuracelTripleA1 battery is" +duracelTripleA.deliverPover());
        //System.out.println("VartaDouble1 battery is " + vartaDoubleA.deliverPover());


    }
}


