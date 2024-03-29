package LibrarySystem;

public interface DataService {
        boolean addBook(Book book);

        Book getBookByTitle(String title);

        boolean removeBook(Book book);

        boolean addUser(User user);

        User getUserByUsername(String username);

        boolean removeUser(User user);

        boolean borrowBook(Book book);

        boolean returnBook(Book book);

        Admin getAdminByUsername(String username);


}
