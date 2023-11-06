package be.brussel.Oefeningen.Oefening5;

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
