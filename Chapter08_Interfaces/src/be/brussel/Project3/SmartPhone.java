package be.brussel.Project3;

public class SmartPhone implements ICamera, Igps, IRadio, ISimCard, IWifi{

    private final double PRICE;

    private final String BRAND;

    private int numberOfPhoto;

    public SmartPhone(double PRICE, String BRAND){
        this.PRICE = PRICE;
        this.BRAND = BRAND;
    }

    public double getPRICE() {
        return PRICE;
    }
    public String getBRAND() {
        return BRAND;
    }

    @Override
    public void shootAPhoto(double amountOfPhoto) {
        System.out.println("The phone takes " + amountOfPhoto + " pictures");
        numberOfPhoto+=amountOfPhoto;
    }

    @Override
    public String[] viewPhotos() {
        String[] photos = new String[numberOfPhoto];
        for (int i = 0; i < photos.length; i++)
            photos[i] = "Photo n°" + i;
        return photos;
    }

    @Override
    public String locate(double latitude, double longitude) {
        return "you have enter the coordinates:\n" +
                "lat = " + latitude + "long = " + longitude;
    }

    @Override
    public void navigate() {
        System.out.println("you're navigating to this place");
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
    public void connect(String internetConnection) {
        System.out.println("The phone is connected to the wifi " + internetConnection);
    }

    @Override
    public void disconnect(String internetConnection) {
        System.out.println("The phone is disconnected to the wifi " + internetConnection);
    }

}

