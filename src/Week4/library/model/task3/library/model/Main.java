package Week4.library.model.task3.library.model;

import Week4.library.model.task3.library.model.system.Library;
import Week4.library.model.task3.library.model.system.LibraryMember;
import Week4.library.model.task3.library.model.system.Book;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryMember member1 = new LibraryMember("Ade");
        Book book1 = new Book("The Lord of the Rings", "J. R. R. Tolkien", "978-0261103252");
        library.addMember(member1);
        library.addBook(book1);
        library.borrowBook(member1, book1);
        library.returnBook(member1, book1);

        library.reserveBook(member1, book1);
        library.displayReservedBooks();
        System.out.println();

        library.cancelReserve(member1, book1);
        library.displayReservedBooks();
    }
}