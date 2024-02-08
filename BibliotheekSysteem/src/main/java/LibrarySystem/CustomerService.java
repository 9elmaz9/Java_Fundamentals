package LibrarySystem;

public class CustomerService  {
    private DataService dataService;

    public CustomerService(DataService dataService) {
        this.dataService = dataService;
    }

    // Методы для работы с книгами
    public boolean addBook(String title, String author) {
        Book book = new Book(title, author);
        return dataService.addBook(book);
    }

    public boolean deleteBook(String title) {
        Book book = dataService.getBookByTitle(title);
        if (book != null) {
            return dataService.removeBook(book);
        }
        return false;
    }

    public boolean editBookInformation(String title, String newTitle, String newAuthor) {
        Book book = dataService.getBookByTitle(title);
        if (book != null) {
            // Edit book information
            book.setTitle(newTitle);
            book.setAuthor(newAuthor);
            return true;
        }
        return false;
    }

    // Methods for working with the administrator
    public boolean loginAsAdmin(String username, String password) {
        Admin admin = dataService.getAdminByUsername(username);
        if (admin != null && admin.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public boolean addBookAsAdmin(String username, String password, String title, String author) {
        // Check if logged in as admin
        if (loginAsAdmin(username, password)) {
            Book book = new Book(title, author);
            return dataService.addBook(book);
        }
        return false;
    }

    public boolean deleteBookAsAdmin(String username, String password, String title) {
        // Check if logged in as admin
        if (loginAsAdmin(username, password)) {
            Book book = dataService.getBookByTitle(title);
            if (book != null) {
                return dataService.removeBook(book);
            }
        }
        return false;
    }

    public boolean editBookInformationAsAdmin(String username, String password, String title, String newTitle, String newAuthor) {
        // Check if logged in as admin
        if (loginAsAdmin(username, password)) {
            Book book = dataService.getBookByTitle(title);
            if (book != null) {
                // Edit book information
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
                return true;
            }
        }
        return false;
    }
}

