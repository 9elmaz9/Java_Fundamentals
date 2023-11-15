import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class BookAp {

    public static void main(String[] args) {
        // Stap 1: Creatir : een Book array
        Book[] books = createBooksArray();

        // Stap 2: Roep de vijf statische methoden aan
        System.out.println("\n***\n");
        getNewestBook(books);
        System.out.println("\n***\n");
        printYoungestWriter(books);
        System.out.println("\n***\n");
        printSortedByTitle(books);
        System.out.println("\n***\n");
        countBooksPerAuthor(books);
        System.out.println("\n***\n");
        printBooksReleasedIn2016(books);
    }

    // Stap 1:()Methode voor het maken van een array boeken
    private static Book[] createBooksArray() {
        Person author1 = new Person(" Gabrielle ", "Zevin ", LocalDate.of(1977, 10, 24));

        Person author2 = new Person(" Joan ", "Didion ", LocalDate.of(1903, 6, 25));

        Person author3 = new Person(" Joey ", "Benun ", LocalDate.of(1997, 9, 9));

        Person author4 = new Person(" James ", "Clear ", LocalDate.of(1926, 4, 28));

        Person author5 = new Person(" John ", "Tolkien ", LocalDate.of(1892, 9, 2));
        //Om book obj aan te maken - person obj nodig(de authors)
        return new Book[]{
                new Book(" Tomorrow, and Tomorrow, and Tomorrow ", author1, LocalDate.of(1997, 2, 13), " Psychology "),
                new Book(" The Year of Magical Thinking ", author2, LocalDate.of(2007, 6, 8), " Classics "),
                new Book(" Pebbles and the Biggest Number ", author3, LocalDate.of(2024, 1, 23), " Science "),
                new Book(" Atomic Habits ", author4, LocalDate.of(2018, 10, 16), " Business " ),
                new Book(" The Hobbit ",author5, LocalDate.of(1937, 9, 21), " Southern Gothic ")

        };
    }

    // Stap 2:Deze () geeft het nieuwste boek terug
    public static void getNewestBook(Book[] books) { //stream- potok
        Book newestBook = Arrays.stream(books)
                .max(Comparator.comparing(Book::getReleaseDate))
                .orElse(null);
        System.out.println("Newest Book: " + newestBook);
    }

    // Stap 2.2: Methode voor het printen van de jongste schrijver
    public static void printYoungestWriter(Book[] books) {
        Person youngestWriter = Arrays.stream(books)
                .min(Comparator.comparing(book -> book.getAuthor().getDateOfBirth()))
                .map(Book::getAuthor)
                .orElse(null);
        System.out.println("Youngest Writer: " + youngestWriter);
    }

    // Stap 2.3: Methode voor het sorteren en printen van boeken op titel
    public static void printSortedByTitle(Book[] books) {
        Arrays.stream(books)
                .sorted(Comparator.comparing(Book::getTitle))
                .forEach(System.out::println);
    }

    // Stap 2.4: Methode voor het tellen van boeken per auteur en printen van resultaat
    public static void countBooksPerAuthor(Book[] books) {
        Map<Person, Long> booksPerAuthor = Arrays.stream(books)
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));

        booksPerAuthor.forEach((author, count) ->
                System.out.println(author.getFirstName() + " " + author.getLastName() + ": " + count + " book(s)"));
    }

    // Stap 2.5: Methode voor het printen van boeken gereleased in 2016
    public static void printBooksReleasedIn2016(Book[] books) {
        Arrays.stream(books)
                .filter(book -> book.getReleaseDate().getYear() == 2016)
                .forEach(System.out::println);
    }
}
