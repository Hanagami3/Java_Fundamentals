package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Magnum;


public class PriceList {

    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList() {
        this.ballPrice = 2.50;
        this.rocketPrice = 2.99;
        this.magnumStandardPrice = 3.25;

    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }


    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType type) {

        double magnumPrice = magnumStandardPrice;
        switch (type) {
            case MILKCHOCOLATE:
            case WHITECHOCOLATE:
            case BLACKCHOCOLATE:
                magnumPrice *= 1.3;
                break;
            case ALPINENUTS:
                magnumPrice *= 1.5;
                break;
            case ROMANTICSTRAWBERRIES:
                magnumPrice *= 2;
                break;
        }
            return magnumPrice;

    }

}
