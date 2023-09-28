package be.intecbrussel.Les2;

public class InsertExample {

    /* Methodie insert()

    Mogelijk om tekst toe te voegen aan ons object op een bepaalde plaats
    / mozhno vstavit slovo kyda ygodno so znakom prepinania
    */

    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("walter,mike");

        str.insert(6,",edwin");
        System.out.println(str);

    }
}
