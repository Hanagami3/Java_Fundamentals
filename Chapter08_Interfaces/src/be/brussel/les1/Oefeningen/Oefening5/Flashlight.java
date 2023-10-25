package be.brussel.les1.Oefeningen.Oefening5;

public class Flashlight implements Switch, Battery{

    Battery battery = new Flashlight();

    public Flashlight (){

    }

    @Override
    public boolean switchOn() {
        return false;
    }

    @Override
    public void switchColor() {

    }
}
