package be.brussel.Project3;

import java.util.Arrays;

public class WhyPhoneApp {


    public static void main(String[] args) {

        WhyPhone phone = new WhyPhone (250.5,"Apple","White");
        showSpecs(phone);

        System.out.println();

        DummyPhone gsm = new DummyPhone(75d, "Nokia","Black");
        showSpecs(gsm);
    }

    public static void showSpecs(SmartPhone phone){

        System.out.println("Price: " + phone.getPRICE() + " $");
        System.out.println("Brand: " + phone.getBRAND());
        phone.getCOLOR();
        phone.shootAPhoto(3);
        System.out.println(Arrays.deepToString(phone.viewPhotos()));
        System.out.println(phone.locate(50.84223807746832, 4.347273431438504));
        phone.navigate();
        phone.playChannel(90.4);
        phone.changeChannel(93.8);
        phone.startCall("065/36.20.92");
        phone.endCall();
        phone.connect("StartProjecten.z5");
        phone.disconnect("StartProjecten.z5");
    }

    public static void showSpecs(DummyPhone gsm){
        System.out.println("Price: " + gsm.getPRICE() + " $");
        System.out.println("Brand: " + gsm.getBRAND());
        System.out.println("Color: " + gsm.getCOLOR());
        gsm.startCall("");
        gsm.endCall();
        gsm.playChannel(111.2);
        gsm.changeChannel(108.4);
    }
}
