package be.brussel.les1;

public class WhileLoopExample {

    public static void main(String[] args) {

        int [] numbersArr = {2,4,6,8,10};
        int i = 0;

        while (i < numbersArr.length){
            System.out.println(numbersArr[i]);
            i++;
        }
    }
}
