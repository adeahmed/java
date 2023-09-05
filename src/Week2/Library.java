import java.util.ArrayList;
class Library {
    private ArrayList<Book> books;
    public Library(){
        books = new ArrayList<Book>();
    }
    public void addBook(Book newBook){
        books.add(newBook);
    }
    public void displayBooks(){
        for(Book book : books){
            System.out.println(book);
        }
    }
        public void findBooksByAuthor(String author) {
        System.out.println("Books by author '" + author + "':");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book);
            }
        }
    }
}


   
