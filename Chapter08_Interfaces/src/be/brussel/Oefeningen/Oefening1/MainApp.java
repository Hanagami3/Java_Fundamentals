package be.brussel.Oefeningen.Oefening1;

public class MainApp {

    public static void main(String[] args) {

        Chest chest1 = new Chest();
        chest1.lock();

        Lock chest2 = new Chest('Y');
        chest2.lock();

        Chest chest3 = new Chest('N');
        chest3.lock();
    }
}
