package Week4.library.model.system;

import Week4.library.model.Book;
import Week4.library.model.LibraryMember;


import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<LibraryMember> members = new ArrayList<>();

    public void addBook(Book book) {
        this.books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addMember(LibraryMember member) {
        this.members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    public void borrowBook(LibraryMember member, Book book) {
        member.getBorrowedBooks().add(book);
        this.books.remove(book);
        System.out.println("Book borrowed: " + book.getTitle());
    }

    public void returnBook(LibraryMember member, Book book) {
        member.getBorrowedBooks().remove(book);
        this.books.add(book);
        System.out.println("Book returned: " + book.getTitle());
    }
}