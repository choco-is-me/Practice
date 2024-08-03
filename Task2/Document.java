package Task2;

class Document {
    private int id;
    private String publisherName;
    private int amount;

    public Document(int id, String publisherName, int amount) {
        this.id = id;
        this.publisherName = publisherName;
        this.amount = amount;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setPubName(String publisherName) {
        this.publisherName = publisherName;
    }
    public String getPubName() {
        return publisherName;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
}