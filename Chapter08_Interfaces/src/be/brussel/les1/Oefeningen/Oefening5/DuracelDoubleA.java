package be.brussel.les1.Oefeningen.Oefening5;

import be.brussel.les1.Oefeningen.Oefening2.Switch1;

public class DuracelDoubleA implements Battery{

    public DuracelDoubleA(){
        System.out.println("Je ontvangt een Duracel Double A");
        System.out.println("Je hebt " + deliverPower() + " power");
    }
    @Override
    public int deliverPower() {
        return 100;
    }
}
