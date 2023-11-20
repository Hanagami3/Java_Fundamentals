package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller{

    private PriceList priceList;
    private double totalProfit =0;

    public IceCreamSalon(){
        priceList  = new PriceList();
    }

    public IceCreamSalon(PriceList priceList){
        this.priceList = priceList;
    }


    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] balls) {
        Cone cone = new Cone();
        totalProfit += priceList.getBallPrice() * 0.25;
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket = new IceRocket();
        totalProfit += priceList.getRocketPrice() * 0.2;
        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        Magnum magnum = new Magnum(type);
        totalProfit += priceList.getMagnumPrice(type) * 0.01;
        return magnum;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
