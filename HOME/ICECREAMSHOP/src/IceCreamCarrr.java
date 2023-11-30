//import be.intecbrussel.eatables.*;

//public class IceCreamCarrr implements IceCreamSeller {
//public PriceList pricelist;
//public Stock stock;
//public double profit;

////constructor
//public IceCreamCarrr(PriceList pricelist, Stock stock) {
//    this.pricelist = pricelist;
//    this.stock = stock;
//}


//@Override
//public IceRocket orderIceRocket() {
//    IceRocket iceRocket=prepareIceRocket();

//    if (iceRocket != null) {
//        profit += pricelist.getRocketPrice() * 0.20;
//    }
//    return iceRocket;
//}

//private IceRocket prepareIceRocket() {
//    if (stock.getIceRockets() > 0) {
//        IceRocket iceRocket=new IceRocket();
//        stock.setIceRockets(stock.getIceRockets() - 1);
//        return iceRocket;
//    }
//    System.out.println("NO MORE ICE CREAM");
//    return null;
//}




//@Override
//public Magnum orderMagnum(Magnum.MagnumType type) {
//    Magnum magnum=prepareMagnum(type);
//    if (magnum!=null){
//        profit +=pricelist.getMagnumPrice(type)*0.01;
//    }
//    return magnum;
//}

//@Override
//public IceRocket orderCone(Cone.Flavor[] balls) {
//    Cone cone= prepareCone(balls);
//    if (cone!=null) {
//        profit += pricelist.getBallPrice() * balls.length * 0.25;
//        return cone;
//    }


//// !!!!
//private Cone prepareCone(Cone.Flavor[] balls) {
//    if (stock.getBalls() >= 0 && stock.getBalls() >= balls.length) {
//        Cone cone = new Cone(balls);
//        stock.setCones(stock.getCones() - 1);
//        stock.setBalls(stock.getBalls() - balls.length);
//        return cone;
//    }
//        System.out.println("NO MORE ICECREAM");
//    return null;

//}







//public Magnum orderMagnum(Magnum.MagnumType type) {
//        Magnum magnum =
//    }
//    if (prepareMagnum()) {
//        double magnumProfit = 0.01;
//        switch (type) {
//            case MILKCHOCOLATE:
//            case WHITECHOCOLATE:
//            case BLACKCHOCOLATE:
//                magnumProfit *= 1.1;
//                break;
//            case ALPINENUTS:
//                magnumProfit *= 1.5;
//                break;
//            case ROMANTICSTRAWBERRIES:
//                magnumProfit *= 2;
//                break;
//        }
//        profit += pricelist.getMagnumPrice(type) * magnumProfit;
//        return new Magnum(type);
//    }
//    return null;
//}


//private boolean prepareMagnum() {
//    if (stock.getMagni() > 0) {
//        stock.setMagni(stock.getMagni() - 1);
//        return true;
//    } else {
//        System.out.println("NO MORE ICE CREAM.Magnum no longer in stock.");
//        return false;
//    }
//}

//@Override
//public double getProfit() {
//    return profit;
//}

//











// @Override
// public Cone orderCone(Cone.Flavor[] flavors) {
//     Cone preparedCone = null;
//     try {
//         preparedCone = prepareCone(flavors);
//     } catch (NoMoreIceCreamException no) {
//