package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {
        //Maak een PriceList instantie aan.
        PriceList priceList=new PriceList();

        //Maak een IceCreamSalon instantie aan met behulp van de pricelist en steek deze in een
        //IceCreamSeller variabele
        IceCreamSalon iceCreamSalon=new IceCreamSalon(priceList);




    }
}
