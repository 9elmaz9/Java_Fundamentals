package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller{
    public PriceList priceList;
    public Stock stock;
    public  double profit;


    @Override
    public Cone orderCone(Flavor[] flavors) {
        return null;
    }

    public Cone prepareCone(Flavor[] flavors) {        return null;

    }




    @Override
    public IceRocket orderIceRocket() {
        return null;
    }
    public IceRocket prepareIceRocket() {
        return null;
    }





    @Override
    public Magnum orderMagnum(MagnumType) {
        return null;
    }
    public Magnum prepareMagnum(MagnumType) {
        return null;
    }



    @Override
    public double getProfit() {
        return 0;
    }
}
