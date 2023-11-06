package be.brussel.Project3;

public interface ISimCard {

    default void startCall(String number){
        if (number.equals(""))
            System.out.println("Calling 911");
        else
            System.out.println("Calling: " + number);
    }

    default void endCall(){
        System.out.println("Call ended");
    }
}
