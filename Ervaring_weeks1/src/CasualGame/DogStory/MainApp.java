package CasualGame.DogStory;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        Player player = new Player();

        System.out.println("Welkom");
        System.out.println("je wandelt in het bos! Maar net! je hoort een raar lawaai! ");
        Wolf wolf = new Wolf();
        wolf.makeNoise();
        System.out.println("Wat wil je doen?\n" +
                "1: Stap naar het geluid\n" +
                "2: loop naar het einde van het bos?");
        player.setChoice(player.scannerChoice(),2);
        player.resultChoice(player.getChoice(),
                "je stapt",
                "je loopt");

        if (player.getChoice() == 1){
            System.out.println("Je gaat naar het geluid en je ziet een wolf.\n" +
                    "je komt nog dichterbij... Ben je bang?\n" +
                    "1: Ja\n" +
                    "2: Nee");
            player.setChoice(player.scannerChoice(), 2);
            player.resultChoice(player.getChoice(),
                    "Je stopt voor de wolf",
                    "Je reikt je hand om de wolf te aaien");
            if (player.getChoice() == 1){
                wolf.makeNoise("GRRRRRRR");
                System.out.println("De wolf voelt je bang en je keert terug");
            }
            if (player.getChoice() == 2) {
                wolf.makeNoise("'je bent erg draper. Mijn name is 'Rufus de wolf'\n" +
                        "'Ik geef je deze steen, bewaar het zorgvuldig'");
                wolf.setName("Rufus de wolf");
                player.setItems("steen");
                System.out.println("Je bedankt " + wolf.getName() + " en neemt de steen" );
           }
            System.out.println("Het is laat en je wilt naar je huis terug gaan");
            player.setChoice(1,1);
        }

        if (player.getChoice() == 2){
            System.out.println("Je loopt door het bos.\n" +
                    "Na een tijd hoor je iets.");
            Dog dog = new Dog();
            dog.bark();
            WildDog wildDog = new WildDog();
            System.out.println("\nOef! Het is een echt dog.\n" +
                    "Je stopt met lopen en je kijkt rond... en ineens zie je het.\n" +
                    "Het is een " + wildDog.getSize() + " " + wildDog.getName() + "\n" +
                    "Het lijkt lief. Je wilt een naam geven.");
            wildDog.setName(player.scannerBijnam());
            System.out.println("Nu is zijn naam : " + wildDog.getName() + "\n" +
                    "Het lijkt ook slim.\n" +
                    "je toont een nummer met je vingers : ");
            player.setChoice(player.scannerChoice(), 10);
            wildDog.bark(player.getChoice());
            System.out.println("\nWil je " + wildDog.getName() + " sturen om te jagen?\n" +
                    "1 : Ja\n" +
                    "2: Nee");
            player.setChoice(player.scannerChoice(), 2);
            player.resultChoice(player.getChoice(),
                    wildDog.getName() + " goes hunting...",
                    "Je speelt met " + wildDog.getName());
            if (player.getChoice() == 1) {
                String ResultHunt = wildDog.hunt();
                System.out.println(ResultHunt);
                String[] resultHuntArray = ResultHunt.split(" ");
                if (resultHuntArray[resultHuntArray.length-1].equals("!")) {
                    player.setItems(resultHuntArray[resultHuntArray.length - 2]);
                    System.out.println(player.getItems(0));
                }
            }
            System.out.print("Politie agent: 'Wat doe je hier met die hond?'\n" +
                    "'Wat verstop je achter je rug?'\n" +
                    "de politieagent kijkt achter je rug en hij vindt ");
            if (player.isItems("deer") || player.isItems("duck") || player.isItems("mouse")) {
                System.out.println("een " + player.getItems(0));
                System.out.println("Het is verboden te jagen in die bos!\n" +
                        "kom met mij naar het commissariaat");
                player.gameOver();
            }
            else {
                System.out.println("niets");
                System.out.println("Ok kan je vertrekken.");
                //attack BelgianMalinois
            }
        }
        HomelyDog homelyDog = new HomelyDog();
        System.out.println("Je verlaat het bos en gaat naar de stad.\n" +
                "Onderweg ontmoet je een " + homelyDog.getSize() + " " + homelyDog.getName() + ".\n" +
                homelyDog.getName() + ": 'Hallo mijn naam is Oscar'");
        homelyDog.setName("Oscar");
        System.out.println(homelyDog.getName() + ": Ik weet dat je veel rare ontmoetingen maakte.\n" +
                homelyDog.getName() + ": 'Dit is voor jou, om mijn broers en zussen gemakkelijker te herkennen.'\n" +
                homelyDog.getName() + ": 'Tot Straks.'\n" +
                "Je neemt de 'Dogdex'");
        System.out.println("Je komt in stad en je ziet een stuk suiker.\n" +
                "Neem je het?\n" +
                "1 : Ja\n" +
                "2: Nee");
        player.setChoice(player.scannerChoice(), 2);
        player.resultChoice(player.getChoice(),
                "Je hebt de suiker genomen",
                "Je hebt de suiker niet genomen");
        if (player.getChoice() == 1)
            player.setItems("suiker");
        System.out.println("je komt aan op het stadsplein");
        if (player.isItems("steen"))
            System.out.println("Wanneer je in een plein staat, begint de steen te schijnt!\n" +
                    "De steen toont je de weg naar links.");
        System.out.println("Waar wil je gaan: \n" +
                "1: Naar rechts\n" +
                "2: Rechtdoor\n" +
                "3: Naar links\n" +
                "4: Naar je huis");
        player.setChoice(player.scannerChoice(),4);
        player.resultChoice(player.getChoice(),
                "Je gaat naar rechts",
                "Je gaat rechtdoor",
                "Je gaat naar links",
                "Je bent thuis");

        if (player.getChoice() == 1){
            Affenpinscher affenpinscher = new Affenpinscher();
            System.out.println("Je ontmoet een dog en je haalt je 'Dogdex' uit");
            player.dogdex("affenpinscher");
            System.out.println("Je geeft aan de hond a bijnaam : ");
            Affenpinscher affenpinscherBijnam = new Affenpinscher(player.scannerBijnam());
            System.out.println(affenpinscherBijnam.getNickname() + " ruikt aan je zakken en...");
            if (player.isItems("suiker"))
                System.out.println(affenpinscherBijnam.getNickname() + " vindt een stuk suiker!");
            else
                System.out.println(affenpinscherBijnam.getNickname() + " vindt niets!");
            affenpinscher.dance(player.isItems("suiker"));
            System.out.println("Je bent moe en je besluit naar huis te gaan.\n ");
        }
        else if (player.getChoice() == 2){
            Pekingese pekingese = new Pekingese();
            System.out.println("Je ontmoet een dog en je haalt je 'Dogdex' uit");
            player.dogdex("pekingese");
            System.out.println("Je vindt dat deze hond een gek gezicht\n" +
                    "wil je ook een gek gezicht maken?\n" +
                    "1. ja\n" +
                    "2. Nee");
            player.setChoice(player.scannerChoice(),2);
            pekingese.play(player.funnyFace(player.getChoice()));
            System.out.println("Je bent moe en je besluit naar huis te gaan.\n ");

        }
        else if (player.getChoice() == 3){
            Akita akita = new Akita();
            System.out.println("Je ontmoet een dog en je haalt je 'Dogdex' uit");
            player.dogdex("akita");
            System.out.println("Je bent moe en je besluit naar huis te gaan.\n ");
        }

            Bergamasco bergamasco = new Bergamasco("Bobbie");
            System.out.println("Je ziet " + bergamasco.getName() + " en je haalt je 'Dogdex' uit");
            player.dogdex("bergamasco");
            bergamasco.kiss();

    }

}