package Box;

public class Application extends Major {
    private String platform;

    public Application(int departmentId, String name, String creationDate, String platform){
        super(departmentId, name, creationDate);
        this.platform=platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Data:\n"+"Department ID: "+getDepartmentId()+"\nName: "+getName()+ "\nCreation Day: "+ getCreationDate() +"\nType: "+ platform;
    }
}
