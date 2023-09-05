import java.util.ArrayList;
import java.util.List;
class User {
    private String name;
    private int age;
    private List<Book> borrowedBooks;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
    }

    void borrowBook(Library library, String title) {
        if (library.isBookAvailable(title)) {
         borrowedBooks.add(library.borrowBook(title));
        } else {
            System.out.println("Book is not available");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book bookTitle) {
        borrowedBooks.add(bookTitle);
    }

    public void returnBook(String bookTitle) {
        borrowedBooks.remove(bookTitle);
    }
}