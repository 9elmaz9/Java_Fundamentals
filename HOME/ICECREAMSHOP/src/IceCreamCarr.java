// import be.intecbrussel.eatables.Cone;
// import be.intecbrussel.eatables.IceRocket;
// import be.intecbrussel.eatables.Magnum;

//public class IceCreamCarr implements IceCreamSeller{

// public PriceList pricelist;
// public Stock stock;
// public  double profit;


// public PriceList getPricelist() {
//     return pricelist;
// }

// public void setPricelist(PriceList pricelist) {
//     this.pricelist = pricelist;
// }

// public Stock getStock() {
//     return stock;
// }

// public void setStock(Stock stock) {
//     this.stock = stock;
// }

// public IceCreamCarr(PriceList pricelist, Stock stock) {
//     this.pricelist = pricelist;
//     this.stock = stock;
// }






// @Override
// public Cone orderCone(Cone.Flavor[] flavors) {
//     double ballPrice =pricelist.getBallPrice();
//     int stockBalls=stock.getBalls();
//     int stockCone =stock.getCones();
//     if (stockBalls>flavors.length && stockCone>0){
//         this.profit +=ballPrice* flavors.length;
//         stock.setBalls(--stockBalls);
//         stock.setCones(--stockCone);
//     }
//     if (stockBalls <flavors.length && stockCone==0) {
//         throw new NoMoreIceCreamException("no more");
//     }
//     if (stockBalls<flavors.length){
//         throw new NoMoreIceCreamException("no more");
//     }
//     if (stock.getCones() <=0) {
//         throw  new NoMoreIceCreamException("no more");
//     }
//     return new Cone(flavors);
// }




// @Override
// public IceRocket orderIceRocket() {
//     return null;
// }

// @Override
// public Magnum orderMagnum(Magnum.MagnumType type) {
//     return null;
// }

// @Override
// public double getProfit() {
//      return 0;
//  }
// }
