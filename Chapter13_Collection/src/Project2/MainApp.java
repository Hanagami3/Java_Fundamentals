package Project2;

import javax.crypto.spec.PSource;
import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        PostCard belgium = new PostCard("Belgium", "Europe");
        PostCard france = new PostCard("France", "Europe");
        PostCard japan = new PostCard("Japan", "Asia");
        PostCard rdc = new PostCard("Democratic Republic of Congo", "Africa");
        PostCard southKorea = new PostCard("South Korea", "Asia");
        PostCard belgium2 = new PostCard("Belgium", "Europe");
        PostCard southAfrica = new PostCard("South Africa", "Africa");
        PostCard france2 = new PostCard("France", "Europe");
        PostCard belgium3 = new PostCard("Belgium", "Europe");
        PostCard usa = new PostCard("United States of America", "North America");
        PostCard canada = new PostCard("Canada", "North America");
        PostCard peru = new PostCard("Peru", "South America");
        PostCard samoa = new PostCard("Samoa", "Oceania");
        PostCard belgium4 = new PostCard("Belgium", "Europe");
        PostCard france3 = new PostCard("France", "Europe");

        List<PostCard> yourPostCardList = new ArrayList();
        yourPostCardList.add(belgium);
        yourPostCardList.add(france);
        yourPostCardList.add(japan);
        yourPostCardList.add(rdc);
        yourPostCardList.add(southKorea);
        yourPostCardList.add(belgium2);
        yourPostCardList.add(southAfrica);
        yourPostCardList.add(france2);
        yourPostCardList.add(belgium3);
        yourPostCardList.add(usa);
        yourPostCardList.add(canada);
        yourPostCardList.add(peru);
        yourPostCardList.add(samoa);
        yourPostCardList.add(belgium4);
        yourPostCardList.add(france3);

        //your friend’s cards
        PostCard northKorea = new PostCard("North Korea", "Asia");
        PostCard usa2 = new PostCard("United States of America", "North America");
        PostCard botswana = new PostCard("Botswana", "Africa");
        PostCard northKorea2 = new PostCard("North Korea", "Asia");

        List<PostCard> yourFriendsPostCardList = new ArrayList();
        yourFriendsPostCardList.add(northKorea);
        yourFriendsPostCardList.add(usa2);
        yourFriendsPostCardList.add(botswana);
        yourFriendsPostCardList.add(northKorea2);

        //your friends
        Friend bobby = new Friend("Bobby", false, 3, 5);
        Friend melissa = new Friend("Melissa", false, 1, 6);
        Friend darla = new Friend("Darla", true, 14, 2);
        Friend bert = new Friend("Bert", false, 10, 4);
        Friend grandma = new Friend("Nana", true, 12, 7);
        Friend fester = new Friend("Fester", false, 1, 2);
        Friend anna = new Friend("Anna", false, 8, 4);


//-----Opdracht1---------

        // Ik weet zeker dat er een betere manier was, maar ik heb het niet gevonden
        // en het werkt niet good als de vriend meerdere duplicaten heeft
        Set<PostCard> yourPostCardDuplicate = new HashSet<>();
        Set<PostCard> yourFriendPostCardDuplicate = new HashSet<>();

        do {
            for (int i = 0; i < yourPostCardList.size(); i++) {
                for (int j = 0; j < yourPostCardList.size(); j++) {
                    if (yourPostCardList.get(i).equals(yourPostCardList.get(j)) && i != j)
                        yourPostCardDuplicate.add(yourPostCardList.get(j));
                }
            }

            for (int i = 0; i < yourFriendsPostCardList.size(); i++) {
                for (int j = 0; j < yourFriendsPostCardList.size(); j++) {
                    if (yourFriendsPostCardList.get(i).equals(yourFriendsPostCardList.get(j)) && i != j)
                        yourFriendPostCardDuplicate.add(yourFriendsPostCardList.get(j));
                }
            }
            for (int i = 0; i < yourPostCardList.size(); i++) {
                if (yourPostCardDuplicate.contains(yourPostCardList.get(i)))
                    for (int j = 0; j < yourFriendsPostCardList.size(); j++)
                        if (yourFriendPostCardDuplicate.contains(yourFriendsPostCardList.get(j)) || !(yourPostCardList.contains(yourFriendsPostCardList.get(j)))) {
                            PostCard CardTemp = yourPostCardList.get(i);
                            yourPostCardList.remove(i);
                            yourPostCardList.add(i, yourFriendsPostCardList.get(j));
                            yourFriendsPostCardList.remove(j);
                            yourFriendsPostCardList.add(j, CardTemp);
                            yourFriendPostCardDuplicate.remove(yourFriendsPostCardList.get(j));
                            yourPostCardDuplicate.remove(yourPostCardList.get(i));
                        }
            }
        } while (!(yourFriendPostCardDuplicate.isEmpty() || yourPostCardDuplicate.isEmpty()));


        System.out.println("my cards: " + yourPostCardList);
        for (PostCard cards : yourFriendsPostCardList)
            System.out.println(cards);
//------Opdracht2----

        System.out.println();
        yourPostCardList.sort(Comparator.comparing(PostCard::getCountry));

        System.out.println("\nPost card list sorted bij country");
        for (PostCard cards : yourPostCardList)
           System.out.println(cards);


// -----Opdracht 3 -----

        List<PostCard> yourDuplicateList = new LinkedList<>();
        for (int i = 0; i < yourPostCardList.size(); i++) {
            if (Collections.frequency(yourPostCardList, yourPostCardList.get(i)) >= 2) {
                int frequency = Collections.frequency(yourPostCardList, yourPostCardList.get(i));
                if (!yourDuplicateList.contains(yourPostCardList.get(i))) {
                    for (int j = 1; j < frequency; j++) {
                        yourDuplicateList.add(yourPostCardList.get(i));
                    }
                }
            }
        }

        System.out.println("\nNumber of duplicate: " + yourDuplicateList.size());
        System.out.println("List without duplicate");
        Set<PostCard> yourNewPostCardList = new HashSet<>(yourPostCardList);
        System.out.println(yourNewPostCardList);

// ---- Opdracht 4 -----

        PriorityQueue <Friend> sortedFriends = new PriorityQueue<>(Comparator.comparing(Friend::isFamily)
                // ik had liever gehad niet deze "5" gebruiken, maar ik heb niet meer tijd heb
                .thenComparing((x) -> x.getFriendShipLevel() > 5)
                .thenComparing(Friend::getYearsKnown).reversed());

        sortedFriends.offer(bobby);
        sortedFriends.offer(melissa);
        sortedFriends.offer(darla);
        sortedFriends.offer(bert);
        sortedFriends.offer(grandma);
        sortedFriends.offer(fester);
        sortedFriends.offer(anna);

        System.out.println("\nFriend List sorted: ");
        while (!(sortedFriends.isEmpty()))
            System.out.println(sortedFriends.poll());



    }
}
