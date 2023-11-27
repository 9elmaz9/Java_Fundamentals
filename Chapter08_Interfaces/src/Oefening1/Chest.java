package Oefening1;

public class Chest implements Lock {
//implementeer () van de Lock interfase
   @Override
   public void lock() {
      System.out.println("Chest is locked!");


   }

   @Override
   public void unlock() {
      System.out.println("Chest is locked!");

   }
}
