package BookScan;

public class Newspaper extends Document{
    private String publishDate;

    public Newspaper(int id, String publisherName, int amount, String publishDate) {
        super(id, publisherName, amount);
        this.publishDate = publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
    public String getPublishDate() {
        return publishDate;
    }
    
    @Override
    public String toString() {
        return "Newspaper: " +  getId() + getPubName() + getAmount() + getPublishDate();
    }
}
