package Oefening1;
//hoofdprogramma+ startpunt
public class Main {
    public static void main(String[] args) {

        //creeren obj
        Chest myChest = new Chest();

        //roep de lock en unlock method aan van het Chest obj
        myChest.lock();
        myChest.unlock();
    }
}
