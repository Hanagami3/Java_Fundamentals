package Casino;

public class SlotMachine {

    private int currentPayout;
    private int odds;

    public SlotMachine() {

    }

    private void whatOddsToGive(){
        if (currentPayout > 1000)
            this.odds = 10;
        else if (currentPayout > 900)
            this.odds = 100;
        else if (currentPayout > 800)
            this.odds = 1000;
        else
            this.odds = 1;
    }

    /*public int playTheSlots (int moneyPutln){

    }*/

    public int getCurrentPayout(){
        return currentPayout;
    }
}
