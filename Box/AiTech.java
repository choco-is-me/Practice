package Box;

public class AiTech extends Major {
    private String aiModel;

    public AiTech(int departmentId, String name, String creationDate, String aiModel){
        super(departmentId, name, creationDate);
        this.aiModel=aiModel;
    }

    public String getAiModel() {
        return aiModel;
    }

    public void setAiModel(String aiModel) {
        this.aiModel = aiModel;
    }

    @Override
    public String toString() {
        return "Data:\n"+"Department ID: "+getDepartmentId()+"\nName: "+getName()+ "\nCreation Day: "+ getCreationDate() +"\nType: "+ aiModel;
    }
}
