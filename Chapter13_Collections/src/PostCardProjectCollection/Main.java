package PostCardProjectCollection;

import Project2.PostCard;

import java.util.*;

public class Main {
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


        List<PostCard> yourFriendsPostCardList = new ArrayList<>();
        yourFriendsPostCardList.add(northKorea);
        yourFriendsPostCardList.add(usa2);
        yourFriendsPostCardList.add(botswana);
        yourFriendsPostCardList.add(northKorea2);

        //methoden aanroepen
        exchangePostCards(yourPostCardList, yourFriendsPostCardList);
        sortByCountry(yourPostCardList);
        removeDuplicates(yourPostCardList);
        giveAwayCards(yourPostCardList);
    }

    // Opdracht 1
    public static void exchangePostCards(List<PostCard> yourPostCardList, List<PostCard> yourFriendsPostCardList) {
        if (!yourPostCardList.isEmpty() && !yourFriendsPostCardList.isEmpty()) {
            yourPostCardList.set(0, yourFriendsPostCardList.get(0));

            System.out.println("After Card Exchange:");
            System.out.println("Your PostCard List: " + yourPostCardList);
            System.out.println("Your Friend's PostCard List: " + yourFriendsPostCardList);
            System.out.println();
        } else {
            System.out.println("One of the lists is empty. Cannot perform the card exchange.");
        }
    }


    //Opdracht 2

    public static void sortByCountry(List<PostCard> yourPostCardList) {
        Comparator<PostCard> byCountry = Comparator.comparing(PostCard::getCountry);
        yourPostCardList.sort(byCountry);

        System.out.println("After Sorting by Country:");
        System.out.println("Your PostCard List: " + yourPostCardList);

        System.out.println();
    }

    //Opdracht 3
    public static void removeDuplicates(List<PostCard> yourPostCardList) {
        Set<PostCard> uniqueCards = new HashSet<>(yourPostCardList);
        List<PostCard> duplicateCards = new ArrayList<>();
        for (PostCard card : uniqueCards) {
            int frequency = Collections.frequency(yourPostCardList, card);
            if (frequency > 1) {
                duplicateCards.add(card);
                yourPostCardList.removeAll(Collections.singleton(card));
            }
        }

        System.out.println("Duplicate Cards:");
        System.out.println("Number of Duplicate Cards: " + duplicateCards.size());
        System.out.println("Duplicate Cards List: " + duplicateCards);
        System.out.println("Updated Your PostCard List: " + yourPostCardList);

        System.out.println();
    }
    // Opdracht 4

    public static void giveAwayCards(List<PostCard> yourPostCardList) {
        //your friends
        Friend bobby = new Friend("Bobby", false, 3, 5);
        Friend melissa = new Friend("Melissa", false, 1, 6);
        Friend darla = new Friend("Darla", true, 14, 2);
        Friend bert = new Friend("Bert", false, 10, 4);
        Friend grandma = new Friend("Nana", true, 12, 7);
        Friend fester = new Friend("Fester", false, 1, 2);
        Friend anna = new Friend("Anna", false, 8, 4);
        PriorityQueue<Friend> sortedFriends = new PriorityQueue<>(
                Comparator.comparing(Friend::isFamily)
                        .thenComparing(Friend::getFriendShipLevel)
                        .thenComparing(Friend::getYearsKnown)
                        .reversed()
        );
        sortedFriends.offer(bobby);
        sortedFriends.offer(melissa);
        sortedFriends.offer(darla);
        sortedFriends.offer(bert);
        sortedFriends.offer(grandma);
        sortedFriends.offer(fester);
        sortedFriends.offer(anna);

        System.out.println("Giving Away Cards:");
        System.out.println("Friends Queue: " + sortedFriends);

    }

}
