import java.awt.print.Book;
import java.time.LocalDate;

public class BookApp {
    public static void main(String[] args) {
        // Maak een array van boeken , book obj maken , nodig person obj de author
        Book[] books = new Book[]{
        // Voeg boeken toe aan de array
         new Book(),
         new Book(),
         new Book(),
         new Book(),
         new Book(),
        };
        //  Book[] books = new Book[5]{ - andere manier etc
       //   books[0]= new Book(){};-  tot 4


        //book obj maken , nodig person obj de author
        Person author1= new Person("A", "A", LocalDate.of(1995,12,12));
        Person author2= new Person("A", "A", LocalDate.of(1995,12,12));
        Person author3= new Person("A", "A", LocalDate.of(1995,12,12));
        Person author4= new Person("A", "A", LocalDate.of(1995,12,12));
        Person author5= new Person("A", "A", LocalDate.of(1995,12,12));


        // We doorlopen de array en drukken informatie over het boek af
        for (Book book:books) {
            System.out.println();

        }


    }
}