package CasualGame.DogStory;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {


    private int choice;

    private ArrayList<String> items = new ArrayList<>();

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice, int nbChoice) {
        while (choice <= 0 || choice > nbChoice){
                System.out.println("geen goede keuze");
                choice = scannerChoice();
        }
        this.choice = choice;
    }

    public boolean isItems(String item) {
        boolean getItem = false;
        for (int i = 0; i < items.size();i++)
            if (items.get(i).equals(item))
                getItem = true;
        return getItem;
    }

    public String getItems(int index){
        return items.get(index);
    }

    public void setItems(String item) {
        this.items.add(item);
    }

    public int scannerChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jouw keuze: ");
        while (!scanner.hasNextInt()) {
            System.out.println("geen goede keuze");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public String scannerBijnam(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welke bijnam wil je het geven :");
        return scanner.nextLine();
    }

    public void resultChoice(int choice, String result1, String result2){
        switch (choice){
            case 1 :
                System.out.println(result1);
                break;
            case 2 :
                System.out.println(result2);
                break;
        }
    }

    public void resultChoice(int choice, String result1, String result2, String result3, String result4){
        switch (choice){
            case 1 :
                System.out.println(result1);
                break;
            case 2 :
                System.out.println(result2);
                break;
            case 3 :
                System.out.println(result3);
                break;
            case 4 :
                System.out.println(result4);
                break;
        }
    }

    public void dogdex(String dogName){
        System.out.println("*** DOGDEX ***");
        switch (dogName){
            case "affenpinscher" :
                Affenpinscher affenpinscher = new Affenpinscher();
                System.out.println("Naam: " + affenpinscher.getName() + "\n" +
                        "Levensverwachting: " + affenpinscher.getLifeSpan() + " jaar\n" +
                        "Grootte: " + affenpinscher.getSize() +"\n" +
                        "Vacht: " + affenpinscher.getCoat() +"\n" +
                        "Kleur: " + affenpinscher.getColor());
                System.out.println("Deze dog heeft altijd een Duitse bijnaam");
                break;
            case "bergamasco" :
                Bergamasco bergamasco = new Bergamasco();
                System.out.println("Naam: " + bergamasco.getName() + "\n" +
                        "Levensverwachting: " + bergamasco.getLifeSpan() + " jaar\n" +
                        "Grootte: " + bergamasco.getSize() +"\n" +
                        "Vacht: " + bergamasco.getCoat() +"\n" +
                        "Haar lengte: " + bergamasco.getHairLength() + " cm\n" +
                        "Lopende snelheid max: " + bergamasco.getMaxRunningSpeed() + " m/s");
                System.out.println("Bergamasco is een erg handige hond. \n" +
                        "Ze kunnen op goede snelheid lopen.");
                break;
            case "akita" :
                Akita akita = new Akita();
                System.out.println("Naam: " + akita.getName() + "\n" +
                        "Levensverwachting: " + akita.getLifeSpan() + " jaar\n" +
                        "Grootte: " + akita.getSize() +"\n" +
                        "Vacht: " + akita.getCoat() +"\n" +
                        "Geslacht: " + akita.getGender());
                System.out.println("Het is een erg slimme hond en gehoorzaamt nooit bevelen. \n" +
                        "Het heeft een vrije ziel. Je kunt hem nooit laten zitten. \n" +
                        "Het geslacht voor dit hondenras is erg belangrijk. \n" +
                        "De mannen zijn groter");
                break;
            case "pekingese" :
                Pekingese pekingese = new Pekingese();
                System.out.println("Naam: " + pekingese.getName() + "\n" +
                        "Levensverwachting: " + pekingese.getLifeSpan() + " jaar\n" +
                        "Grootte: " + pekingese.getSize() +"\n" +
                        "Vacht: " + pekingese.getCoat() +"\n" +
                        "Haar lengte: " + pekingese.getHairLength() + " cm");
                System.out.println("Pekingese heeft lange haren daarom ze er zo cool uitzien.");
        }
    }

    public boolean funnyFace(int choice){
        boolean funnyFace = false;
        if (choice == 1)
            funnyFace = true;
        return funnyFace;
    }
    public void gameOver(){
        System.out.println();
        System.out.println("Sorry! Game over\n" +
                "Dank u wel om deze kleine speel te spelen");
        System.exit(0);
    }


}


