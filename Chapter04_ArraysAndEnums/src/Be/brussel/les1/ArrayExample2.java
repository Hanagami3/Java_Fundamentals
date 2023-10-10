package Be.brussel.les1;

public class ArrayExample2{

    public static void main(String[] args) {

        int[] myArr = {100, 200, 300, 400, 500};

        for (int i = 0; i < myArr.length; i++)
            System.out.println("In de array, in plaats n°" + (i+1) + ": " + myArr[i] );

        System.out.println();
        for(int elements : myArr)
            System.out.print(elements + " ");
    }
}
