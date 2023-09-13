package Week4.library.model;
import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int memberID;
    private List<Book> borrowedBooks;

    public LibraryMember(String name, int memberID) {
        this.name = name;
        this.memberID = memberID;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getter and setter methods for name and memberID
    public String getName() {
        return name;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }
    



    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}
