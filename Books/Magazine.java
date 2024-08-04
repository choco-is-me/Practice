package Books;

public class Magazine extends Document{
    private int publishNum;
    private int publishMonth;

    public Magazine(int id, String publisherName, int amount, int publishNum, int publishMonth) {
        super(id, publisherName, amount);
        this.publishNum = publishNum;
        this.publishMonth = publishMonth;
    }

    public void setPublishNum(int publishNum) {
        this.publishNum = publishNum;
    }
    public int getPublishNum() {
        return publishNum;
    }

    public void setPublishMonth(int publishMonth) {
        this.publishMonth = publishMonth;
    }
    public int getPublishMonth() {
        return publishMonth;
    }

    @Override
    public String toString() {
        return "Book: " +  getId() + getPubName() + getAmount() + getPublishNum() + getPublishMonth();
    }
}
