package be.brussel.les1.Opdracht1;

public class GarageApp {

    public static void main(String[] args) {

        int amountAcc = 50;


        Cabrio cabrio = new Cabrio();
        System.out.println("Cabrio ");
        cabrio.setColor("bleu");
        System.out.println("Color: " + cabrio.getColor());
        System.out.println("Hp: " + cabrio.getHp());
        System.out.println("Sunroof: " + cabrio.isSunroof());
        cabrio.openRoof();
        cabrio.accelerate(cabrio.getSpeed());
        cabrio.setSpeed(50);
        System.out.println("Speed: " + cabrio.getSpeed());
        System.out.println();

        SUV sUV = new SUV();
        System.out.println("SUV");
        System.out.println("Color: " + sUV.getColor());
        sUV.setBullbar(true);
        System.out.println("Bullbar: " + sUV.isBullbar());
        sUV.allWheelDrive(true);
        sUV.accelerate(sUV.getSpeed());
        sUV.setSpeed(50);
        System.out.println("Speed: " + sUV.getSpeed());
        System.out.println();

        ElectricCar electricCar = new ElectricCar();
        System.out.println("Electric car");
        System.out.println("Color: " + electricCar.getColor());
        electricCar.charge(electricCar.getBattery());
        electricCar.accelerate(electricCar.getSpeed());
        electricCar.setSpeed(50);
        System.out.println("Speed: " + electricCar.getSpeed());

    }
}
