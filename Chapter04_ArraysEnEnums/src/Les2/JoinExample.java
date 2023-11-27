package Les2;

public class JoinExample {
    public static void main(String[] args) {

        String[] strArrayToString = {"Intec", "Brussels", "is", "the", "best"};

        //De array pmzetten naar string met een spatie tussen de woorden
        String itIsNowAString = String.join(" ", strArrayToString);

        //DE array omzetten naar string met een koppelstreepje tussen de woorden
        String itIsNowAStringWithHyphen = String.join("-", strArrayToString);

        //printen van de nieuwe string
        System.out.println(itIsNowAString);
        System.out.println(itIsNowAStringWithHyphen);

    }
}
