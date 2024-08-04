package Java_B;

public class Major {
    private int departmentID;
    private String name;
    private String creationDate;

    public Major(int departmentID, String name, String creationDate) {
        this.departmentID = departmentID;
        this.name = name;
        this.creationDate = creationDate;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }
    public int getDepartmentID() {
        return departmentID;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    public String getCreationDate() {
        return creationDate;
    }
}
