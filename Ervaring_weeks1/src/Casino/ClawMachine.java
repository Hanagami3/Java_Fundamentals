package Casino;

public class ClawMachine {

    private int numberOfTries;
    private int moneyInTheBank;

    public ClawMachine(){
        this.numberOfTries = 0;
    }

    public int getMoneyInTheBank(){
        return moneyInTheBank;
    }



    private  boolean readyToWin(){
        boolean a = false;
        if (numberOfTries > 5) {
            if (numberOfTries % 5 == 0);
            a = true;
        }
        return a;
    }




    private boolean toWibBigTime(){
        return numberOfTries > 10;
    }



    /*public String playAGame(int moneyPaid){
        moneyInTheBank+= moneyPaid;
        numberOfTries -= 1;
        return String;
    }*/
}
