package choco;

public class Major {
    private int DepartmentID;
    private String name;
    private String creationDate;

    public Major(int DepartmentID, String name, String creationDate) {
        this.DepartmentID = DepartmentID;
        this.name = name;
        this.creationDate = creationDate;
    }

    public int getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.DepartmentID = departmentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
