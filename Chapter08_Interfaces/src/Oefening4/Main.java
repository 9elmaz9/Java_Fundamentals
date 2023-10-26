package Oefening4;

public class Main {
    public static void main(String[] args) {

        // // creating battery instances =экземпляры батареи

        Battery duracelDoubleA = new DuracelDoubleA();
        duracelDoubleA.deliverPover();

        Battery duracelTripleA = new DuracelTripleA();
        duracelTripleA.deliverPover();


        Battery vartaDoubleA =new VartaDoubleA();
        vartaDoubleA.deliverPover();


        System.out.println("DuracelDouble battery is "+duracelDoubleA.deliverPover());
        System.out.println("DuracelTripleA battery is" +duracelTripleA.deliverPover());
        System.out.println("VartaDouble battery is " + vartaDoubleA.deliverPover());



    }
}

