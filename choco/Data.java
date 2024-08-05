package choco;

public class Data extends Major {
    private String type;

    public Data(int DepartmentID, String name, String creationDate, String type) {
        super(DepartmentID, name, creationDate);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Data{" +
                "type='" + type + '\'' +
                ", DepartmentID=" + getDepartmentID() +
                ", name='" + getName() + '\'' +
                ", creationDate='" + getCreationDate() + '\'' +
                '}';
    }
}
