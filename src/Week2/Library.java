
import java.util.ArrayList;
import java.util.Iterator;

class Library {
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<User> users = new ArrayList<User>();

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }
    public void addUser(User newUser){
        users.add(newUser);
    }
    public void getAverageBookRating(){
        double sum = 0.0;
        for (Book book : books){
            sum += book.getRating();
        }
        System.out.println("Average book rating: " + sum/books.size());
    }
    public void MostReviewedBook(){
        Book mostReviewedBook = books.get(0);
        for (Book book : books){
            if (book.getReviews().size() > mostReviewedBook.getReviews().size()){
                mostReviewedBook = book;
            }
        }
        System.out.println("Most reviewed book: " + mostReviewedBook.getTitle());
    }
    public void displayUsers(){
        for (User user : users){
            System.out.printf("Name: %s, Age: %d \n", user.getName(), user.getAge());
        }
    }


    public void displayBooks() {
        for (Book book : books) {
            System.out.printf("Title: %s, Author: %s, Publication Year: %d \n",
                    book.getTitle(), book.getAuthor(), book.getPublicationYear());
        }
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle() != null && book.getTitle().equalsIgnoreCase(title) && !book.isBorrowed()) {
                return true;
            }
        }
        return false;
    }


     Book borrowBook(String title) {
        Iterator<Book> iterator = books.iterator();
        Book book = null;
        while (iterator.hasNext()) {
            book = iterator.next();
            if (book.getTitle() != null && book.getTitle().equalsIgnoreCase(title) && !book.isBorrowed()) {
                book.setBorrowed(true);
                System.out.println("You have borrowed the book: " + book.getTitle());
                
            }
        }
        System.out.println("Book with title '" + title + "' not found in the library or is already borrowed.");
        return book;
    }

    // Return a book to the library
    public void returnBook(Book book) {
        if (book != null && book.isBorrowed()) {
            book.setBorrowed(false);
            System.out.println("You have returned the book: " + book.getTitle());
        } else {
            System.out.println("Book not found in the library or is not currently borrowed.");
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by author '" + author + "':");
        for (Book book : books) {
            if (book.getAuthor() != null && book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book);
            }
        }
    }
}

