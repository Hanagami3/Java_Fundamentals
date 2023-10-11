package be.brussel.les2.Oefeningen3;

public class Oefening2 {

    public static void main(String[] args) {

        String [] firstArray = {"Intec", "is", "the", "best!"};
        String [] secondArray = {"C#", "is", "the", "worst!"};

        if (firstArray.length == secondArray.length)
            System.out.println("De lengte van de twee arrays zijn gelijk");
        else
            System.out.println("De lengte van de twee arrays zijn niet gelijk");

        String firstString = String.join(" ",secondArray);
        String secondString = String.join(" ",firstArray);

        System.out.println();
        System.out.println(firstString);
        System.out.println(secondString);



    }
}
