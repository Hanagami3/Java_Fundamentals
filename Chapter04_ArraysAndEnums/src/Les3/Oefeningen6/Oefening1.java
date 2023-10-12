package be.brussel.Les3.Oefeningen6;

public enum Oefening1 {

    MAANDAG,
    DINSDAG,
    WOENSDAG,
    DONDERDAG,
    VRIJDAG,
    ZATERDAG,
    ZONDAG;

    public static void main(String[] args) {

       Oefening1[] weekDag = Oefening1.values();

       for( Oefening1 dag : weekDag)
           System.out.println(dag.toString().toLowerCase() + " is de dag n°" + dag.ordinal() + " van de week");
    }
}


