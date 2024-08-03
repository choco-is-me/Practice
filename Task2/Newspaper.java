package Task2;

public class Newspaper extends Document{
    private int publishDate;

    public Newspaper(int id, String publisherName, int amount, int publishDate) {
        super(id, publisherName, amount);
        this.publishDate = publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }
    public int getPublishDate() {
        return publishDate;
    }
    
}
