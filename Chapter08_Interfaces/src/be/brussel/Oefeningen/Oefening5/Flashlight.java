package be.brussel.Oefeningen.Oefening5;

public class Flashlight{

    public Flashlight (int battery){
        if (battery == 1)
            getBatteryDDA();
        else if (battery == 2)
            getBatteryVDA();
        else System.out.println("Je hebt geen battery");

    }
    public void getBatteryDDA(){
        Battery batteryDDA = new DuracelDoubleA();
    }
    public void getBatteryVDA(){
        Battery batteryVDA = new VartaDoubleA();
    }

    }