 
 class LibraryMain{
        public static void main(String[] args) {
        Library library = new Library();
        System.out.println("All books in the library:");
        Book book1 = new Book("The Da Vinci Code", "Dan Brown", 2003);
        Book book2 = new Book("A Tale of Two Cities", "Charles Dickens", 1859);
        Book book3 = new Book("The Lord of the Rings", "J. R. R. Tolkien", 1954);
        Book book4 = new Book("The Hobbit", "J. R. R. Tolkien", 1937);
        book1.setRating(4.5);
        book2.setRating(4.0);
        book3.setRating(4.8);
        book4.setRating(4.9);

        book1.addReview("Great book");
        book1.addReview("I loved it");
        book2.addReview("I hated it");
       


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
    
        User john = new User("John Doe", 20);
        User Leksa = new User("Leksa Do", 20);
        User Matti = new User("Matti D", 20);
        User Leo = new User("Leo Dillo", 20);


        library.addUser(john);
        library.addUser(Leksa);
        library.addUser(Matti);
        library.addUser(Leo);


        john.borrowBook(library, "The Da Vinci Code");
        Leksa.borrowBook(library, "The Da Vinci Code");
        library.getAverageBookRating();
        library.MostReviewedBook();
        library.displayBooks();


    }
    }
