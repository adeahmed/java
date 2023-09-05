 class LibraryMain{
        public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("The Da Vinci Code", "Dan Brown", 2003));
        library.addBook(new Book("Le Petit Prince", "Antoine de Saint-Exupery", 1943));
        library.addBook(new Book("A Tale of Two Cities", "Charles Dickens", 1859));
        library.addBook(new Book("The Lord of the Rings", "J. R. R. Tolkien", 1954));
        System.out.println("All books in the library:");
        library.displayBooks();
        library.findBooksByAuthor("Author 1");
    }
    }
