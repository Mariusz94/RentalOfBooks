class Library {
    private Book[] books;

    Library() {
        books = new Book[7];
        listOfBooks();
    }

    void showAllBooksInLibrary() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    void showHireBook() {
        for (Book book : books) {
            if (!book.isAvailable()) {
                System.out.println(book.toString());
            }
        }
    }

    void showAvailableBook() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.toString());
            }
        }
    }

    private void listOfBooks() {
        books[0] = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997, true);
        books[1] = new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", 1998, true);
        books[2] = new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 1999, true);
        books[3] = new Book("Harry Potter and the Goblet of Fire", "J.K. Rowling", 2000, false);
        books[4] = new Book("Harry Potter and the Order of the Phoenix", "J.K. Rowling", 2003, true);
        books[5] = new Book("Harry Potter and the Half-Blood Prince", "J.K. Rowling", 2005, true);
        books[6] = new Book("Harry Potter and the Deathly Hallows", "J.K. Rowling", 2007, true);
    }

    Book[] getBooks() {
        return books;
    }
}
