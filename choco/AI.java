package choco;

public class AI extends Major {
    private String AIModel;

    public AI(int DepartmentID, String name, String creationDate, String AIModel) {
        super(DepartmentID, name, creationDate);
        this.AIModel = AIModel;
    }

    public String getAIModel() {
        return AIModel;
    }

    public void setAIModel(String AIModel) {
        this.AIModel = AIModel;
    }

    @Override
    public String toString() {
        return "AI{" +
                "AIModel='" + AIModel + '\'' +
                ", DepartmentID=" + getDepartmentID() +
                ", name='" + getName() + '\'' +
                ", creationDate='" + getCreationDate() + '\'' +
                '}';
    }
}
