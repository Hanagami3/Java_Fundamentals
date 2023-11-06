package be.brussel.Project3;

public class DummyPhone implements ISimCard, IRadio{

    private final Double PRICE;
    private final String BRAND;
    private final String COLOR;

    public DummyPhone(Double PRICE, String BRAND, String COLOR){
        System.out.println("Dummy phone");
        this.PRICE = PRICE;
        this.BRAND = BRAND;
        this.COLOR = COLOR;
    }

    public Double getPRICE() {
        return PRICE;
    }

    public String getBRAND() {
        return BRAND;
    }

    public String getCOLOR() {
        return COLOR;
    }

    @Override
    public void playChannel(double fm) {
        if (fm > 110.8)
            System.out.println("The frequency is too big");
        else if (fm < 84)
            System.out.println("The frequency is too small");
        else
            System.out.println("The " + fm + " fm channel playing");
    }

    @Override
    public void changeChannel(double fm) {
        System.out.println("You change the channel for " + fm + " fm channel");
    }

    @Override
    public void startCall(String number) {
        ISimCard.super.startCall(number);
    }

    @Override
    public void endCall() {
        ISimCard.super.endCall();
    }
}
