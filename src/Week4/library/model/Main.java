package Week4.library.model;

import Week4.library.model.system.Library;
import Week4.library.model.LibraryMember;
import Week4.library.model.Book;

public class Main {
    public static void main(String[] args) {
        // Create instances of the Library class
        Library library = new Library();

        // Create some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "987654321");

        // Create library members
        LibraryMember member1 = new LibraryMember("John Doe", 1);
        LibraryMember member2 = new LibraryMember("Jane Smith", 2);

        // Add books and members to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addMember(member1);
        library.addMember(member2);

        // Demonstrate borrowing and returning books
        library.borrowBook(member1, book1);
        library.borrowBook(member2, book2);
        library.returnBook(member1, book1);
    }
}
