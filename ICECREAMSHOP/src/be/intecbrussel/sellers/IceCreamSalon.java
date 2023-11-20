package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller {
    //properties
    public PriceList priceList;
    public double totalProfit;




//constructor
    public IceCreamSalon() {
    }
    public IceCreamSalon(PriceList priceList, double totalProfit) {
        this.priceList = priceList;
        this.totalProfit = totalProfit;
    }
    public IceCreamSalon(PriceList priceList) {
    }







    @Override
    public double getProfit() {
        return 0;
    }

    @Override
    public Cone orderCone(Flavor[] flavors) {
        Cone newCone = new Cone(flavors);
        totalProfit += priceList.getBallPrice() * 0.25;
        return newCone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket newIce=new IceRocket();
        totalProfit+=priceList.getRocketPrice()*0.20;
        return newIce;
    }

    @Override
    public Magnum orderMagnum(MagnumType){
        Magnum newMagnum=new Magnum();
        totalProfit+=priceList.getMagnumPrice()*0.01;
        return newMagnum;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
