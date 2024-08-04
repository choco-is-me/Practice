package Java_B;

public class AiTech extends Major{
    private String aiModel;

    public AiTech(int departmentID, String name, String creationDate, String aiModel) {
        super(departmentID, name, creationDate);
        this.aiModel = aiModel;
    }

    public void setAiModel(String aiModel) {
        this.aiModel = aiModel;
    }
    public String getAiModel() {
        return aiModel;
    }

    @Override
    public String toString() {
        return "AI Tech: " + getName() + getCreationDate(); 
    }
}
