package Task2;

public class Book extends Document{
    private String author;
    private int pages;

    public Book(int id, String publisherName, int amount, String author, int pages) {
        super(id, publisherName, amount);
        this.author = author;
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    public int getPages() {
        return pages;
    }
}
