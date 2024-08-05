package choco;

public class Application extends Major {
    private String platform;

    public Application(int DepartmentID, String name, String creationDate, String platform) {
        super(DepartmentID, name, creationDate);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Application{" +
                "platform='" + platform + '\'' +
                ", DepartmentID=" + getDepartmentID() +
                ", name='" + getName() + '\'' +
                ", creationDate='" + getCreationDate() + '\'' +
                '}';
    }
}
