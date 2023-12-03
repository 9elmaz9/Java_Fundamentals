import java.util.*;

public class Main {
    public static void main(String[] args) {
//my cards
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


        List<PostCard> yourPostCardList = new ArrayList<>();
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

        //my friend's cards
        PostCard northKorea = new PostCard("North Korea", "Asia");
        PostCard usa2 = new PostCard("United States of America", "North America");
        PostCard botswana = new PostCard("Botswana", "Africa");
        PostCard northKorea2 = new PostCard("North Korea", "Asia");

        List<PostCard> yourFriendsPostCardList = new ArrayList<>();
        yourFriendsPostCardList.add(northKorea);
        yourFriendsPostCardList.add(usa2);
        yourFriendsPostCardList.add(botswana);
        yourFriendsPostCardList.add(northKorea2);


        //your friends
        Friend bobby = new Friend("Bobby ", false, 3, 5);
        Friend melissa = new Friend("Melissa", false, 1, 6);
        Friend darla = new Friend("Darla", true, 14, 2);
        Friend bert = new Friend("Bert", false, 10, 4);
        Friend grandma = new Friend("Nana", true, 12, 7);
        Friend fester = new Friend("Fester", false, 1, 2);
        Friend anna = new Friend("Anna", false, 8, 4);

//oefenning1
//offering
        tradeWithFriend(melissa, yourPostCardList, yourFriendsPostCardList);
        System.out.println("\n your" + yourPostCardList);
        System.out.println("\n Your friend" + yourFriendsPostCardList);
//oefening2
// sort
        sortPostCardByCountry(yourPostCardList);
        System.out.println("\n Your PostCards sorted by country"
                + yourPostCardList);

//oefening3
//remove dupliacat  - new list unique postcard
//  () inform how much the number of duplicates for each country
        List<PostCard> uniquePostCard = removeDuplicates((yourPostCardList));
        System.out.println(" \n Original PostCard : " + yourPostCardList);
        System.out.println(" \n Unique POstCards "+ uniquePostCard);



    }
// oefening1

    // exchange any card for a new one
    private static PostCard friendTrade(Friend friend, PostCard cardChange) {
        return new PostCard(cardChange.getCountry(), cardChange.getCountry());
    }
    // private static PostCard friendTrade part

    private static void tradeWithFriend(Friend friend, List<PostCard> yourList, List<PostCard> friendList) {
        for (PostCard card : friendList) { //sort through card
            if (!yourList.contains(card)) { // if not - start trade
                PostCard yourNewCard = friendTrade(friend, card); // roep method
                int index = friendList.indexOf(card);
                yourList.add(index, yourNewCard); // new cardadd in your list
                break;
            }
        }

    }

    //oefening2
    //   kard sorteren per land

    private static void sortPostCardByCountry(List<PostCard> postCardList) { // that takes a List
//comparator to sort// }
        Comparator<PostCard> countryComparator = Comparator.comparing(PostCard::getCountry); //takes a function  to extract the sorting key : getCountry - postCardclass
        Collections.sort(postCardList, countryComparator);
    }


    //oefening3
    //hoeveel kaarten van een bepaalde land
    // zonder duplicate

    private static List<PostCard> removeDuplicates(List<PostCard> postCardList) {
        Set<PostCard> uniqueSet = new HashSet<>(postCardList); //set  auto remove duplicat
        List<PostCard> uniquePostCards = new ArrayList<>(uniqueSet); // created from the uniqueSet


        //Collections.frequency to determine the number of occurrences of each card in the original list.
        for (PostCard uniqueCard : uniquePostCards) {
            int frequency = Collections.frequency(postCardList, uniqueCard);
            if (frequency > 1) { // // if the frequency >1 = duplicat -> () - amount dupliccat
                System.out.println("\n You have  " + (frequency - 1) + " Duplicates of " + uniqueCard.getCountry());
            }
        }
        return uniquePostCards; // ()returns the list of unique postcards.

    }
}



