package be.brussel.les1.Oefeningen.Oefening5;

public class VartaDoubleA implements Battery{

    public VartaDoubleA(){
        System.out.println("Je ontvangt een Varta Double A");
        System.out.println("Je hebt " + deliverPower() + " power");
    }
    @Override
    public int deliverPower() {
        return 50;
    }
}
