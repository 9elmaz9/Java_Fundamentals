import java.util.Scanner;

public class ExceptionExample5 {
    public static void main(String[] args) {
        String sLeeftijd;
        int iLeeftijd;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef je leeftijd in");
        sLeeftijd = scanner.nextLine();

        //controle of leeftid een geheel getal bevat of niet
        try {
            iLeeftijd = Integer.parseInt(sLeeftijd);//kan ook via Double.parseDouble of Float.parseFloat
            System.out.println("Jouw leeftijd");
        } catch (NumberFormatException nfe) { // de numerieke waardde (numberformat) klpot niet
            System.out.println("Err : leeftijd geen numerieke waarde");
        }
    }

}