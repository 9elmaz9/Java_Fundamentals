package Bank;

public class Main {
    public static void main(String[] args) {
        Bank bankrekening = new Bank();

        //Voorbeeld van een salaris van een werknemer
        int jouwSalaris = 2500;

        //Voeg het salaris aan de bankrekening toe aan het begin van de maand
        bankrekening.addAmountPerMonth(jouwSalaris);

        //Voorbeeld van een bedrag voor rekeningen
        int bedragRekeningen = 1500;

        //Betaal de rekeningen
        bankrekening.payBills(bedragRekeningen);

        //Toon de status van de bankrekening op het scherm
        System.out.println("Bankrekening Status:");
        System.out.println("Totaal Geld: " + bankrekening.getMonetBankAccount());
        System.out.println("Genoeg Geld aanwezig?" + bankrekening.isEnoughOnBankAccount());
    }
}
