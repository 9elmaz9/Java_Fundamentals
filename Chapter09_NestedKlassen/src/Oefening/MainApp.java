package Oefening;

public class MainApp {
    public static void main(String[] args) {
//creerern obj met var
        OuterClass outerClass = new OuterClass(5,10);
        OuterClass.MathFunction mathFunctions=outerClass.new MathFunction(); // new obj maken


        System.out.println("Sum : " + mathFunctions.sum());
        System.out.println("Min : " + mathFunctions.min());
        System.out.println("Max : " + mathFunctions.max());


        System.out.println("Product :" + mathFunctions.product());
        System.out.println("Division :"+ mathFunctions.division());


    }
}
