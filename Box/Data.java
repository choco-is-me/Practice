package Box;

public class Data extends Major {
    private String type;

    public Data(int departmentId, String name, String creationDate, String type){
        super(departmentId, name, creationDate);
        this.type=type;
        }
        public String getType() {
            return type;
        }
    
        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Data:\n"+"Department ID: "+getDepartmentId()+"\nName: "+getName()+ "\nCreation Day: "+ getCreationDate() +"\nType: "+ type;
        }
}
