package Books;

import java.util.HashSet;
import java.util.Set;

public class Document {
    private int id;
    private String publisherName;
    private int amount;

    private static Set<Integer> uniqueIds = new HashSet<>();

    public Document(int id, String publisherName, int amount) {
        if (!uniqueIds.add(id)) {
            throw new RuntimeException("ID already exists");
        }
        this.id = id;
        this.publisherName = publisherName;
        this.amount = amount;
    }

    public void setId(int id) {
        if (!uniqueIds.add(id)) {
            throw new RuntimeException("ID already exists");
        }
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