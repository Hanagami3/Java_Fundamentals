package Casino;

import java.util.Random;

public class Lotto {

    private int numbre1;
    private int numbre2;
    private int numbre3;
    private int currentPayout;
    private boolean didYouWin;

    public Lotto(){
    this.didYouWin = false;
    }

    private int rollRandomNumbers(){

        Random random = new Random();
        int x = random.nextInt(10);
        System.out.println(x);
        return x;

    }

    public void compareNumers(int number1, int number2, int number3){
        if (number1 == rollRandomNumbers() || number2 == rollRandomNumbers() || number3 == rollRandomNumbers())
            didYouWin = true;
        System.out.println(didYouWin);
    }

    //public int getNumers (int number1, int numbre2, int numbre3, int moneyPutln){
    //    return
    //}
}
