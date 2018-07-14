public class Book {
    private String title;
    private String author;
    private int publicationDate;
    private boolean isAvailable;

    public Book(String title, String author, int publicationDate, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title: '" + title + '\'' +
                ", author: '" + author + '\'' +
                ", publication date: " + publicationDate +
                ", is available: " + isAvailable +
                '}';
    }
}
