package Java_B;

public class Application extends Major{
    private String platform;

    public Application(int departmentID, String name, String creationDate, String platform) {
        super(departmentID, name, creationDate);
        this.platform = platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public String getPlatform() {
        return platform;
    }

    @Override
    public String toString() {
        return "App Tech: " + getName() + getCreationDate() + getPlatform(); 
    }
}
