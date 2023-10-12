package be.brussel.les6.Opdracht3;

public class Oefening2 {

    /* Ik weet niet zeker of ik het begreep. Volgens mij, moet je de 20 in de friendship rank bereiken om een korting te krijgen.
    Dan kan je een andere verkoper gaan zien.
     */

    public static void main(String[] args) {

        byte cadeautje = 43;  //aantal cadeautjes in het begin
        byte friendShipRank = 0;
        byte korting = 0; //de antaal kortingen die je kreeg als je 20 in de friendship rank bereikt

        // een lusdraai is gelijk aan een cadeautje geven
        do {
            //je geeft een cadeautje dus de FSR wordt verhoogt
            cadeautje--;
            friendShipRank++;
            System.out.println("Je geeft 1 cadeautje and je friendship rank is : " + friendShipRank);


            //de EXTRA: elk veelvoud van 5 in de FSR, krijg je een extra FSR
            if (friendShipRank % 5 == 0) {
                friendShipRank++;
                System.out.println("Je kreeg een extra friendship rank");
            }

            //Je krijgt de korting als de FSR == 20 en de waarde van FRS keert terug naar de resuult minder 20
            if (friendShipRank >= 20){//
                korting++;
                friendShipRank -= 20;
            }
        }while (cadeautje > 0);
        System.out.println();
        System.out.println("Je hebt " + korting + " kortingen gekregen");
    }
}
