package Oefeningen6.Oefening3;

public enum HolidayDestinatie {
    POLEN,
    JAPAN,
    CONGO,
    IRAN,
    VS,
    TURKIJE,
    BELGIË,
    FRANKRIJK,
    ALBANIË,
    DENEMARKEN;

    void getDestinatie(HolidayDestinatie holidayDestinatie){

        switch (CONGO){
            case POLEN:
                System.out.println("Polen ligt in Europa");
                break;
            case JAPAN:
                System.out.println("Japan ligt in Azië");
                break;
            case CONGO:
                System.out.println("Congo ligt in Afrika");
                break;
            case IRAN:
                System.out.println("Iran ligt in Azië");
                break;
            case VS:
                System.out.println("VS ligt in Amerika");
                break;
            case TURKIJE:
                System.out.println("Turkije ligt in Azië");
                break;
            case BELGIË:
                System.out.println("België ligt in Europa");
                break;
            case FRANKRIJK:
                System.out.println("Frankrijk ligt in Europa");
                break;
            case ALBANIË:
                System.out.println("Albanië ligt in Europa");
                break;
            case DENEMARKEN:
                System.out.println("Denemarken ligt in Europa");
                break;
            default:
                System.out.println("Geen info aver die land");
        }
    }
}

