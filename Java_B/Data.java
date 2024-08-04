package Java_B;

public class Data extends Major{
    private String type;

    public Data(int departmentID, String name, String creationDate, String type) {
        super(departmentID, name, creationDate);
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Data Tech: " + getName() + getCreationDate() + getType(); 
    }
}
