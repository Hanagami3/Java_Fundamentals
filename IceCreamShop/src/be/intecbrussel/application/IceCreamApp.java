package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

import java.util.ArrayList;

public class IceCreamApp {

    public static void main(String[] args) {

        PriceList priceList = new PriceList();
        IceCreamSeller iceCreamSeller = new IceCreamSalon(priceList);

        ArrayList<Eatable> orders = new ArrayList<>();





    }
}
