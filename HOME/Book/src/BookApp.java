import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;


public class BookApp {
    public static void main(String[] args) {

        //Creatie: een Book array
        Book[] books = createBooksArray();

        //Roep de vijf statische methoden aan
        System.out.println("\n***\n");
        getNewestBook(books);
        System.out.println("\n***\n");
        printYoungestWriter(books);
        System.out.println("\n***\n");
        System.out.println("  Book names in alphabetical order: ");
        printSortedByTitle(books);
        System.out.println("\n***\n");
        System.out.println("  Number of books by author: ");
        countBooksPerAuthor(books);
        System.out.println("\n***\n");
        System.out.print("  Published in 2016 -");
        printBooksReleasedIn2016(books);
    }

    //()Methode voor het maken van een array boeken
    private static Book[] createBooksArray() {
        Person author1 = new Person("Gabrielle ", "Zevin ", LocalDate.of(1977, 10, 24));

        Person author2 = new Person("Joan ", "Didion ", LocalDate.of(1903, 6, 25));

        Person author3 = new Person("Joey ", "Benun ", LocalDate.of(1997, 9, 9));

        Person author4 = new Person("James ", "Clear ", LocalDate.of(1926, 4, 28));

        Person author5 = new Person("John ", "Tolkien ", LocalDate.of(1892, 9, 2));
        //Om book obj aan te maken - person obj nodig(de authors)
        return new Book[]{
                new Book(" Day next and Tomorrow, and Tomorrow ", author1, LocalDate.of(1997, 2, 13), " Psychology "),
                new Book(" The Year of Magical Thinking ", author2, LocalDate.of(2023, 6, 8), " Classics "),
                new Book(" Pebbles and the Biggest Number ", author3, LocalDate.of(2021, 1, 23), " Science "),
                new Book(" Atomic Habits ", author4, LocalDate.of(2016, 10, 16), " Business " ),
                new Book(" Hobbit ",author5, LocalDate.of(1937, 9, 21), " Southern Gothic ")

        };
    }


    // ::reference operator

    //Deze method geeft het nieuwste boek terug
    public static void getNewestBook(Book[] books) { //stream- potok
        Book newestBook = Arrays.stream(books)
                .max(Comparator.comparing(Book::getReleaseDate))
                .orElse(null);
        System.out.println("Newest Book: " + newestBook);
    }

    //Deze method print de jongste schrijver af.
    public static void printYoungestWriter(Book[] books) {
        Person youngestWriter = Arrays.stream(books)
                .max(Comparator.comparing(book -> book.getAuthor().getDateOfBirth()))
                .map(Book::getAuthor)
                .orElse(null);
        System.out.println("Youngest Writer: " + youngestWriter);
    }

    //Deze methode voor het sorteren en printen van boeken op titel(in alfabetische volgorde)
    public static void printSortedByTitle(Book[] books) {
        Arrays.stream(books)
                .sorted(Comparator.comparing(Book::getTitle)) // Book -de klasse waarin de methode wordt aangeroepen.
                .forEach(System.out::println);
    }

    //Deze methode voor het tellen van boeken per auteur en printen van resultaat
    public static void countBooksPerAuthor(Book[] books) {
        Map<Person, Long> booksPerAuthor = Arrays.stream(books)       //the keys are authors(Person obj)and the values are the count of books written by each author
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));

        booksPerAuthor.forEach((author, count) -> System.out.println( author.getFirstName() + " " + author.getLastName() + ": "+ count + " book(s)"));
    }

    //Deze methode voor het printen van boeken gereleased in 2016
    public static void printBooksReleasedIn2016(Book[] books) {
        Arrays.stream(books)
                .filter(book -> book.getReleaseDate().getYear() == 2016)
                .forEach(System.out::println);



    }

    }


//This Java code represents a simple application, BookApp, that works with an array of Book objects and performs various operations using Java streams. Here's a breakdown of the code:

Book Class:

The Book class has attributes like title, author, release date, and genre.
There is also a Person class representing the author, with attributes such as first name, last name, and date of birth.
The Book class has a constructor to create book objects.
BookApp Class:

The BookApp class contains the main method, which is the entry point of the application.
A static method createBooksArray is defined to create an array of Book objects with sample data.
The application performs the following operations using Java streams:
Get Newest Book:
Uses the max function with a comparator based on release date to find the newest book.
Print Youngest Writer:
Uses the max function with a comparator based on the author's date of birth to find the youngest writer.
Print Books Sorted by Title:
Uses the sorted function with a comparator based on the book title to print books in alphabetical order.
Count Books per Author:
Uses the groupingBy collector to group books by author and the counting collector to count the number of books per author.
Print Books Released in 2016:
Uses the filter function to select books released in the year 2016 and prints them.
Note:

The :: reference operator is used in the method references, making the code concise.
Java streams are employed to perform operations on the array of books in a functional programming style.
Overall, the BookApp class demonstrates the use of Java streams for processing a collection of books and extracting specific information, such as the newest book, youngest writer, sorted book list, book count per author, and books released in a particular year.
